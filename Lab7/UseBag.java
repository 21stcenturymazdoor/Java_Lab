/**
 * Use class for Bag
 * 
 * uses Aggregration to create a Bag of Books
 * allows user to create books, add them to the bag,
 * remove them from the bag, and read the books.
 * 
 * Uses Composition to create a Book with Pages.
 * Allows user to create a book with multiple pages,
 * add content to each page, and read the book.
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.ArrayList;
import java.util.Scanner;

import Bag_Books_Pages.*;

class UseBag
{
    public static void shelfMenu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Create Book");
        System.out.println("2.Add Book to Bag");
        System.out.println("3.Remove Book from Shelf (Book Deleted)");
        System.out.println("4.List All Books on Shelf");
        System.out.println("5.Move to Bag Menu");
        System.out.print("Enter your choice :: ");

    }

    public static void menu(){
        System.out.println("---BAG MENU---");
        System.out.println("0.Exit to Shelf Menu");
        System.out.println("1.Search Book with specified keyword");
        System.out.println("2.Search Book with highest frequency of a keyword");
        System.out.println("4.List All Books in Bag");
        System.out.println("5.Read a Book");
        System.out.print("Enter your choice :: ");
    }
    
    static Book createBook(Scanner sc){
        System.out.print("Author Name :: ");
        String auth = sc.nextLine();
        System.out.print("Book Name   :: ");
        String title = sc.nextLine();
        
        Book book = new Book(auth, title);
        
        System.out.print("Enter number of pages :: ");
        int totalPage = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0 ; i < totalPage ; i++){
            String content;
            System.out.print("Enter content for page " + (i + 1) + " :: ");
            content = sc.nextLine();
            book.addPage(content);
        }
        
        return book;
    }
    
    static void printShelfBooks(ArrayList<Book> shelf) {
        if (shelf.isEmpty()) {
            System.out.println("No Books on Shelf");
            return;
        }
        System.out.println("--------------\nAUTHOR : BOOK\n--------------");
        for (int i = 0; i < shelf.size(); i++) {
            Book book = shelf.get(i);
            System.out.println((i + 1) + ". " + book.getAuthor() + " : " + book.getBookName());
        }
    }

    public static void main(String[] args){
        System.out.println("---Bag Simulation---");
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> shelf = new ArrayList<>();
        System.out.println("Shelf created to hold books");
        
        System.out.println("Creating a Bag");
        Bag bag = new Bag();
        System.out.println("Bag of size 10 Created");
        
        int choice;
        
        while(true){
            shelfMenu();
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    Book book = createBook(sc);
                    System.out.println("Book Created Successfully");
                    shelf.add(book);
                }
                case 2 -> {        
                    printShelfBooks(shelf);
                    System.out.print("Select a book to add to the bag :: ");
                    int bookChoice = sc.nextInt() - 1;
                    if (bookChoice >= 0 && bookChoice < shelf.size()) {
                        bag.insertBook(shelf.remove(bookChoice));
                        System.out.println("Book Moved from Shelf to Bag");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
                case 3 -> {
                    printShelfBooks(shelf);
                    System.out.print("Select a book to remove from shelf :: ");
                    int bookChoice = sc.nextInt() - 1;
                    if (bookChoice >= 0 && bookChoice < shelf.size()) {
                        shelf.remove(bookChoice);
                        System.out.println("Book Removed from Shelf");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
                case 4 -> printShelfBooks(shelf);
                case 5 -> {
                    int bagChoice;
                    do {
                        menu();
                        bagChoice = sc.nextInt();
                        sc.nextLine();
                        switch (bagChoice) {
                            case 0 -> System.out.println("Returning to Shelf Menu...");
                            case 1 -> {
                                System.out.print("Enter keyword to search: ");
                                String keyword = sc.nextLine();
                                Book[] foundBooks = bag.searchBooksByKeyword(keyword);
                                if (foundBooks.length > 0) {
                                    System.out.println("Books containing '" + keyword + "':");
                                    for (Book book : foundBooks) {
                                        System.out.println(book.getAuthor() + " : " + book.getBookName());
                                    }
                                } else {
                                    System.out.println("No books found with the keyword '" + keyword + "'.");
                                }
                            }
                            case 2 -> {
                                System.out.print("Enter keyword to find highest frequency: ");
                                String keyword = sc.nextLine();
                                Book maxBook = bag.searchBookWithMostFrequency(keyword);
                                if (maxBook != null) {
                                    System.out.println("Book with highest frequency of '" + keyword + "':");
                                    System.out.println(maxBook.getAuthor() + " : " + maxBook.getBookName());
                                } else {
                                    System.out.println("No books found with the keyword '" + keyword + "'.");
                                }
                            }
                            case 4 -> System.out.println(bag.showAllBooks());
                            case 5 -> {
                                System.out.print("Enter the title of the book to read: ");
                                String title = sc.nextLine();
                                if (!bag.readBook(title)) {
                                    System.out.println("Book not found in the bag.");
                                }
                            }
                            default -> System.out.println("Invalid choice. Try again.");
                        }
                    } while (bagChoice != 0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

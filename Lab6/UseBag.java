/**
 * Use class for Bag
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.Scanner;

public class UseBag
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Create and Add Book");
        System.out.println("2.Search Book with specified keyword");
        System.out.println("3.Search Book with highest frequency of a keyword");
        System.out.println("4.List All Books in Bag");
        //System.out.println("5.Read a Book"); to be added later
        System.out.print("Enter your choice :: ");
    }
    
    static Page createPage(Scanner sc, int pageNo){
        System.out.print("Enter content of page "+pageNo+" :: ");
        String text = sc.nextLine();
        return new Page(text);
    }
    
    static Book createBook(Scanner sc){
        System.out.println("Author Name :: ");
        String auth = sc.nextLine();
        System.out.println("Book Name   :: ");
        String title = sc.nextLine();
        
        Book book = new Book(auth, title);
        
        System.out.println("Enter number of pages :: ");
        int totalPage = sc.nextInt();
        
        for(int i = 0 ; i < totalPage ; i++){
            book.addPage(createPage(sc, i+1));
        }
        
        return book;
    }
    
    public static void main(String[] args){
        System.out.println("---Bag Simulation---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a Bag");
        Bag bag = new Bag();
        System.out.println("Bag Created");
        
        int choice;
        
        while(true){
            menu();
            choice = sc.nextInt();
            
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    sc.nextLine();
                    Book book = createBook(sc);
                    bag.insertBook(book);
                    System.out.println("Book added to the bag.");
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("Enter keyword to search for books: ");
                    String keyword = sc.nextLine();
                    Book[] foundBooks = bag.searchBooksByKeyword(keyword);
                    
                    if (foundBooks.length > 0) {
                        System.out.println("Books containing the keyword '" + keyword + "':");
                        for (Book b : foundBooks) {
                            System.out.println(b.getAuthor() + " : " + b.getBookName());
                        }
                    } else {
                        System.out.println("No books found with the keyword '" + keyword + "'.");
                    }
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter keyword to find book with highest frequency: ");
                    String keyword = sc.nextLine();
                    Book maxBook = bag.searchBookWithMostFrequency(keyword);
                    
                    if (maxBook != null) {
                        System.out.println("Book with highest frequency of '" + keyword + "':");
                        System.out.println(maxBook.getAuthor() + " : " + maxBook.getBookName());
                    } else {
                        System.out.println("No books found with the keyword '" + keyword + "'.");
                    }
                }
                case 4 -> {
                    System.out.println(bag.showAllBooks());
                }
                // case 5 -> { // To be added later
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

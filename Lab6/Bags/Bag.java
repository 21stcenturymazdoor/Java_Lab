package Bags;

/**
 * The Bag class represents a bag that can contain
 * maximum 10 books
 *
 * @author (21stcenturymazdoor)
 * @version (15/06/2025)
 */
import java.util.ArrayList;

public class Bag
{
    // instance variables
    private Book[] books;
    private int size;
    
    public Bag(){
        this.size = 0;
        this.books = new Book[10];
    }
    
    boolean isFull(){
        return size == books.length;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    public void insertBook(Book book){
        if(isFull()){
            System.out.println("Bag Full. Cannot insert Book");
            return;
        }
        
        books[size++] = book;
    }
    
    public Book[] searchBooksByKeyword(String keyword){
        ArrayList<Book> containsKeyword = new ArrayList<>();
        
        for(int i = 0; i < size; i++){
            Book book = books[i];
            if(book.countKeywordFrequency(keyword) > 0){
                containsKeyword.add(book);
            }
        }
        
        return containsKeyword.toArray(new Book[containsKeyword.size()]);
    }
    
    public Book searchBookWithMostFrequency(String keyword){
        Book maxedBook = null;
        int maxFrequency = 0;
        
        for(int i = 0; i < size; i++){
            Book book = books[i];
            int frequency = book.countKeywordFrequency(keyword);
            if(frequency > maxFrequency){
                maxedBook = book;
                maxFrequency = frequency;
            }
        }
        return maxedBook;
    }
    
    public String showAllBooks(){
        if(isEmpty()){
            return " No Books in the Bag";
        }
        String str = "Author : Book \n---------------\n";
        
        for(int i = 0; i < size; i++){
            Book book = books[i];
            str += book.getAuthor() + " : " + book.getBookName() + "\n";
        }
        
        return str;
    }
    

    public boolean readBook(String title){
        for(int i = 0; i < size; i++){
            Book book = books[i];
            if(title.equalsIgnoreCase(book.getBookName())){
                book.readBook();
                return true;
            }
        }
        return false;
    }
}

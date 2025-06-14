/**
 * The Bag class represents a bag that can contain
 * maximum 10 books
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.ArrayList;

public class Bag
{
    // instance variables
    private Book[] books;
    private int size;
    
    Bag(){
        this.size = 0;
        this.books = new Book[10];
    }
    
    boolean isFull(){
        return size == books.length;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    void insertBook(Book book){
        if(isFull()){
            System.out.println("Bag Full. Cannot insert Book");
            return;
        }
        
        books[size++] = book;
    }
    
    Book[] searchBooksByKeyword(String keyword){
        ArrayList<Book> containsKeyword = new ArrayList<>();
        
        for(int i = 0; i < size; i++){
            Book book = books[i];
            if(book.countKeywordFrequency(keyword) > 0){
                containsKeyword.add(book);
            }
        }
        
        return containsKeyword.toArray(new Book[containsKeyword.size()]);
    }
    
    Book searchBookWithMostFrequency(String keyword){
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
    
    String showAllBooks(){
        if(isEmpty()){
            return " No Books in the Bag";
        }
        String str = "Author : Book \n";
        
        for(int i = 0; i < size; i++){
            Book book = books[i];
            str += book.getAuthor() + " : " + book.getBookName() + "\n";
        }
        
        return str;
    }
    
    /*
    void ReadBook(String title){
        
    }*/
}

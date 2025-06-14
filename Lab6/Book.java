/**
 * The Book class represents a book in the Bag
 * Each book contains an array of Page objects.
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.ArrayList;

public class Book
{
    // instance variables
    private String bookName;
    private String author;
    private ArrayList<Page> pages = new ArrayList<>();

    String getBookName() {
        return bookName;
    }
    
    String getAuthor() {
        return author;
    }
    
    Book(String author, String bookName){
        this.bookName = bookName;
        this.author = author;
    }
    
    void addPage(Page page){
        pages.add(page);
    }
    
    void readBook(){
        int i = 1;
        for(Page page : pages){
            System.out.println("Page "+i+" :: \n\t"+page.getText());
            i++;
        }
    }
    
    int countKeywordFrequency(String keyword){
        int count = 0;
        for(Page page : pages){
            count += page.countKeywordFrequency(keyword);
        }
        return count;
    }
}

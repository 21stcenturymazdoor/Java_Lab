package Bag_Books_Pages;
/**
 * 
 * The Book class represents a book in the Bag
 * Each book contains an array of Page objects.
 * Page is an inner class defined inside Book class
 *
 *Modified code from previous lab to implement Composition 
 *
 *Composition between Book and Page:
 *A Book contains Page objects, and these Page objects cannot exist independently
 *If a Book is deleted, its associated Page objects are also deleted
 
 * @author (21stcenturymazdoor)
 * @version (15/06/2025)
 */

import java.util.ArrayList;

public class Book
{
    // instance variables
    private String bookName;
    private String author;
    private ArrayList<Page> pages = new ArrayList<>();
    
    public Book(String author, String bookName){
        this.bookName = bookName;
        this.author = author;
    }
    
    class Page{
        // instance variables
        private String text;
        
        public Page(String text){
            this.text = text;
        }
        
        String getText(){
            return text;
        }
        
        int countKeywordFrequency(String keyword){
            int count = 0;
            for(String word : text.split("\\s+")){
                if (keyword.equalsIgnoreCase(word)){
                    count++;
                }
            }
            return count;
        }
    }
    
    public void addPage(String text){
        Page page = new Page(text);
        pages.add(page);
    }
    
    public void readBook(){
        int i = 1;
        for(Page page : pages){
            System.out.println("Page "+i+" :: \n\t"+page.getText());
            i++;
        }
    }
    
    public int countKeywordFrequency(String keyword){
        int count = 0;
        for(Page page : pages){
            count += page.countKeywordFrequency(keyword);
        }
        return count;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public String getAuthor() {
        return author;
    }
}

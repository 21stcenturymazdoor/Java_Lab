/**
 * The Page class represents a page in a book.
 *
 * @author (21stcenturymazdoor)
 * @version (15/06/2025)
 */
package Bags;

public class Page
{
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

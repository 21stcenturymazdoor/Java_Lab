
/**
 * reverses the words in a sentence without reversing the letters of the words.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class ReverseWordOrder
{
    

    /**
     * @param  y  string
     * @return    string with words reversed
     */
    public static String ReverseWord(String y)
    {
        String[] s = y.trim().replaceAll("\\s+", " ").split(" ");
        String reversed = "";
        for(int i = s.length-1 ; i>=0;i--){
            reversed += s[i] + " ";
        }
        
        return reversed;
    }
    
    public static void main(String[] args){
        System.out.println("-----Reverse Word Order in a Sentence-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String ::");
        String s = sc.nextLine();
        sc.close();
        
        System.out.println("Current String :: "+s);
        System.out.println("Reversed String :: "+ReverseWord(s));
    }
}

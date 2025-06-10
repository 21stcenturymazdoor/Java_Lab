
/**
 * checks if a given string is palindrome or not
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;
import java.lang.String;

public class Palindrome
{

    /**
     * @param  pal  String to be checked for palindrome 
     * @return    true if palindrome, false if not
     */
    public static boolean PalindromeChecker(String pal)
    {
        pal = pal.replace(" ","");
        pal = pal.toLowerCase();
        
        for(int i = 0;i<pal.length()/2; i++){
            if(pal.charAt(i) != pal.charAt(pal.length()-1-i)){return false;}
        }
        return true;
    }
    
    public static void main(String[] args){
        System.out.println("-----Palindrome Checker-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String ::");
        String s = sc.nextLine();
        sc.close();
        
        if(PalindromeChecker(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
        
    }
}

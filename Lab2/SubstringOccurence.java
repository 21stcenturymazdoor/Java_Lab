/**
 * finds all occurrences of a substring in a given string.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class SubstringOccurence
{
    
    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void subStringIndex(String str, String substr)
    {
        boolean first = true;
        for(int i = 0; i <= str.length()-substr.length(); i++){
            if( str.charAt(i) == substr.charAt(0) ){
                int j = 0;
                while(j<substr.length()){
                    if(str.charAt(i+j) != substr.charAt(j)){
                        break;
                    }
                    j++;
                }
                
                if(j == substr.length()){
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Substring Occurrence Checker-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string here :: ");
        String s = sc.nextLine();
        
        System.out.print("Enter subString :: ");
        String sub = sc.nextLine();
        sc.close();
        
        System.out.println("Given String :: "+s);
        System.out.println("Given SubString :: "+sub);
        
        System.out.println("Substring Occurences");
        subStringIndex(s,sub);
    }
}


/**
 * Compresses string by representing repeated character with their counts
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class StringCompressor
{

    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String StringCompressed(String y)
    {
        String s = String.valueOf(y.charAt(0));
        
        int i = 1;
        int k = 1;
        while(i<y.length()){
            if(y.charAt(i) != y.charAt(i-1) ){
                if(k>1){
                    s+=k;
                    k=1;
                }
                s += String.valueOf(y.charAt(i));
                
            }
            else{
                k++;
            }
            i++;
        }
        if( k != 1){
            s+=k;
        }
        
        return s;
    }
    
    public static void main(String[] args){
        System.out.println("-----String Compressor-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String ::");
        String s = sc.nextLine();
        sc.close();
        
        System.out.println("Normal String :: "+s);
        
        s = StringCompressed(s);
        System.out.println("Compressed String :: "+s);
    }
}

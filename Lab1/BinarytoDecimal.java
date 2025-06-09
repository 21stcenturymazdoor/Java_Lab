/**
 * converts Binary number to decimal.
 *
 * @author (21stcenturymazdoor)
 * @version (09/06/2025)
 */
import java.util.Scanner;
import java.lang.Math;

public class BinarytoDecimal
{
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  binary  a binary number
     * @return    decimal equivalent of binary
     */
    public static double binaryToDecimal(int binary)
    {
        double decimal=0;
        int power = 0;
        
        while(binary > 0 ){
            decimal += Math.pow(2,power)*(binary%10);
            binary /= 10;
            power++;
            
        }
        return decimal;
    }
    
    public static void main(String[] args){
        System.out.println("-----Binary TO Decimal Conversion-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter binary number ::");
        int binary = sc.nextInt();
        
        System.out.println("The decimal obtained ::"+binaryToDecimal(binary));
    }
}

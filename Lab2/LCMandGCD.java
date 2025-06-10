/**
 * computes the Least Common Multiple (LCM) and Greatest Common Divisor (GCD) of two numbers.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class LCMandGCD
{
    /**
     * @param  x , y  an integer
     * @return    lcm of x and y
     */
    public static int calculateLCM(int x,int y)
    {
        return (x*y)/calculateGCD(x,y);
    }
    
    /**
     * @param  x , y  an integer
     * @return    gcd of x and y
     */
    public static int calculateGCD(int x,int y)
    {
        if( y == 0){return x;}
        
        return calculateGCD(y, x%y);
    }
    
    public static void main(String[] args){
        System.out.println("-----LCM and GCD Calculator-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of x :: ");
        int x = sc.nextInt();
        
        System.out.print("Enter value of y :: ");
        int y = sc.nextInt();
        sc.close();
        
        System.out.println("x = "+x+" y = "+y);
        System.out.println("LCM : "+calculateLCM(x,y)+" , GCD : "+calculateGCD(x,y));
    }
}


/**
 * Prints the first n terms of an AP
 *
 * @author (21stcenturymazdoor)
 * @version (09/06/2025)
 */
import java.util.Scanner;

public class ArithmeticProgression
{
    

    /**
     * @param  a, d, n (first term, difference, number of terms)
     * @prints the first n terms of the AP series
     */
    public static void generateAP(int a, int d, int n)
    {
        for(int i = 0 ; i<n;i++){
            System.out.println( a + (d*i));
        }
    }
    
    public static void main(String[] args){
        System.out.println("----Arithmetic Progression----");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first term ::");
        int a = sc.nextInt();
        
        System.out.print("Enter common difference ::");
        int d = sc.nextInt();
        
        System.out.print("Enter number of terms (n>=0)::");
        int n = sc.nextInt();
        sc.close();
        
        generateAP(a,d,n);
    }
}

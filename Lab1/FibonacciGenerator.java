
/**
 * A simple FibonacciGenerator class in java
 *
 * @author (21stcenturymazdoor)
 * @version (09/06/2025)
 */
import java.util.Scanner;


public class FibonacciGenerator
{
    

    /**
     *
     * @param  n  the method generates 
     * Fibonacci series upto n terms
     * @return    fibonacci series upto n terms
     */
    public static void generateFibonacci(int n)
    {
        if(n<=0){System.out.println("Invalid Input. (n >= 1)");}
        
        int prev1=0;
        int prev2=1;
        
        for(int i = 0 ;i < n ; i++){
            System.out.println(prev1);
            prev2 = prev2 + prev1;
            prev1 = prev2 - prev1;
        }
    }
    
    public static void main(String[] args){
        System.out.println("----Fibonacci Series Generator----");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms ::");
        int n = sc.nextInt();
        
        generateFibonacci(n);
    }
}

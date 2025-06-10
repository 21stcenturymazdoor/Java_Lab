/**
 * program to check if a given number is an Armstrong number.
 * 
 * An Armstrong number is one in which
 * the sum of its digits raised to the power of the number of digits
 * equals the number itself.
 * 
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class Armstrong
{
    /**
     *
     * @param  y  
     * @return    boolean value after checking y for armstrong number
     */
    public static boolean armstrongNumber(int y)
    {
        int ytemp = y;
        int sum = 0;
        int n=0;
        
        while(ytemp !=0 ){
            n++;
            ytemp /= 10;
        }
        
        ytemp = y;
        
        while(ytemp != 0){
            sum +=Math.pow(ytemp%10,n);
            ytemp /= 10;
        }
        
        return sum == y;
    }
    
    public static void main(String[] args){
        System.out.println("-----Armstrong Number Checker-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number ::");
        int arm = sc.nextInt();
        sc.close();
        
        if(armstrongNumber(arm)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}

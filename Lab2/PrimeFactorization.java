/**
 * computes all the prime factors of a given number
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactorization
{
    

    /**
     *
     * @param  y  number whose prime factors are to be determined
     * @return    ArrayList with prime factors of y
     */
    public static ArrayList<Integer> primeFactor(int y)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 2;
        while(y > 1){
            while(y % i == 0){
                list.add(i);
                y /= i;
            }
            i++;
        }
        
        return list;
    }
    
    public static void main(String[] args){
        System.out.println("-----Prime Factorization-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number ::");
        int n = sc.nextInt();
        sc.close();
        
        ArrayList<Integer> arr = primeFactor(n);
        System.out.print("Prime Factor Array :: [");
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr.get(i));
        }
        System.out.println("]");
    }
}

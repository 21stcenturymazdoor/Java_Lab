
/**
 * class to print Squares and Cubes of an argument
 *
 * @author (21stcenturymazdoor)
 * @version (09/06/2025)
 */
import java.util.Scanner;

public class SquareCubeTable
{

    /**
     *
     * @param  n  first n integers to be printed
     * @prints table of n | n*n | n*n*n
     */
    public static void generateSquareCubeTable(int n)
    {
        for(int i = 1;i<=n;i++){
            System.out.println(" "+ i +" | "+ i*i + " | "+ i*i*i);
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Table of Squares and Cubes-----");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of terms ::");
        int n = sc.nextInt();
        
        generateSquareCubeTable(n);
    }
}

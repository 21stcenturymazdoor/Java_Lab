/**
 * generate and display all permutations of a given string.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class Permutation
{
    //method to print string
    public static void permutationPrinter(char[] arr) {
        System.out.println(String.valueOf(arr));
    }

    //method to swap two characters
    public static void swap(char[] arr,int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //method to generate all permutations
    public static void permutation(int pos, char[] arr) {

        if(pos == arr.length)
            permutationPrinter(arr);
        for(int i = pos; i<arr.length;i++){
            swap(arr,i,pos);
            //recurvise method to get all possible permutation
            permutation(pos+1, arr);
            swap(arr,i,pos);
        }
    }
    
    public static void main(String[] args){
        System.out.println("------Permutation of String-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String :: ");
        String str = sc.nextLine();
        sc.close();
        
        System.out.println("permutations ");
        permutation(0,str.toCharArray());
    }
}

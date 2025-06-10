/**
 * counts the frequency of each element in an array.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class ArrayFrequencyCounter
{
    /**
     * @param  arr  integer array
     * @prints unique elements with their total occurences
     */
    public static void frequencyCounter(int[] arr)
    {
        boolean[] visited = new boolean[arr.length];
        
        int count;
        
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                System.out.print(" "+arr[i]+" : ");
                count = 1;
                for(int j=i+1;j<arr.length;j++){
                    if( arr[j] == arr[i] && !visited[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Array Frequency Counter-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements of Array ::");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter elements separated by spaces :: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Elements of Array :: "+arr);
        System.out.println("Mapped frequency");
        frequencyCounter(arr);
    }
}

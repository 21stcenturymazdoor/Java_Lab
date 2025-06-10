/**
 *merges two sorted arrays into a single sorted array 
 *without using built-in sorting functions.
 *
 * @author (21stcentyrmazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class MergeArray
{
    /**
     *
     * @param  arr1,arr2  two sorted array
     * @return    a merged array with elements from both array
     */
    public static int[] mergeArray(int[] arr1 , int[] arr2)
    {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge both arrays until one is exhausted
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1, if any
        while(i < arr1.length){
            mergedArr[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2, if any
        while(j < arr2.length){
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
        
    }
    
    public static void displayArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Merge two sorted Array-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array :: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        
        System.out.print("Enter element separated by spaces :: ");
        for(int i = 0 ; i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        
        
        System.out.print("Enter size of second array :: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
        System.out.print("Enter element separated by spaces :: ");
        for(int i = 0 ; i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.print("Array 1 :: ");
        displayArr(arr1);
        System.out.print("\nArray 2 :: ");
        displayArr(arr2);
        
        int[] merged = mergeArray(arr1,arr2);
        
        System.out.print("\nMerged Array ::");
        displayArr(merged);
    }
}

/**
 * rotates the array elements such that
 * the first k elements are moved to the end
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class ArrayRotation
{
    

    /**
     * @param  arr[], pos  array and the position number
     * upto which it is to be rotated
     * 
     * @return    same array with first k elements moved to the end
     */
    public static void rotateArray(int[] arr, int pos)
    {
        if(pos <=0 || pos >= arr.length){
            System.out.print("Cannot rotate by "+pos+" position.");
            System.out.println(" Invalid Input!");
            return;
        }
        
        int temp;
        
        for(int i=0 ; i<pos ; i++){
            temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
    }
    
    public static void displayArray(int[] arr){
        for(int i: arr){
            System.out.print(" "+i);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        System.out.println("-----Array Rotation-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of elements in array ::");
        int n = sc.nextInt();
        
        System.out.println("Enter element one by one");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("element at index "+i+" ::");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array Before Rotation");
        displayArray(arr);
        
        System.out.print("Enter position up to rotate ::");
        int pos = sc.nextInt();
        
        sc.close();
        
        rotateArray(arr,pos);
        
        System.out.println("Array After Rotation");
        displayArray(arr);
    }
}

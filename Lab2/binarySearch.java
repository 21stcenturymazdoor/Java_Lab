
/**
 * performs binary search on a sorted array to find a target element.
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
import java.util.Scanner;

public class binarySearch
{
    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int binarySearchTarget(int target, int[] arr, int left, int right)
    {
        if(left > right){return -1;}
        int mid = (left + right)/2;
        
        if(arr[mid] == target){
            return mid;
        }else if(target < arr[mid]){
            return binarySearchTarget(target, arr, left, mid-1);
        }else{
            return binarySearchTarget(target, arr, mid+1, right);
        }
    }
    
    public static void main(String[] args){
        System.out.println("-----Binary Search-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter integers separated by spaces ::");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target element :: ");
        int target = sc.nextInt();
        sc.close();
        
        System.out.print("Index :: " + binarySearchTarget(target,arr,0,arr.length-1));
    }
}

/**
 * Use class for MaxHeap
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
import java.util.Scanner;

public class UseMaxHeap
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display");
        System.out.println("2.Insert Element");
        System.out.println("3.Delete Max");
        System.out.println("4.Build Heap entirely");
        System.out.println("5.Perform Heap Sort");
        System.out.print("Enter your choice :: ");
    }
    
    static int[] heapSort(int[] array){
        if (array == null || array.length == 0) return array;
        int level = (int)Math.ceil(Math.log(array.length + 1) / Math.log(2));
        MaxHeap mHeap = new MaxHeap(level);

        mHeap.build_heap(array);
        for(int i = 0 ; i < array.length ; i++){
            array[array.length - i - 1] = mHeap.delete();
        }
        return array;
    }
    
    public static void main(String[] args){
        System.out.println("---Max Heap Implementation---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of levels (1-10):: ");
        int level = sc.nextInt();
        
        if(level < 0){
            System.out.println("Cannot create Heap of negative size");
            sc.close();
            return;
        }
        if(level > 10){
            level = 10;
        }
        MaxHeap Mheap = new MaxHeap(level);
        System.out.println("Max Heap of Level : "+level+" , size : "+((int)Math.pow(2,level)-1)+" created");
        
        int choice;
        
        while(true){
            menu();
            choice = sc.nextInt();
            
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> Mheap.display_heap();
                case 2 -> {
                    System.out.print("Enter element to insert :: ");
                    int element = sc.nextInt();
                    Mheap.insert(element);
                }
                case 3 -> {
                    int deletedElement = Mheap.delete();
                    if(deletedElement != -999) {
                        System.out.println("Deleted Element :: " + deletedElement);
                    }
                }
                case 4 -> {
                    System.out.print("Enter number of elements to build heap :: ");
                    int n = sc.nextInt();
                    int[] array = new int[n];
                    System.out.println("Enter " + n + " elements :: ");
                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextInt();
                    }
                    Mheap.build_heap(array);
                    System.out.println("Heap built successfully.");
                }
                case 5 -> {
                    System.out.print("Enter number of elements to sort :: ");
                    int n = sc.nextInt();
                    int[] array = new int[n];
                    System.out.println("Enter " + n + " elements to sort :: ");
                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextInt();
                    }
                    array = heapSort(array);
                    System.out.print("Sorted Elements :: ");
                    for (int elem : array) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

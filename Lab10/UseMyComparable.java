
/**
 * Use class for MyComparable interface implementation
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Scanner;

public class UseMyComparable
{
    public static void sortArray(int[] list, MyComparable comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (comparator.compareTo(list[j], list[j + 1]) > 0) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
    
    public static void menu(){
        System.out.println("------Menu-----");
        System.out.println("0. Exit");
        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");
        System.out.println("3. Sort by Largest Prime Factor");
        System.out.print("Enter choice :: ");
    }
    
    public static void displayArray(int[] num){
        for(int n : num ){
            System.out.print(" "+n);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        System.out.println("-----MyComparable-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements :: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the elements separated by spaces ::  ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int choice;
        while(true){
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 0 ->{
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                case 1 -> {
                    sortArray(numbers, new Ascending());
                    System.out.print("Sorted in Ascending Order: ");
                    displayArray(numbers);
                }
                case 2 -> {
                    sortArray(numbers, new Descending());
                    System.out.print("Sorted in Descending Order: ");
                    displayArray(numbers);
                }
                case 3 -> {
                    sortArray(numbers, new primeOrder());
                    System.out.print("Sorted in prime Order: ");
                    displayArray(numbers);
                }
                default -> System.out.println("Wrong input.");
            }
        }
    }
}

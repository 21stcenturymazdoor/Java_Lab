/**
 * Use class for Series interface, finiteSeries
 *
 * @author (21stcenturymazdoor)
 * @version (18/06/2025)
 */
import java.util.Scanner;

public class UseSeries
{
    public static void printSeries(Series a, int howmany){
        for (int i=0;i<howmany;i++){
            System.out.println("Next number in Series: "+a.getNext());
        }
    }
    
    public static void menu(){
        System.out.println("0. Exit");
        System.out.println("1. Get next number in Series");
        System.out.println("2. Reset Series");
        System.out.println("3. Set Start Index");
        System.out.print("Enter your choice :: ");
    }
    
    public static void main(String[] args){
        System.out.println("-----Series Interface Implementation-----");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements :: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter all elements separated by spaces :: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        FiniteSeries fs = new FiniteSeries(arr);
        
        while(true){
            menu();
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 1:
                    System.out.print("How many numbers to get? ");
                    int howmany = sc.nextInt();
                    printSeries(fs, howmany);
                    break;
                case 2:
                    fs.reset();
                    System.out.println("Series has been reset.");
                    break;
                case 3:
                    System.out.print("Enter start index: ");
                    int startIndex = sc.nextInt();
                    fs.setStart(startIndex);
                    System.out.println("Start index set to " + startIndex);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/**
 * Use class for Circular Queue
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
import java.util.Scanner;

public class UseCircular

{
    public static void menu(){
        System.out.println("\n---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display  Queue");
        System.out.println("2.Enqueue");
        System.out.println("3.Dequeue");
        System.out.println("4.Check if Empty");
        System.out.println("5.Check if Full");
        System.out.print("Enter your choice :: ");
    }
    
    public static void main(String[] args){
        System.out.println("---Circular Queue---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of the queue :: ");
        int size = sc.nextInt();
    
        CircularQueue cQueue = new CircularQueue(size);
        System.out.println("Empty Queue of size : "+size+" Created");
        
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
                case 1 -> {
                    cQueue.displayQueue();
                }
                case 2 -> {
                    System.out.print("Enter Element to Enqueue :: ");
                    int a = sc.nextInt();
                    cQueue.enqueue(a);
                }
                case 3 -> {
                    int b = cQueue.dequeue();
                    if(b != -999){
                        System.out.println("Dequeued Element :: "+b);
                    }
                }
                case 4 -> System.out.println(cQueue.isEmpty());
                case 5 -> {
                    System.out.println(cQueue.isFull());
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

/**
 * Use class for Queue using Singly Linked List
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.Scanner;

public class UseQueueSLL
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.check If Queue is Empty or not");
        System.out.println("4. Display the List");
        System.out.print("Enter your choice :: ");
    }
    
    
    public static void main(String[] args){
        System.out.println("---Queue using Linked List Simulation---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a Queue Linked List");
        QueueSLL q = new QueueSLL();
        System.out.println("Queue created");
        
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
                    System.out.print("Enter the data :: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    System.out.println("Data Enqueued");
                }
                case 2 -> {
                    int dequeued = q.dequeue();
                    if (dequeued == -999) {
                        System.out.println("UnderFlow !!! Queue Already Empty");
                    } else {
                        System.out.println("Dequeued : " + dequeued);
                    }
                }
                case 3 -> {
                    System.out.println("Queue is " + (q.isEmpty() ? "Empty" : "Not Empty"));
                }
                case 4 -> {
                    System.out.println("Displaying the queue :");
                    q.display();
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

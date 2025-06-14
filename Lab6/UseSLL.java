/**
 * Use class for Singly Linked List, SLL class
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
import java.util.Scanner;

public class UseSLL
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Insert at Beginning");
        System.out.println("2.Delete the Head(First) Node");
        System.out.println("3.Insert at End");
        System.out.println("4.Delete by value");
        System.out.println("5.get Sum");
        System.out.println("6. Display the List");
        System.out.print("Enter your choice :: ");
    }
    
    
    public static void main(String[] args){
        System.out.println("---Linked List Simulation---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a Linked List");
        SLL sll = new SLL();
        System.out.println("Linked List Created");
        
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
                    System.out.print("Enter the data to insert at beginning: ");
                    int data = sc.nextInt();
                    sll.insertAtBegin(data);
                    System.out.println("Data inserted at beginning.");
                }
                case 2 -> {
                    int deletedData = sll.deleteAtBegin();
                    if (deletedData == -999) {
                        System.out.println("List is empty. Nothing to delete.");
                    } else {
                        System.out.println("Deleted data from beginning: " + deletedData);
                    }
                }
                case 3 -> {
                    System.out.print("Enter the data to insert at end: ");
                    int data = sc.nextInt();
                    sll.insertAtEnd(data);
                    System.out.println("Data inserted at end.");
                }
                case 4 -> {
                    System.out.print("Enter the value to delete: ");
                    int value = sc.nextInt();
                    sll.deleteByValue(value);
                    System.out.println("Node with value " + value + " deleted if it existed.");
                }
                case 5 -> {
                    int sum = sll.getSum();
                    System.out.println("Sum of all elements in the list: " + sum);
                }
                case 6 -> {
                    System.out.println("Displaying the list:");
                    sll.display();
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

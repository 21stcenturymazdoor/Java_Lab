/**
 * Use class for Singly Linked List, SLL class
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Scanner;

public class UseSLL
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.check is sll1 is equal to sll2");
        System.out.println("2.check is sll2 is equal to sll1");
        System.out.println("3.check is sll1 is equal to sll1");
        System.out.println("4.check is sll2 is equal to sll2");
        System.out.println("5. toString of sll1");
        System.out.println("6. toString of sll2");
        System.out.print("Enter your choice :: ");
    }
    
    public static SLL getListInput(Scanner scanner) {
        String str = scanner.nextLine().trim();
        String[] strArray = str.split("\\s");
        SLL list = new SLL();
        for (String s : strArray) {
            list.insertAtEnd(Integer.parseInt(s));
        }
        return list;
    }
    
    public static void main(String[] args){
        System.out.println("---Linked List Simulation---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a Linked List");
        System.out.print("Enter the elements of the linked list (space-separated): ");
        SLL sll1 = getListInput(sc);
        System.out.println("Linked List Created");

        System.out.println("Creating a Linked List");
        System.out.print("Enter the elements of the linked list (space-separated): ");
        SLL sll2 = getListInput(sc);
        System.out.println("Linked List Created");
        
        int choice;
        
        while(true){
            menu();
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    System.out.println("sll1.equals(sll2): " + sll1.equals(sll2));
                }
                case 2 -> {
                    System.out.println("sll2.equals(sll1): " + sll2.equals(sll1));
                }
                case 3 -> {
                    System.out.println("sll1.equals(sll1): " + sll1.equals(sll1));
                }
                case 4 -> {
                    System.out.println("sll2.equals(sll2): " + sll2.equals(sll2));
                }
                case 5 -> {
                    System.out.println("sll1.toString(): " + sll1.toString());
                }
                case 6 -> {
                    System.out.println("sll2.toString(): " + sll2.toString());
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

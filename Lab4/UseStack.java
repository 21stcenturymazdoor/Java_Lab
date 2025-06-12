/**
 * Use class for Circular Queue
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
import java.util.Scanner;

public class UseStack
{
    public static void menu(){
        System.out.println("\n---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display  Stack");
        System.out.println("2.Push");
        System.out.println("3.Pop");
        System.out.println("4.Peek");
        System.out.println("5.Check if Empty");
        System.out.println("6.Check if Full");
        System.out.print("Enter your choice :: ");
    }
    
    public static void main(String[] args){
        System.out.println("---Stack---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of the stack :: ");
        int size = sc.nextInt();
    
        Stack mystack = new Stack(size);
        System.out.println("Empty Stack of size : "+size+" Created");
        
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
                    mystack.displayStack();
                }
                case 2 -> {
                    System.out.print("Enter Element to Push :: ");
                    char a = sc.next().charAt(0);
                    mystack.push(a);
                }
                case 3 -> {
                    char b = mystack.pop();
                    if(b != ' '){
                        System.out.println("Popped Element :: "+b);
                    }else{
                        System.out.println("Underflow!!! Stack Empty");
                    }
                }
                case 4 -> {char b = mystack.peek();
                    if(b != ' '){
                        System.out.println("Top Element :: "+b);
                    }else{
                        System.out.println("Stack Empty");
                    }
                }
                case 5 -> System.out.println(mystack.isEmpty());
                case 6 -> {
                    System.out.println(mystack.isFull());
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

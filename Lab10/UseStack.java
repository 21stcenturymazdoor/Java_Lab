/**
 * Use Class for
 * Stack implementation
 * extends ArrayLinearList
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
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
    
        Stack mystack = new Stack();
        System.out.println("Empty Stack of size : "+100+" Created");
        
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
                    System.out.print("Enter Value to Push :: ");
                    int a = sc.nextInt();
                    mystack.push(a);
                }
                case 3 -> {
                    int b = mystack.pop();
                    if(b != -999){
                        System.out.println("Popped Value :: "+b);
                    }else{
                        System.out.println("Underflow!!! Stack Empty");
                    }
                }
                case 4 -> {
                    int b = mystack.peek();
                    if(b != -999){
                        System.out.println("Top Value :: "+b);
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

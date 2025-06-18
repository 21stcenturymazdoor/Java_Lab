/**
 * Use Class for ObjectSLL
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
import java.util.Scanner;

public class UseObjectSLL
{
    static void menu(){
        System.out.println("---Menu---");
        System.out.println("0.Exit");
        System.out.println("1.insert Node");
        System.out.println("2.find Max");
        System.out.println("3.find Length");
        System.out.println("4.delete Node");
        System.out.println("5.Reverse List");
        System.out.println("6.display List");
        System.out.print("Enter choice :: ");
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating List");
        ObjectSLL list = new ObjectSLL();
        System.out.println("List Created");
        
        
        int choice;
        
        int a = 0;
        
        while(true){
            menu();
            choice = sc.nextInt();
            
            switch(choice){
                case 0 ->{
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                }
                case 1 ->{
                    System.out.print("Insert Data :: ");
                    a = sc.nextInt();
                    System.out.print("Insert Position :: ");
                    int pos = sc.nextInt();
                    list.insertAfter(pos,a);
                }
                case 2 ->{
                    a = list.Max();
                    System.out.println((a == -999) ? "List Empty" : "Max Element : "+a);
                }
                case 3 ->{
                    a = list.Length();
                    System.out.println((a == 0) ? "List Empty" : "List Length : "+a);
                }
                case 4 ->{
                    System.out.print("Enter position to delete : ");
                    a = sc.nextInt();
                    list.deleteNode(a);
                }
                case 5 ->   list.reverseList();
                case 6 ->   list.displayList();
                default -> System.out.println("Invalid input");
            }
        }
    }
}

/**
 * Use Class for SortedList class
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
import java.util.Scanner;

public class UseSortedList
{
    static void menu(){
        System.out.println("---Menu---");
        System.out.println("0.Exit");
        System.out.println("1.Insert Element");
        System.out.println("2.Delete Element");
        System.out.println("3.Search Element");
        System.out.println("4.Display List");
        System.out.println("5.Check if Empty");
        System.out.println("6.Check if Full");
        System.out.print("Enter choice :: ");
    }
    
    public static void main(String[] args){
        System.out.println("Implementation of Sorted List");
        
        Scanner sc = new Scanner(System.in);
        
        SortedList list = new SortedList();
        System.out.println("List Created");
        
        int choice;
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
                    System.out.print("Enter element to Insert :: ");
                    int ele = sc.nextInt();
                    list.insert(ele);
                }
                case 2 ->{
                    System.out.print("Enter element to Delete :: ");
                    int del = sc.nextInt();
                    list.delete(del);
                }
                case 3 ->{
                    System.out.print("Enter element to Search :: ");
                    int target = sc.nextInt();
                    target = list.binarySearch(target);
                    System.out.println((target == -1) ? "Element not in List" : "Element at Index :: "+target);
                }
                case 4 ->   list.displayList();
                case 5 ->   System.out.println(list.isEmpty() ? "List Empty" : "List not Empty");
                case 6 ->   System.out.println(list.isFull() ? "List Full" : "List not Full");
                default -> System.out.println("Invalid input");
            }
        }
    }
}

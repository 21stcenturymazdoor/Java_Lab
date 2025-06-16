/**
 * Use Class for SortedList class
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
import List_SortedList.SortedList;

import java.util.Scanner;

public class UseSortedList
{
    static void menu(){
        System.out.println("---Menu---");
        System.out.println("0.Exit");
        System.out.println("1.Insert Value");
        System.out.println("2.Delete Value");
        System.out.println("3.Find Value");
        System.out.println("4.Check if Empty");
        System.out.println("5.Check if Full");
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
                    System.out.print("Enter value to Insert :: ");
                    int val = sc.nextInt();
                    list.insert(val);
                }
                case 2 ->{
                    System.out.print("Enter value to Delete :: ");
                    int del = sc.nextInt();
                    list.delete(del);
                }
                case 3 -> {
                    System.out.print("Enter value to Find :: ");
                    int find = sc.nextInt();
                    int index = list.find(find);
                    if(index >= 0 && !list.isEmpty()) {
                        System.out.println("Value " + find + " found at index " + index);
                    } else {
                        System.out.println("Value " + find + " not found\nIndex returned: " + index);
                    }
                }
                case 4 ->   System.out.println(list.isEmpty() ? "List Empty" : "List not Empty");
                case 5 ->   System.out.println(list.isFull() ? "List Full" : "List not Full");
                default -> System.out.println("Invalid input");
            }
        }
    }
}

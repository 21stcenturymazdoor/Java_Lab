/**
 * Use class for Greetings class
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
import java.util.Scanner;

public class UseGreetings
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display Name");
        System.out.println("2.Display Date Of Birth");
        System.out.println("3.Greet");
        System.out.println("4.Birthday Greeting");
        System.out.println("5.Calculate Age");
        System.out.print("Enter your choice :: ");
    }
    
    static Greetings createPerson(Scanner sc){
        System.out.print("Enter Name :: ");
        String name = sc.nextLine();
        System.out.print("Enter Date of Birth (DD MM YYYY) :: ");
        String dob = sc.nextLine();
        return new Greetings(name, dob);
    }
    
    public static void main(String[] args){
        System.out.println("---Greetings---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter details");
        Greetings pereson = createPerson(sc);
        
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
                case 1 -> System.out.println("Name: " + pereson.getName());
                case 2 -> System.out.println("Date of Birth: " + pereson.getDOB());
                case 3 -> pereson.greetPerson();
                case 4 -> pereson.birthdayGreetings();
                case 5 -> pereson.calculateAge();
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

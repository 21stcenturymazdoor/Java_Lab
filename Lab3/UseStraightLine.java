/**
 * Use class for StraightLine Class
 *
 * @author (21stcenturymazdoor)
 * @version (11/06/2025)
 */
import java.util.Scanner;

public class UseStraightLine
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display Line Equation");
        System.out.println("2.check if LineA parallel to LineB");
        System.out.println("3.check if LineA perpendicular to LineB");
        System.out.println("4.check if point on LineA");
        System.out.println("5.check if point on LineB'");
        System.out.print("Enter your choice :: ");
    }
    
    static StraightLine createStraightLine(Scanner sc){
        System.out.print("Enter coefficient of x :: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient of y :: ");
        double b = sc.nextDouble();
        System.out.print("Enter constant c       :: ");
        double c= sc.nextDouble();
        return new StraightLine(a,b,c);
    }
    
    public static void main(String[] args){
        System.out.println("---Straight Line---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("LINE A");
        StraightLine line1 = createStraightLine(sc);
    
        System.out.println("LINE B");
        StraightLine line2 = createStraightLine(sc);
        
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
                case 1 -> System.out.println("LINE-A :: "+line1+"\nLINE-B :: "+line2);
                case 2 -> System.out.println(line1.isParallelWith(line2));
                case 3 -> System.out.println(line1.isPerpendicularWith(line2));
                case 4 -> {
                    System.out.print("Enter x: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter y: ");
                    double y = sc.nextDouble();
                    System.out.println(line1.isPointOnLine(x, y));
                }
                case 5 -> {
                    System.out.print("Enter x: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter y: ");
                    double y = sc.nextDouble();
                    System.out.println(line2.isPointOnLine(x, y));
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

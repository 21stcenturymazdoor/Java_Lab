/**
 * Use Class for ight Triangle
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
import java.util.Scanner;

import Inheritance_Method_Overriding.RightAngleTriangle;

public class UseRightTriangle
{
    static void menu(){
        System.out.println("---Menu---");
        System.out.println("0.Exit");
        System.out.println("1.Find Area");
        System.out.println("2.Find Perimeter");
        System.out.println("3.Show Points");
        System.out.println("4.Find Hypotenuse Length");
        System.out.println("5.Find all sides");
        System.out.print("Enter choice :: ");
    }
    
    static int[] getPoints(Scanner sc){
        System.out.print("Enter value of x :: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y :: ");
        int y = sc.nextInt();
        
        return new int[]{x,y};
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating Right Angled Triangle");
        System.out.println("\tPoint A");
        int[] a = getPoints(sc);
        System.out.println("\tPoint B");
        int[] b = getPoints(sc);
        System.out.println("\tPoint C");
        int[] c = getPoints(sc);
        
        RightAngleTriangle tri = new RightAngleTriangle(a, b, c);

        if (!tri.isValid()) {
            System.out.println("The given points do not form a right-angled triangle. Triangle not created. Exiting...");
            sc.close();
            return;
        }
        
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
                case 1 ->   System.out.println("Area :: "+ tri.findArea());
                case 2 ->   System.out.println("Perimeter :: "+ tri.findPerimeter());
                case 3 ->   System.out.println("Points :: " + tri.getPoints());
                case 4 ->   System.out.println("Hypotenuse Length :: " + tri.getHypotenuse());
                case 5 ->   System.out.println(tri.getSides());
                default -> System.out.println("Invalid input");
            }
        }
    }
}

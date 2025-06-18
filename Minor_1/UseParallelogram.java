/**
 * Use Class for Parallelogram
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
import java.util.Scanner;

public class UseParallelogram
{
    static void menu(){
        System.out.println("---Menu---");
        System.out.println("0.Exit");
        System.out.println("1.Find Area");
        System.out.println("2.Find Perimeter");
        System.out.println("3.Show Points");
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
        
        System.out.println("Creating Parallelogram");
        System.out.println("\tPoint A");
        int[] a = getPoints(sc);
        System.out.println("\tPoint B");
        int[] b = getPoints(sc);
        System.out.println("\tPoint C");
        int[] c = getPoints(sc);
        System.out.println("\tPoint D");
        int[] d = getPoints(sc);
        
        Parallelogram pll = new Parallelogram(a,b,c,d);
        
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
                case 1 ->   System.out.println("Area :: "+ pll.findArea());
                case 2 ->   System.out.println("Perimeter :: "+ pll.findPerimeter());
                case 3 ->   pll.displayPoints();
                default -> System.out.println("Invalid input");
            }
        }
    }
}

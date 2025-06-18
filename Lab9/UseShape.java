/**
 * Use class for Shape
 *
 * @author (21stcenturymazdoor)
 * @version (17/06/2025)
 */
import java.util.Scanner;
import Shapes.Circle;
import Shapes.Parallelogram;
import Shapes.Triangle;

public class UseShape
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0. Exit");
        System.out.println("1. Create new Circle");
        System.out.println("2. Create new Parallelogram");
        System.out.println("3. Create new Triangle");
        System.out.println("4. Triangle: Check Type");
        System.out.println("5. Parallelogram: Check if Rectangle/Square");
        System.out.println("6. Circle: Check if Point Inside");
        System.out.print("Enter your choice :: ");
    }

    static Circle createCircle(Scanner sc){
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter center X: ");
        int x = sc.nextInt();
        System.out.print("Enter center Y: ");
        int y = sc.nextInt();
        return new Circle(radius, x, y);
    }

    static Parallelogram createParallelogram(Scanner sc){
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter acute angle (in degrees): ");
        int angle = sc.nextInt();
        return new Parallelogram(side1, side2, angle);
    }

    static Triangle createTriangle(Scanner sc){
        int[][] points = new int[3][2];
        for(int i=0; i<3; i++){
            System.out.print("Enter x" + (i+1) + ": ");
            points[i][0] = sc.nextInt();
            System.out.print("Enter y" + (i+1) + ": ");
            points[i][1] = sc.nextInt();
        }
        return new Triangle(points[0], points[1], points[2]);
    }

    public static void main(String[] args){
        System.out.println("---Shape Utility---");
        Scanner sc = new Scanner(System.in);

        Circle circle = null;
        Parallelogram para = null;
        Triangle tri = null;

        int choice;
        while(true){
            menu();
            choice = sc.nextInt();

            switch(choice){
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    circle = createCircle(sc);
                    circle.getAreaPerimeter(circle);
                }
                case 2 -> {
                    para = createParallelogram(sc);
                    para.getAreaPerimeter(para);
                }
                case 3 -> {
                    tri = createTriangle(sc);
                    tri.getAreaPerimeter(tri);
                }
                case 4 -> {
                    if(tri == null){
                        System.out.println("Please create a new triangle first (option 3).");
                        break;
                    }
                    System.out.println("Is Right Angle Triangle? " + tri.isRightAngleTriangle());
                    System.out.println("Is Isosceles Triangle? " + tri.isIsoscelesTriangle());
                    System.out.println("Is Equilateral Triangle? " + tri.isEquilateralTriangle());
                }
                case 5 -> {
                    if(para == null){
                        System.out.println("Please create a new parallelogram first (option 2).");
                        break;
                    }
                    System.out.println("Is Rectangle? " + para.isRectangle());
                    System.out.println("Is Square? " + para.isSquare());
                }
                case 6 -> {
                    if(circle == null){
                        System.out.println("Please create a new circle first (option 1).");
                        break;
                    }
                    System.out.print("Enter x: ");
                    int x = sc.nextInt();
                    System.out.print("Enter y: ");
                    int y = sc.nextInt();
                    System.out.println("Is Point Inside Circle? " + circle.isPointInside(x, y));
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

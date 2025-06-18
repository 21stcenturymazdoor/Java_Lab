/**
 * Parallelogram class
 * represented as an aggregation of 2 triangles
 * (Tri : ABC , Tri : ADC , ||gm : ABCD)
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
public class Parallelogram
{
    // instance variables
    private Triangle t1;
    private Triangle t2;
    
    Parallelogram(int[] pointA, int[] pointB, int[] pointC, int[] pointD){
        // arguments are expected to be array of size 2 with x and y respectively
        
        t1 = new Triangle(pointA, pointB, pointC);
        t2 = new Triangle(pointA, pointD, pointC);
    }
    
    double findPerimeter(){
        return t1.findPerimeter() + t2.findPerimeter() - 2*Triangle.findDistance(t1.points[0], t1.points[2]);
    }
    
    double findArea(){
        return t1.findArea() + t2.findArea();
    }
    
    void displayPoints(){
        System.out.print("A("+t1.points[0][0] +","+t1.points[0][1]+")");
        System.out.print("---------------");
        System.out.println("B("+t1.points[1][0] +","+t1.points[1][1]+")");
        for(int i = 0 ; i < 5 ; i ++){
            System.out.print("       ");
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            System.out.print("             ");
            System.out.println("\\");
        }
        System.out.print("      D("+t2.points[1][0] +","+t2.points[1][1]+")");
        System.out.print("---------------");
        System.out.println("C("+t1.points[2][0] +","+t1.points[2][1]+")");
    }
}

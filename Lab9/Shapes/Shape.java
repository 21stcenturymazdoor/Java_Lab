package Shapes;

/**
 * Abstract shape class
 *
 * @author (21stcenturymazdoor)
 * @version (17/06/2025)
 */
public abstract class Shape
{
    abstract double getArea();
    
    abstract double getPerimeter();
    
    static double getDistance(int x1, int y1 , int x2, int y2){
        return Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2) );
    }
    
    public static void getAreaPerimeter(Shape sh){
        System.out.println("Area      : "+sh.getArea());
        System.out.println("Perimeter : "+sh.getPerimeter());
    }
}

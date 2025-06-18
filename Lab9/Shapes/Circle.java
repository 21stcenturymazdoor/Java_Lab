package Shapes;

/**
 * Circle class
 * implements abstract Shape class
 *
 * @author (21stcenturymazdoor)
 * @version (17/06/2025)
 */
public class Circle extends Shape
{
    // instance variables
    
    private double radius;
    private int centerX;
    private int centerY;
    
    public Circle(double radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    
    @Override
    public
    double getArea(){
        return Math.PI*radius*radius;
    }
    
    @Override
    public
    double getPerimeter(){
        return Math.PI*radius*2;
    }
    
    public boolean isPointInside(int x, int y){
        return getDistance(x,y, centerX, centerY) <= radius;
    }
}

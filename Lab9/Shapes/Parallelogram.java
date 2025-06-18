package Shapes;

/**
 * Parallelogram class
 * implements abstract Shape class
 *
 * assumptions : side1 , side2 are positive , acuteAngleDegree in [0,90]
 *
 * @author (21stcenturymazdoor)
 * @version (17/06/2025)
 */
public class Parallelogram extends Shape
{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private int acuteAngleDegree; //[0,...,90]
    
    public Parallelogram(double side1, double side2, int acuteAngleDegree){
        this.side1 = side1;
        this.side2 = side2;
        this.acuteAngleDegree = acuteAngleDegree;
        
        base = side1;
        height = side2 * Math.sin(Math.toRadians(acuteAngleDegree));
    }
    
    @Override
    public
    double getPerimeter(){
        return 2*(side1 + side2);
    }
    
    @Override
    public
    double getArea(){
        return base*height;
    }
    
    public boolean isRectangle(){
        return (acuteAngleDegree == 90);
    }
    
    public boolean isSquare(){
        return (acuteAngleDegree == 90 && side1 == side2);
    }
}

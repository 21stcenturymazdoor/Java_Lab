package Shapes;

/**
 * Triangle class
 * represented using 2D array
 * implements abstract Shape class
 *
 * @author (21stcenturymazdoor)
 * @version (17/06/2025)
 */
public class Triangle extends Shape
{
    // instance variables
    int[][] points;
    
    public Triangle(int[] point1, int[] point2, int[] point3){
        // arguments are expected to be array of size 2 with x and y respectively
        
        points = new int[3][2];
        
        points[0][0] = point1[0];
        points[0][1] = point1[1];
        points[1][0] = point2[0];
        points[1][1] = point2[1];
        points[2][0] = point3[0];
        points[2][1] = point3[1];
    }
    
    @Override
    public
    double getPerimeter(){
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        
        return getDistance(x1,y1,x2,y2) + getDistance(x2,y2,x3,y3) + getDistance(x3,y3,x1,y1);
    }
    
    @Override
    public
    double getArea(){
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        return Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0;
    }
    
    public boolean isRightAngleTriangle(){
        
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        
        double ab = getDistance(x1,y1,x2,y2);
        double bc = getDistance(x1,y1,x3,y3);
        double ca = getDistance(x3,y3,x2,y2);

        double abSquare = ab * ab;
        double bcSquare = bc * bc;
        double caSquare = ca * ca;

        double eps = 1e-6;

        if (Math.abs(abSquare - (bcSquare + caSquare)) < eps) {
            return true;
        } else if (Math.abs(bcSquare - (abSquare + caSquare)) < eps) {
            return true;
        } else if (Math.abs(caSquare - (abSquare + bcSquare)) < eps) {
            return true;
        }
        
        return false;
    }
    
    public boolean isIsoscelesTriangle(){
        
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        
        double ab = getDistance(x1,y1,x2,y2);
        double bc = getDistance(x1,y1,x3,y3);
        double ca = getDistance(x3,y3,x2,y2);

        if(ab == bc || bc == ca || ab == ca){
            return true;
        }
        
        return false;
    }
    
    public boolean isEquilateralTriangle(){
        
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        
        double ab = getDistance(x1,y1,x2,y2);
        double bc = getDistance(x1,y1,x3,y3);
        double ca = getDistance(x3,y3,x2,y2);

        double eps = 1e-6;
        return Math.abs(ab - bc) < eps && Math.abs(bc - ca) < eps && Math.abs(ab - ca) < eps;
    }
}

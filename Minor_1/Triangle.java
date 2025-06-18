/**
 * Triangle class
 * represented using 2D array
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
public class Triangle
{
    // instance variables
    int[][] points;
    
    Triangle(int[] point1, int[] point2, int[] point3){
        // arguments are expected to be array of size 2 with x and y respectively
        
        points = new int[3][2];
        
        points[0][0] = point1[0];
        points[0][1] = point1[1];
        points[1][0] = point2[0];
        points[1][1] = point2[1];
        points[2][0] = point3[0];
        points[2][1] = point3[1];
    }
    
    static double findDistance(int[] a, int[] b){
        // a and b are expected to be array of size 2 with x and y respectively
        return Math.sqrt(Math.pow((a[0]-b[0]),2) + Math.pow((a[1]-b[1]),2));
    }
    
    double findPerimeter(){
        return findDistance(points[0],points[1])
                + findDistance(points[0],points[2])
                + findDistance(points[1],points[2]);
    }
    
    double findArea(){
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];
        return Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0;
    }
}

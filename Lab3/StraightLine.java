/**
 * class StraightLine representing a straight line
 * with the equation ax + by + c = 0.
 *
 * @author (21stcenturymazdoor)
 * @version (11/06/2025)
 */
public class StraightLine
{
    // instance variables
    private double a;
    private double b;
    private double c;

    /**
     * Constructor for objects of class StraightLine
     */
    public StraightLine(double a, double b, double c)
    {
        this.a =a;
        this.b=b;
        this.c=c;
    }

    boolean isParallelWith(StraightLine line1){
        return (this.a/line1.a == this.b/line1.b);
    }
    
    boolean isPerpendicularWith(StraightLine line1){
        return (this.a*this.b == -1*line1.a*line1.b);
    }
    
    boolean isPointOnLine(double x1, double y1){
        return (a*x1 + b*y1 + c == 0);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("x ");
        sb.append((b >= 0 ? "+ " : "- ")).append(Math.abs(b)).append("y ");
        sb.append((c >= 0 ? "+ " : "- ")).append(Math.abs(c));
        return sb.toString();
    }
}

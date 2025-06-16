package Inheritance_Method_Overriding;

/**
 * Triangle class
 * represented using 2D array
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class RightAngleTriangle extends Triangle
{
    /**
     * Constructor for objects of class RightAngleTriangle
     */
    private double side1;
    private double side2;
    private double hypotenuse;
    private boolean isValid;

    public RightAngleTriangle(int[] a, int[] b, int[] c)
    {
        super(a, b, c);
        double ab = findDistance(a, b);
        double bc = findDistance(b, c);
        double ca = findDistance(c, a);

        double abSquare = ab * ab;
        double bcSquare = bc * bc;
        double caSquare = ca * ca;

        double eps = 1e-6;

        if (Math.abs(abSquare - (bcSquare + caSquare)) < eps) {
            hypotenuse = ab;
            side1 = bc;
            side2 = ca;
            isValid = true;
        } else if (Math.abs(bcSquare - (abSquare + caSquare)) < eps) {
            hypotenuse = bc;
            side1 = ab;
            side2 = ca;
            isValid = true;
        } else if (Math.abs(caSquare - (abSquare + bcSquare)) < eps) {
            hypotenuse = ca;
            side1 = ab;
            side2 = bc;
            isValid = true;
        } else {
            this.points = new int[][]{{-1, -1}, {-1, -1}, {-1, -1}};
            hypotenuse = side1 = side2 = -1;
            isValid = false;
            System.err.println("Error: The given points do not form a right-angled triangle.");
        }
    }

    @Override
    public
    double findPerimeter() {
        if (!isValid) {
            System.err.println("Cannot compute perimeter: Not a valid right-angled triangle.");
            return -1;
        }
        return side1 + side2 + hypotenuse;
    }

    @Override
    public
    double findArea() {
        if (!isValid) {
            System.err.println("Cannot compute area: Not a valid right-angled triangle.");
            return -1;
        }
        return (side1 * side2) / 2.0;
    }

    public String getPoints() {
        if (!isValid) {
            return "Invalid triangle points.";
        }
        return "A: (" + points[0][0] + ", " + points[0][1] + "), "
                + "B: (" + points[1][0] + ", " + points[1][1] + "), "
                + "C: (" + points[2][0] + ", " + points[2][1] + ")";
    }

    public double getHypotenuse(){
        if (!isValid) {
            System.err.println("Cannot compute hypotenuse: Not a valid right-angled triangle.");
            return -1;
        }
        return hypotenuse;
    }
    public String getSides() {
        if (!isValid) {
            return "Invalid triangle sides.";
        }
        return "Side1: " + side1 + ", Side2: " + side2 + ", Hypotenuse: " + hypotenuse;
    }

    public boolean isValid() {
        return isValid;
    }
}

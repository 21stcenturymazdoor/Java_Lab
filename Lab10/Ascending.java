/**
 * Ascending class
 * implements the MyComparable interface
 * order integers in ascending order
 * 
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class Ascending implements MyComparable
{
    /**
     * Constructor for objects of class Ascending
     */
    public Ascending()
    {
        
    }

    @Override
    public int compareTo(int first , int second){
        return (first > second) ? 1 : 
                (first == second) ? 0 : -1 ;
    }
}

/**
 * Descending class
 * implements the MyComparable interface
 * order integers in ascending order
 * 
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class Descending implements MyComparable
{
    /**
     * Constructor for objects of class Descending
     */
    public Descending()
    {
        
    }

    @Override
    public int compareTo(int first , int second){
        return (first > second) ? -1 : 
                (first == second) ? 0 : 1 ;
    }
}
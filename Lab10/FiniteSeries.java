/**
 * FiniteSeries class
 * Implements Series Interface
 *
 * @author (21stcenturymazdoor)
 * @version (18/06/2025)
 */
public class FiniteSeries implements Series
{
    // instance variables
    private int arr[];
    private int ind;
    private int start;

    /**
     * Constructor for objects of class FiniteSeries
     */
    public FiniteSeries(int arr[])
    {
        ind = start = 0;
        this.arr = arr;
    }

    public int getNext() {
        if (ind == arr.length) {
            ind = 0;
        }
        return arr[ind++];
    }
    
    public void reset(){
        start = ind = 0;
    }
    
    public void setStart(int i){
        if (i >= 0 && i < arr.length) {
            start = ind = i;
        } else {
            System.out.println("Invalid start index. Must be between 0 and " + (arr.length - 1));
        }
    }
}

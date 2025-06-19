/**
 * primeOrder class
 * implements the MyComparable interface
 * order integers in ascending order
 * 
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class primeOrder implements MyComparable
{
    /**
     * Constructor for objects of class primeOrder
     */
    public primeOrder()
    {
        
    }
    
    private int primeFactor(int num){
        int factor = 2;
        while(factor*factor <= num){
            if(num % factor == 0){
                num/= factor;
            }else{
                factor++;
            }
        }
        return num;
    }

    @Override
    public int compareTo(int first , int second){
        int pfirst = primeFactor(first);
        int psecond = primeFactor(second);
        
        return (pfirst > psecond) ? 1 : 
                (pfirst == psecond) ? 0 : -1 ;
    }
}

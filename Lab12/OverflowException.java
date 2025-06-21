/**
 * OverflowException class
 * extends Exception class
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class OverflowException extends Exception
{
    @Override
    public String toString(){
        return "Error : Overflow ! Stack Empty";
    }
}

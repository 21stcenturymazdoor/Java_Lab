/**
 * UnderflowException class
 * extends Exception class
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class UnderflowException extends Exception
{
    @Override
    public String toString(){
        return "Error : Underflow ! Stack Empty";
    }
}
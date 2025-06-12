/**
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Greetings
{
    private String Name;
    private LocalDate DOB;
    
    /**
     * Constructor for objects of class Greetings
     */
    public Greetings(String Name, String DOB)
    {
        this.Name = Name;
        this.DOB = LocalDate.parse(DOB, DateTimeFormatter.ofPattern("dd MM yyyy"));
    }

    void greetPerson(){
        //greet based on time of the day
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.of(5,0)) || now.isAfter(LocalTime.of(21,0))){
            System.out.println("Good Night, "+ this.Name);
        }
        else if(now.isBefore(LocalTime.of(12, 0)))
        {
            System.out.println("Good Morning, " + this.Name);
        }
        else if(now.isBefore(LocalTime.of(16, 0)))
        {
            System.out.println("Good Afternoon, " + this.Name);
        }
        else
        {
            System.out.println("Good Evening, " + this.Name);
        }
    }
    
    void birthdayGreetings(){
        LocalDate today = LocalDate.now();
        LocalDate thisYearsBirthday = LocalDate.of(today.getYear(), this.DOB.getMonth(), this.DOB.getDayOfMonth());

        if(today.isEqual(thisYearsBirthday)){
            System.out.println("Happy Birthday, " + this.Name);
        }
        else if(today.isBefore(thisYearsBirthday)){
            System.out.println("Advanced Happy Birthday, " + this.Name);
        }
        else{
            System.out.println("Belated Happy Birthday, " + this.Name);
        }
    }
    
    //method to calculate age in years and months
    void calculateAge(){
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.DOB, today);
        System.out.println("Age of " + this.Name + " is " + age.getYears() + " years and " + age.getMonths() + " months.");
    }
    
    String getName(){
        return this.Name;
    }
    
    String getDOB(){
        return this.DOB.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
    }
}

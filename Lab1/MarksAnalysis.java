
/**
 * prints maximum, minimum and average marks of a class for n students
 *
 * @author (21stcenturymazdoor)
 * @version (09/06/2025)
 */
import java.util.Scanner;

public class MarksAnalysis
{
    
    /**
     *
     * @param  marks[]  Array of student marks
     * @return    
     */
    public static void analyzeMarks(int[] marks)
    {
        int size = marks.length;
        int max = marks[0];
        int min = marks[0];
        int sum=0;
        
        for(int i = 0 ; i < size;i++){
            if (marks[i] > max){max = marks[i];}
            if (marks[i] < min){min = marks[i];}
            sum += marks[i];
        }
        
        System.out.println("Maximum marks ::"+max);
        System.out.println("Minimum marks ::"+min);
        System.out.println("Average marks ::"+ (double)sum/size);
    }
    
    public static void main(String[] args){
        System.out.println("-----Marks Analysis-----");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students ::");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        
        
        for(int i = 0;i<n;i++){
            System.out.print("Enter marks of student "+(i+1)+" ::");
            marks[i] = sc.nextInt();
        }
        sc.close();
        
        analyzeMarks(marks);
    }
}

/**
 * Implementation of Student class
 * includes basic information about a student and
their marks.
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Arrays;

public class Student
{
    // instance variables
    String name;
    int id;
    String regno;
    int[] marks;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int id, String regno,int[] marks)
    {
        this.name = name;
        this.id = id;
        this.regno = regno;
        this.marks = marks;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", ID=" + id +
                ", regno='" + regno + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
        {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass())
            return false;

        Student other = (Student)obj;
        
        String[] marks1 = new String[this.marks.length];
        String[] marks2 = new String[other.marks.length];
        for(int i = 0 ; i<this.marks.length;i++){marks1[i] = getGrade(this.marks[i]);}
        for(int i = 0 ; i<other.marks.length;i++){marks2[i]= getGrade(other.marks[i]);}
        
        return Arrays.equals(marks1,marks2);
    }

    // helper method for equals()
    String getGrade(int mark) {
        if (mark >= 85) {
            return "A+";
        }else if(mark >=75){
            return "A";
        }else if(mark >=65){
            return "B+";
        }else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else if (mark >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}

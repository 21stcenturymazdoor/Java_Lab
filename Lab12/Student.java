/**
 * Use class for Student
 * with hashcode implementation
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Arrays;

public class Student {

    private final String name;
    private final int id;
    private final int[] marks;
    private final String regno;

    public Student(String name, int id, int[] marks, String regno) {
        this.name = name;
        this.id = id;
        this.regno = regno;

        this.marks = new int[marks.length];
        System.arraycopy(marks, 0, this.marks, 0, marks.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        String[] marks1 = new String[this.marks.length];
        String[] marks2 = new String[other.marks.length];
        for (int i = 0; i < this.marks.length; i++) {
            marks1[i] = getGrade(this.marks[i]);
        }
        for (int i = 0; i < other.marks.length; i++) {
            marks2[i] = getGrade(other.marks[i]);
        }

        return Arrays.equals(marks1, marks2);
    }

    // Helper method for equals() and hashCode()
    String getGrade(int mark) {
        if (mark >= 85) return "A+";
        else if (mark >= 75) return "A";
        else if (mark >= 65) return "B+";
        else if (mark >= 60) return "B";
        else if (mark >= 50) return "C";
        else if (mark >= 40) return "D";
        else return "F";
    }

    public String toString() {
        return "Student{" + "name='" + name + '\''
                + ", ID=" + id
                + ", regno='" + regno + '\''
                + ", marks=" + Arrays.toString(marks)
                + '}';
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        int power = 1;
        
        for (int mark : marks) {
            switch (getGrade(mark)) {
                case "A+": hashCode += power * 1; break;
                case "A": hashCode += power * 2; break;
                case "B+": hashCode += power * 3; break;
                case "B": hashCode += power * 4; break;
                case "C": hashCode += power * 5; break;
                case "D": hashCode += power * 6; break;
                case "F": hashCode += power * 7; break;
            }
            power *= 10;
        }
        
        return hashCode;
    }
}

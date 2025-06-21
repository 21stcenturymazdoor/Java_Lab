/**
 * Use class for Student
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.*;

public class UseStudent {
    public static int[] getStudentInfo(Scanner sc) {
        System.out.print("Enter (5 Integer only) Array :: ");
        String str = sc.nextLine().trim();
        String[] strArray = str.split("\\s+");
        int[] marks = new int[5];
        
        for (int i = 0; i < 5; i++) {
            try {
                marks[i] = Integer.parseInt(strArray[i]);
                marks[i] = Math.max(0, Math.min(100, marks[i])); // Ensure marks are within [0,100]
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input detected. Setting remaining marks to 0.");
                for (; i < 5; i++) {
                    marks[i] = 0;
                }
                break;
            }
        }
        return marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student1 Name :: ");
            String name1 = sc.nextLine();
            int[] marks1 = getStudentInfo(sc);
            Student student1 = new Student(name1, 20, marks1, "23MCCE01");

            System.out.print("Enter Student2 Name :: ");
            String name2 = sc.nextLine();
            int[] marks2 = getStudentInfo(sc);
            Student student2 = new Student(name2, 21, marks2, "23MCCE02");

            System.out.print("Enter Student3 Name :: ");
            String name3 = sc.nextLine();
            int[] marks3 = getStudentInfo(sc);
            Student student3 = new Student(name3, 22, marks3, "23MCCE03");

            System.out.println("\nTesting toString() method");
            System.out.println("Student1 :: " + student1);
            System.out.println("Student2 :: " + student2);
            System.out.println("Student3 :: " + student3);

            System.out.println("\nTesting equals() method");
            System.out.println("Student1 equals Student1 :: " + student1.equals(student1));
            System.out.println("Student1 equals Student2 :: " + student1.equals(student2));
            System.out.println("Student1 equals Student3 :: " + student1.equals(student3));
            
            System.out.println("Student2 equals Student1 :: " + student2.equals(student1));
            System.out.println("Student2 equals Student2 :: " + student2.equals(student2));
            System.out.println("Student2 equals Student3 :: " + student2.equals(student3));
            
            System.out.println("Student3 equals Student1 :: " + student3.equals(student1));
            System.out.println("Student3 equals Student2 :: " + student3.equals(student2));
            System.out.println("Student3 equals Student3 :: " + student3.equals(student3));
            
            System.out.println("\nTesting hashCode() method");
            System.out.println("Student1 hashCode :: " + student1.hashCode());
            System.out.println("Student2 hashCode :: " + student2.hashCode());
            System.out.println("Student3 hashCode :: " + student3.hashCode());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

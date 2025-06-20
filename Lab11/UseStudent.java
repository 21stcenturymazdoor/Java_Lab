/**
 * UseClass for Student class
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Scanner;

public class UseStudent {

    public static int[] getStudentInfo(Scanner sc) {
        System.out.print("Enter (5 Integer only) Array :: ");
        String str = sc.nextLine().trim();
        String[] strArray = str.split("\\s");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = Integer.parseInt(strArray[i]);
            if (marks[i] > 100) {
                marks[i] = 100;
            } else if (marks[i] < 0) {
                marks[i] = 0;
            }
        }
        return marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int[] marks;
        
        System.out.print("Enter Student1 Name :: ");
        name = sc.nextLine();
        marks = getStudentInfo(sc);
        Student Student1 = new Student(name, 20, "23MCCE01",marks);

        System.out.print("Enter Student2 Name :: ");
        name = sc.nextLine();
        marks = getStudentInfo(sc);
        Student Student2 = new Student(name, 21, "23MCCE02",marks);

        System.out.print("Enter Student Name :: ");
        name = sc.nextLine();
        marks = getStudentInfo(sc);
        Student Student3 = new Student(name, 22, "23MCCE03",marks);

        System.out.println("Testing toString() method");
        System.out.println("Student1 :: " + Student1.toString());
        System.out.println("Student2 :: " + Student2.toString());
        System.out.println("Student3 :: " + Student3.toString());

        System.out.println("Student1 equals Student1 :: " + Student1.equals(Student1));
        System.out.println("Student1 equals Student2 :: " + Student1.equals(Student2));
        System.out.println("Student1 equals Student3 :: " + Student1.equals(Student3));

        System.out.println("Student2 equals Student1 :: " + Student2.equals(Student1));
        System.out.println("Student2 equals Student2 :: " + Student2.equals(Student2));
        System.out.println("Student2 equals Student3 :: " + Student2.equals(Student3));

        System.out.println("Student3 equals Student1 :: " + Student3.equals(Student1));
        System.out.println("Student3 equals Student2 :: " + Student3.equals(Student2));
        System.out.println("Student3 equals Student3 :: " + Student3.equals(Student3));

        sc.close();
    }
}

/**
 * Use class for ArrayLinearList and Stack class
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
import java.util.Scanner;

public class UseArrayStack
{
    public static void menu() {
        System.out.println("\n---MENU---");
        System.out.println("0. Exit");
        System.out.println("Press any other key to print all toString and equals comparisons.");
        System.out.print("Enter your choice: ");
    }

    public static Stack inputStack(Scanner sc, String name) {
        System.out.print("Enter number of elements for " + name + ": ");
        int n = sc.nextInt();
        Stack stack = new Stack();
        System.out.print("Enter " + n + " integer values (space-separated): ");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        return stack;
    }

    public static ArrayLinearList inputArrayLinearList(Scanner sc, String name) {
        System.out.print("Enter number of elements for " + name + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " integer values (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return new ArrayLinearList(n, arr);
    }

    public static void printAll(Stack stack1, Stack stack2, ArrayLinearList list1, ArrayLinearList list2) {
        System.out.println("\n---toString outputs---");
        System.out.println("stack1: " + stack1.toString());
        System.out.println("stack2: " + stack2.toString());
        System.out.println("ArrayLinearList1: " + list1.toString());
        System.out.println("ArrayLinearList2: " + list2.toString());

        System.out.println("\n---Stack equals comparisons---");
        System.out.println("stack1.equals(stack2): " + stack1.equals(stack2));
        System.out.println("stack2.equals(stack1): " + stack2.equals(stack1));
        System.out.println("stack1.equals(stack1): " + stack1.equals(stack1));
        System.out.println("stack2.equals(stack2): " + stack2.equals(stack2));

        System.out.println("\n---ArrayLinearList equals comparisons---");
        System.out.println("ArrayLinearList1.equals(ArrayLinearList2): " + list1.equals(list2));
        System.out.println("ArrayLinearList2.equals(ArrayLinearList1): " + list2.equals(list1));
        System.out.println("ArrayLinearList1.equals(ArrayLinearList1): " + list1.equals(list1));
        System.out.println("ArrayLinearList2.equals(ArrayLinearList2): " + list2.equals(list2));

        System.out.println("\n---Stack and ArrayLinearList cross comparisons---");
        System.out.println("stack1.equals(ArrayLinearList1): " + stack1.equals(list1));
        System.out.println("stack1.equals(ArrayLinearList2): " + stack1.equals(list2));
        System.out.println("stack2.equals(ArrayLinearList1): " + stack2.equals(list1));
        System.out.println("stack2.equals(ArrayLinearList2): " + stack2.equals(list2));
        System.out.println("ArrayLinearList1.equals(stack1): " + list1.equals(stack1));
        System.out.println("ArrayLinearList1.equals(stack2): " + list1.equals(stack2));
        System.out.println("ArrayLinearList2.equals(stack1): " + list2.equals(stack1));
        System.out.println("ArrayLinearList2.equals(stack2): " + list2.equals(stack2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create stack1:");
        Stack stack1 = inputStack(sc, "stack1");
        System.out.println("Create stack2:");
        Stack stack2 = inputStack(sc, "stack2");
        System.out.println("Create ArrayLinearList1:");
        ArrayLinearList list1 = inputArrayLinearList(sc, "ArrayLinearList1");
        System.out.println("Create ArrayLinearList2:");
        ArrayLinearList list2 = inputArrayLinearList(sc, "ArrayLinearList2");

        while (true) {
            menu();
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                sc.close();
                return;
            }
            printAll(stack1, stack2, list1, list2);
        }
    }
}

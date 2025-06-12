/**
 * Class to check whether a given string has balanced parentheses
 * 
 * A string is balanced if each opening parenthesis has a matching closing
 * parenthesis in the correct order.
 *
 *uses stack class to check for balance
 *by pushing opening parentheses onto the stack and
 *popping when a matching closing parenthesis is encountered.
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
import java.util.Scanner;

public class ParenthesisChecker
{
    public static void checkParanthesis(String str){
        int i = 0;
        char[] filteredStr = new char[str.length()];
        for(char ch : str.toCharArray()){
            switch (ch) {
                case '[', '{', '(', ']', '}', ')' -> filteredStr[i++] = ch;
            }
        }

        Stack paranthesisStack = new Stack(i);
        for(int k = 0; k < i ; k++){
            switch (filteredStr[k]) {
                case '[', '{', '(' -> paranthesisStack.push(filteredStr[k]);
                case ']' -> {
                    if(paranthesisStack.isEmpty() || paranthesisStack.pop() != '[') {
                        System.out.println("Unbalanced");
                        return;
                    }
                }
                case '}' -> {
                    if(paranthesisStack.isEmpty() || paranthesisStack.pop() != '{') {
                        System.out.println("Unbalanced");
                        return;
                    }
                }
                case ')' -> {
                    if(paranthesisStack.isEmpty() || paranthesisStack.pop() != '(') {
                        System.out.println("Unbalanced");
                        return;
                    }
                }
            }
        }
        System.out.println(paranthesisStack.isEmpty() ? "Balanced" : "Unbalanced");
    }

    public static void main(String[] args){
        System.out.println("---Paranthesis Checker---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paranthesis String ()[]{} :: ");
        String str = sc.nextLine();
        sc.close();
        checkParanthesis(str);
    }
}

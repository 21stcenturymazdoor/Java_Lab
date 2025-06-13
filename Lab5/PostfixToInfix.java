/**
 * This class helps convert postfix expressions to infix expressions
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
import java.util.Scanner;

public class PostfixToInfix
{
    static String PostToIn(String post){
        
        char[] postArr = post.toCharArray();
        
        InfixStack stack = new InfixStack(post.length());
        int i = 0;
        
        while(i != post.length()){
            switch(postArr[i]){
                case '^' , '+' , '-' , '/' , '*' ->{
                    String pop1 = stack.pop();
                    String pop2 = stack.pop();
                    String temp = "(" + pop2 + postArr[i++] + pop1 + ")";
                    stack.push(temp);
                }
                default -> stack.push(""+postArr[i++]);
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args){
        System.out.println("---Convert Postfix to Infix Expression---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter postfix Expression :: ");
        String post = sc.nextLine();
        sc.close();
        
        System.out.println("Given Postfix Expression :: "+post);
        System.out.println("Infix Expression         :: "+PostToIn(post));
        
    }
}

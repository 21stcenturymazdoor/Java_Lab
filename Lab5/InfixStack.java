/**
 * Implementation of stack data structure using an integer array.
 * Last In First Out
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
public class InfixStack
{
    // instance variables
    private String[] Stack;
    private int top;    //index at which top element sits

    /**
     * Constructor for objects of class InfixStack
     */
    public InfixStack(int size)
    {
        Stack = new String[size];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }
    
    boolean isFull(){
        return top == (Stack.length - 1);
    }
    
    String peek(){
        if(isEmpty()){
            return "";   
        }
        return Stack[top];
    }
    
    String pop(){
        if(isEmpty()){
            return "";   
        }
        return Stack[top--];
    }
    
    void push(String element){
        if(isFull()){
            System.out.println("Overflow !!! InfixStack full ");
            return;
        }
        
        Stack[++top] = element;
        System.out.println(element + " pushed onto the stack");
    }
}

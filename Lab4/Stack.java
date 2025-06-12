/**
 * Implementation of stack data structure using an integer array.
 * Last In First Out
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
public class Stack
{
    // instance variables
    private char[] Stack;
    private int top;    //index at which top element sits

    /**
     * Constructor for objects of class Stack
     */
    public Stack(int size)
    {
        Stack = new char[size];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }
    
    boolean isFull(){
        return top == (Stack.length - 1);
    }
    
    void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!!");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for(int i = top ; i >= 0 ; i--){
            System.out.print(Stack[i]);
            if(i != 0) System.out.print(", ");
        }
        System.out.println();
    }
    
    char peek(){
        if(isEmpty()){
            return ' ';   
        }
        return Stack[top];
    }
    
    char pop(){
        if(isEmpty()){
            return ' ';   
        }
        return Stack[top--];
    }
    
    void push(char element){
        if(isFull()){
            System.out.println("Overflow !!! Stack full ");
            return;
        }
        
        Stack[++top] = element;
        System.out.println(element + " pushed onto the stack");
    }
}

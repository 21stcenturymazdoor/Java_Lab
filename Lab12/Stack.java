/**
 * Implementation of stack data structure using an integer array.
 * Last In First Out
 * Added exception handling
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
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

    boolean isEmpty() throws UnderflowException{
        if(top == -1){
            throw new UnderflowException();
        }
        return false;
    }
    
    boolean isFull() throws OverflowException{
        if( top == (Stack.length - 1)){
            throw new OverflowException();
        }
        return false;
    }
    
    void displayStack(){
        try{
            isEmpty();
        }catch (UnderflowException e){
            System.out.println(e);
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for(int i = top ; i >= 0 ; i--){
            System.out.print(Stack[i]);
            if(i != 0) System.out.print(", ");
        }
        System.out.println();
    }
    
    char peek() throws UnderflowException{
        isEmpty();
        
        return Stack[top];
    }
    
    char pop() throws UnderflowException{
        isEmpty();
        
        return Stack[top--];
    }
    
    void push(char element) throws OverflowException{
        isFull();
        
        Stack[++top] = element;
        System.out.println(element + " pushed onto the stack");
    }
}

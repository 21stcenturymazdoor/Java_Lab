/**
 * Stack implementation
 * extends ArrayLinearList
 *
 * @author (21stcenturymazdoor)
 * @version (19/06/2025)
 */
public class Stack extends ArrayLinearList
{
    private int top;    // index at which top element sits

    /**
     * Constructor for objects of class Stack
     */
    public Stack()
    {
        super();
        top = -1;
    }

    @Override
    public boolean isEmpty(){
        return top == -1;
    }

    // --- Overridden methods to restrict direct access ---

    @Override
    public int size() {
        System.out.println("Error: method not accessible on Stack. Use stack-specific methods.");
        return -1;
    }

    @Override
    public int get(int index) {
        System.out.println("Error: method not accessible on Stack. Use peek() or pop().");
        return -999;
    }

    @Override
    public int indexOf(int theElement) {
        System.out.println("Error: method not accessible on Stack.");
        return -1;
    }

    @Override
    public int remove(int index) {
        System.out.println("Error: method not accessible on Stack. Use pop().");
        return -999;
    }

    @Override
    public void add(int index, int theElement) {
        System.out.println("Error: method not accessible on Stack. Use push().");
    }

    // --- Stack-specific methods using super class methods ---

    boolean isFull(){
        return top == (arr.length - 1);
    }

    void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!!");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for(int i = top ; i >= 0 ; i--){
            System.out.print(arr[i]);
            if(i != 0) System.out.print(", ");
        }
        System.out.println();
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!!");
            return -999;
        }
        return super.get(top);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!!");
            return -999;
        }
        int value = super.remove(top);
        top--;
        return value;
    }

    void push(int element){
        if(isFull()){
            System.out.println("Overflow !!! Stack full ");
            return;
        }
        super.add(++top, element);
    }
}

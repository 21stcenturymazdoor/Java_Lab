package List_SortedList;

/**
 * List class stores values in  an array
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class List
{
    // instance variables 
    protected int[] arr;
    protected int size;

    /**
     * Constructor for objects of class SortedList
     */
    public List()
    {
        arr = new int[50];//list to contain max 50 value
        size = 0;
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public boolean isFull(){
        return (size == arr.length);
    }

    public void insert(int value){
        if(isFull()){
            System.out.println("List is Full");
            return;
        }
        
        arr[size++] = value;
        System.out.println("Value Inserted");
    }
    
    public void delete(int value){
        if(isEmpty()){
            System.out.println("List is Empty !!!");
            return;
        }
        
        int i = 0;
        while(i < size){
            if(arr[i] == value){
                break;
            }
            i++;
        }
        
        if(i == size){
            System.out.println(value + " Not in List");
            return;
        }
        
        size--;
        
        for(int j = i ; j < size ; j++){
            arr[j] = arr[j+1];
        }
    }
    
    public int find(int value){
        if(isEmpty()){
            System.out.println("The List is Empty !!!");
            return -1;
        }
        
        for(int i = 0 ; i < size ; i++){
            if(arr[i] == value){
                return i;
            }
        }
        
        return -1;
    }
}

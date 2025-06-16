package List_SortedList;

/**
 * List class stores elements in  an array
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
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
        arr = new int[50];//list to contain max 50 element
        size = 0;
    }
    
    boolean isEmpty(){
        return (size == 0);
    }
    
    boolean isFull(){
        return (size == arr.length);
    }

    void insert(int value){
        if(isFull()){
            System.out.println("List is Full");
            return;
        }
        
        arr[size++] = value;
        System.out.println("Element Inserted");
    }
    
    void delete(int value){
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
    
    int find(int value){
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

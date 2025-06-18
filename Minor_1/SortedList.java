/**
 * SorteList class stores elements in sorted order in an array
 * Assumption : all element are distinct
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
public class SortedList
{
    // instance variables 
    private int[] arr;
    private int size;

    /**
     * Constructor for objects of class SortedList
     */
    public SortedList()
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

    void insert(int element){
        if(isFull()){
            System.out.println("List is Full");
            return;
        }
        int i = 0;
        while(i < size && arr[i] < element){
            i++;
        }
        for(int j = size; j > i; j--){
            arr[j] = arr[j-1];
        }
        arr[i] = element;
        size++;
        System.out.println("Element Inserted");
    }
    
    void delete(int element){
        if(isEmpty()){
            System.out.println("List is Empty !!!");
            return;
        }
        
        int index = binarySearch(element);
        
        if(index == -1){
            System.out.println("Element not in List !!!");
        }else{
            size--;
            for(int i = index ; i < size; i++){
                arr[i] = arr[i+1];
            }
            System.out.println("Element deleted from List");
        }
    }
    
    int binarySearch(int element){
        int first = 0;
        int last = size-1;
        
        while(first <= last){
            int mid = (first + last)/2;
            if(element == arr[mid]) {
                return mid;
            }else if(element < arr[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }
    
    void displayList(){
        if(isEmpty()){
            System.out.println("The List is Empty !!!");
            return;
        }
        
        System.out.print("[ "+arr[0]);
        for(int i = 1 ; i < size ; i++){
            System.out.print(" , "+arr[i]);
        }
        System.out.println(" ]");
    }
}

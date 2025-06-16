package List_SortedList;
/**
 * SortedList inherits List
 * Assumption : all values are distinct
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class SortedList extends List
{
    /**
     * Constructor for objects of class SortedList
     */
    public SortedList()
    {
        super();
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public boolean isFull(){
        return (size == arr.length);
    }

    int binarySearch(int value){
        int first = 0;
        int last = size - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -first;
    }

    @Override
    public
    int find(int value){
        return binarySearch(value);
    }

    @Override
    public
    void insert(int value){
        if(isFull()){
            System.out.println("List is Full");
            return;
        }
        int index = binarySearch(value);
        int insertPos = (index >= 0) ? index : -index;
        for(int j = size; j > insertPos; j--){
            arr[j] = arr[j-1];
        }
        arr[insertPos] = value;
        size++;
        System.out.println("Value Inserted");
    }
    
    @Override
    public
    void delete(int value){
        if(isEmpty()){
            System.out.println("List is Empty !!!");
            return;
        }
        int index = binarySearch(value);
        if(index < 0){
            System.out.println("Value not in List !!!");
        }else{
            size--;
            for(int i = index ; i < size; i++){
                arr[i] = arr[i+1];
            }
            System.out.println("Value deleted from List");
        }
    }
}

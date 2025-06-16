package List_SortedList;
/**
 * SorteList inherits List
 * Assumption : all element are distinct
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
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
    
    boolean isEmpty(){
        return (size == 0);
    }
    
    boolean isFull(){
        return (size == arr.length);
    }

    int binarySearch(int element){
        int first = 0;
        int last = size - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (element < arr[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -first;
    }

    @Override
    int find(int value){
        return binarySearch(value);
    }

    @Override
    void insert(int element){
        if(isFull()){
            System.out.println("List is Full");
            return;
        }
        int index = binarySearch(element);
        int insertPos = (index >= 0) ? index : -index;
        for(int j = size; j > insertPos; j--){
            arr[j] = arr[j-1];
        }
        arr[insertPos] = element;
        size++;
        System.out.println("Element Inserted");
    }
    
    @Override
    void delete(int element){
        if(isEmpty()){
            System.out.println("List is Empty !!!");
            return;
        }
        int index = binarySearch(element);
        if(index < 0){
            System.out.println("Element not in List !!!");
        }else{
            size--;
            for(int i = index ; i < size; i++){
                arr[i] = arr[i+1];
            }
            System.out.println("Element deleted from List");
        }
    }
}

/**
 * a Max Heap data structure using an array-based implementation
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
public class MaxHeap
{
    // instance variables
    private int[] heap;
    private int size;
    
    MaxHeap(int level){
        this.size = 0;
        heap = new int[ (int)Math.pow(2,level) - 1 ];
    }
    
    boolean isFull(){
        return size == heap.length;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    void display_heap(){
        System.out.print("Heap Elements :: ");
        for(int i = 0; i < size ; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    
    void insert(int element){
        if(isFull()){
            System.out.println("Heap is Full !!!");
            return;
        }
        heap[size] = element;
        heapifyUp(size);
        size++;
    }
    
    void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[index] > heap[parent]) {
                int temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
                index = parent;
            } else {
                break;
            }
        }
    }
    
    int delete(){
        if(isEmpty()){
            System.out.println("Heap is Empty !!!");
            return -999;
        }
        
        int temp = heap[0];
        
        heap[0] = heap[--size];
        heapifyDown(0);
        
        return temp;
    }
    
    int heapifyDown(int index){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            // Recursively heapify the affected subtree
            heapifyDown(largest);
        }
        return largest;
    }
    
    void build_heap(int[] array){
        if (array == null || array.length == 0) {
            return;
        }
        this.size = Math.min(array.length, heap.length);
        for (int i = 0; i < this.size; i++) {
            heap[i] = array[i];
        }
        for (int i = (this.size / 2) - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }
}

/**
 * Write a description of class CircularQueue here.
 *
 * @author (21stcenturymazdoor)
 * @version (12/06/2025)
 */
public class CircularQueue
{
    // instance variables 
    private int[] queue;
    private int rear;
    private int front;
    private int count = 0;

    /**
     * Constructor for objects of class CircularQueue
     */
    public CircularQueue(int size)
    {
        queue = new int[size];

        front = rear = 0;
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == queue.length;
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.print("Queue: ");
        int printed = 0;
        int i = (front + 1) % queue.length;
        while (printed < count) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length;
            printed++;
        }
        System.out.println();
    }

    void enqueue(int element) {
        if (count == queue.length) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        count++;
        System.out.println(element + " enqueued");
    }

    int dequeue() {
        if (count == 0) {
            System.out.println("Underflow !!! Queue Empty");
            return -999;
        }
        front = (front + 1) % queue.length;
        count--;
        return queue[front];
    }
}

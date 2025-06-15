package Queue;
/**
 * Implementation of queue using Singly linked list
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */


import Linked_List.Node;

public class QueueSLL
{
    // instance variables
    private Node front;
    private Node rear;
    
    public QueueSLL(){
        front = rear = null;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public int dequeue(){
        if (front == null) {
            return -999;
        }
        Node temp = front;
        front = front.next;
        if (front == null) { // If queue becomes empty
            rear = null;
        }
        int tempData = temp.data;
        temp = null;
        
        return tempData;
    }
    
    public void enqueue(int data){
        Node newNode = new Node(data, null);
        if (rear == null) { // If queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    
    public void display(){
        System.out.print("Front --> ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("rearEnd");
    }
}

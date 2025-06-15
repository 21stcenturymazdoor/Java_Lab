package Linked_List_Object_Oriented;
/**
 * Implementation of Singly linked list
 *
 * To showcase inter-object communication between Node and SLL
 * Node object has the methods instead of SLL
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
public class SLL
{
    // instance variables
    private Node head;
    
    public SLL(){
        head = null;
    }
    
    public void insertAtBegin(int d){
        head = new Node(d, head);
    }
    
    public int deleteAtBegin(){
        if (head == null) {
            return -999;
        }
        
        int val = head.data;
        
        Node temp = head;
        head = head.next;
        temp = null;
        
        return val;
    }
    
    public void insertAtEnd(int d){
        if (head == null) {
            head = new Node(d, null);
        } else {
            head.insertAtEnd(d);
        }
    }
    
    public void deleteByValue(int value){
        head = (head != null) ? head.deleteByValue(value) : null ;
    }
    
    public int getSum(){
        int sum = 0;
        if(head != null){
            sum += head.getSum();
        }
        
        return sum;
    }
    
    public void display(){
        System.out.print("Head --> ");
        if(head != null){
            head.display();
        }
        System.out.println("null");
    }
}

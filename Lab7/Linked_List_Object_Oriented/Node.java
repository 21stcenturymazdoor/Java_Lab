package Linked_List_Object_Oriented;
/**
 * The Node class represents a node in the SLL.
 *
 * To showcase inter-object communication between Node and SLL
 * Node object has the methods instead of SLL
 * Node recursively calls the method
 *
 * @author (21stcenturymazdoor)
 * @version (15/06/2025)
 */
public class Node
{
    // instance variables
    public int data;
    public Node next;
    
    Node(int d){
        this.data = d;
        this.next = null;
    }
    
    public Node(int d, Node n){
        this.data = d;
        this.next = n;
    }
    
    void setNext(Node n){
        this.next = n;
    }
    
    void insertAtEnd(int d){
        if(next != null){
            next.insertAtEnd(d);
            return;
        }
        
        this.next = new Node(d,null);
    }
    
    Node deleteByValue(int value) {
        if (this.next != null) {
            this.next = this.next.deleteByValue(value);
        }
        if (this.data == value) {
            return this.next;
        } else {
            return this;
        }
    }
    
    int getSum(){
        if(next != null){
            return this.data + next.getSum();
        }
        
        return data;
    }
    
    void display(){
        System.out.print(data + " --> ");
        if(next != null){
            next.display();
        }
    }
}

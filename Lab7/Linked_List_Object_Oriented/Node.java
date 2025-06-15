package Linked_List_Object_Oriented;
/**
 * The Node class represents a node in the SLL.
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
}

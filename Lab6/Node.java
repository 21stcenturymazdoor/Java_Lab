/**
 * The Node class represents a node in the SLL.
 *
 * @author (21stcenturymazdoor)
 * @version (14/06/2025)
 */
public class Node
{
    // instance variables
    int data;
    Node next;
    
    Node(int d){
        this.data = d;
        this.next = null;
    }
    
    Node(int d, Node n){
        this.data = d;
        this.next = n;
    }
    
    void setNext(Node n){
        this.next = n;
    }
}

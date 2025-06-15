package Linked_List_Object_Oriented;
/**
 * Implementation of Singly linked list
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
        Node n = new Node(d,head);
        head = n;
    }
    
    public int deleteAtBegin(){
        if (head == null) {
            return -999;
        }
        Node temp = head;
        head = head.next;

        int tempData = temp.data;
        temp = null;
        
        return tempData;
    }
    
    public void insertAtEnd(int d){
        Node newNode = new Node(d, null);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void deleteByValue(int d){
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (curr.data == d) {
                if (prev == null) {
                    // Deleting head node
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }

                //freeing up the node
                Node toDelete = curr;
                curr = curr.next;
                toDelete = null;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }
    
    public int getSum(){
        Node temp = head;
        int sum = 0;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        
        return sum;
    }
    
    public void display(){
        System.out.print("Head --> ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

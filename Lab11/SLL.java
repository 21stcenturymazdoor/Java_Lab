 /**
 * Implementation of Singly linked list
 * Modified Lab6 program
 * Added toString() , equals() , copy constructor
 *
 * @author (21stcenturymazdoor)
 * @version (20/06/2025)
 */
public class SLL
{
    // instance variables
    Node head;
    
    public SLL(){
        head = null;
    }
    
    public SLL(SLL sll){
        head = sll.head;
        
        Node temp = sll.head;
        while(temp != null){
            this.insertAtEnd(temp.data);
            temp = temp.next;
        }
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
    
    public String toString(){
        String str = "";
        Node temp = head;
        
        while (temp.next != null) {
            str += temp.data + " --> ";
            temp = temp.next;
        }
        str += temp.data;
        
        return str;
    }
    
    public boolean equals(SLL other){
        if (other == null) return false;
        Node temp1 = this.head;
        Node temp2 = other.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }
}

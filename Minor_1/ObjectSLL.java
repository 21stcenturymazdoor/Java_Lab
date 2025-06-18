/**
 * SLL
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
class ObjectSLL
{
    // instance variables
    Node head;

    /**
     * Constructor for objects of class SLL
     */
    public ObjectSLL()
    {
        this.head = null;
    }

    void insertAfter(int position, int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        
        if(position <= 0 ){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return;
        }
        
        head.insertAfter(position, 0 , data);
    }
    
    int Max(){
        return (head == null) ? -999 : head.getMax(-999);
    }
    
    int Length(){
        return (head == null) ? 0 : head.getLength(0);
    }
    
    void deleteNode(int position){
        if(head == null) return;
        head = head.deleteNode(position, -1);
    }
    
    void reverseList(){
        if(head == null) return;
        
        head = head.getReverse(null);
    }
    
    void displayList(){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        System.out.print("Head --> ");
        head.display();
    }
}

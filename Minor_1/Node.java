/**
 * Node
 *
 * @author (21stcenturymazdoor)
 * @version (XX/0X/2025)
 */
class Node
{
    // instance variables
    int data;
    Node next;
    
    /**
     * Constructor for objects of class Node
     */
    public Node(int data)
    {
        this.data = data;
        next = null;
    }

    int getMax(int currentMax){
        if(next == null){
            return (data > currentMax) ? data : currentMax;
        }
        
        return (data > currentMax) ? getMax(data) : getMax(currentMax) ; 
    }
    
    Node getReverse(Node prevNode) {
        Node newHead = this;
        if (next != null) {
            newHead = next.getReverse(this);
        }
        next = prevNode;
        return newHead;
    }
    
    int getLength(int currLength){
        currLength++;
        if(next == null){
            return currLength;
        }
        return next.getLength(currLength);
    }
    
    void insertAfter(int pos, int currPos, int newData){
        currPos++;
                
        if(pos == currPos){
            System.out.println("Node added at Position : " + pos);
            Node newNode = new Node(newData);
            newNode.next = this.next;
            next = newNode;
            return;
        }
        
        if(next == null){
            System.out.println("Node added at the end");
            Node newNode = new Node(newData);
            next = newNode;
            return;
        }
        
        next.insertAfter(pos,currPos,newData);
    }
    
    Node deleteNode(int pos, int currPos) {
        currPos++;
        if (pos == currPos) {
            return next;
        }
        if (next == null) {
            System.out.println("Node not in List");
            return this;
        }
        next = next.deleteNode(pos, currPos);
        return this;
    }
    
    void display(){
        System.out.print( data +" --> ");
        if (next == null) {
            System.out.println("Null");
        } else {
            next.display();
        }
    }
}

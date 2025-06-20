class Stack extends ArrayLinearList {    
    private int top;
    
    public Stack() {
        super();
        top = -1;
    }
    
    public void push(int item) {
        if (n >= 100) {
            System.out.println("Stack Overflow. Cannot add more elements.");
        } else {
            super.add(n, item);
            top = n - 1;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Stack is empty.");
            return -999;
        } else {
            int item = super.remove(top);
            top--;
            return item;
        }
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -999;
        } else {
            return super.get(top);
        }
    }
    
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void add(int index, int theElement) {
        System.out.println("Error: Cannot use add() method on a stack.");
    }
    
    @Override
    public int get(int index) {
        System.out.println("Error: Cannot use get() method on a stack.");
        return -1;
    }
    
    @Override
    public int remove(int index) {
        System.out.println("Error: Cannot use remove() method on a stack.");
        return -1;
    }
    
    @Override
    public int indexOf(int theElement) {
        System.out.println("Error: Cannot use indexOf() method on a stack.");
        return -1;
    }
    
    @Override
    public String toString(){
	 String str = "[Top->";
            for(int i = 0; i < n; i++){
	        str += i+",";
            }
	 return str+"Bottom]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Stack)) return false;
        Stack other = (Stack) obj;
        if (this.top != other.top) return false;
        for (int i = top; i > -1; i--) {
            if (this.arr[i] != other.arr[i]) {
                return false;
            }
        }
        return true;
    }
}
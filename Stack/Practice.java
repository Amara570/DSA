package Stack;

public class Practice {
/* 
    int arr[];
    int size;
    int top;

    Practice(int size)
    {
        arr = new int[size];
        this.size = size;
        top = -1;
    }
    public void push(int data)
    {
        if(top == size-1)
        {
            System.out.println("stack overflow");
        }
        else{
            top++;
            arr[top] = data;
            System.out.println("Insert" + data);
        }
    }
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int val = arr[top];
            top--;
            System.out.println("delete" + val);
            return val;
        }
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size-1;
    }
    public int peek()
    {
        return arr[top];
    }
    public static void main(String[] args) {
        
        Practice p = new Practice(5);

        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);

        System.out.println();

        System.out.print("Peek "+p.peek());
        System.out.println();
        p.pop();
        p.pop();
        p.pop();

        System.out.println();

       System.out.println( p.isEmpty());
        System.out.println(p.isFull());

        System.out.println();

        p.pop();
        p.pop();
        System.out.println( p.isEmpty());
    }
        */

        class Node{
            int data;
            Node next;

            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        Node head ;

        Practice()
        {
            this.head = null;
        }

        public void push(int data )
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
            }else{
                 newNode.next = head;
                head = newNode;
            }
        }
        public int pop()
        {
            if(head == null)
            {
                return -1;
            }
            else{
                int k = head.data;
                head = head.next;
                return k;
            }
             
        }
        public boolean isEmpty(){
            return head == null;
        }
        public int peek(){
            return head.data;
        }
        public void display()
        {
            if(isEmpty())
            {
                System.out.println("Underflow");
            }
            else{
                Node curr = head;
                while (curr != null) {
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                }
            }
        }

        public static void main(String[] args) {
            Practice p = new Practice();

            p.push(10);
            p.push(20);
            p.push(30);
            p.push(40);
            p.push(50);
    
            p.display();
    
            System.out.println();

            System.out.print("Peek "+p.peek());
            System.out.println();
          System.out.println("Popped "+p.pop());
          System.out.println("Popped "+p.pop());
          System.out.println("Popped "+p.pop());
    
            System.out.println();
    
           System.out.println( p.isEmpty());
           
    
            System.out.println();
    
            System.out.println("Popped "+p.pop());
            System.out.println("Popped "+p.pop());
            System.out.println( p.isEmpty());
        }
        
    
}

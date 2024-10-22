package Stack;
 
public class StackLink {
    
    public  class Node 
    { 
        int data;       // integer data   
        Node next;  // pointer to the next node 
    
        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
     
    
   private Node head; 
 
    public StackLink() { 
        this.head = null; 
    } 
 
    // Utility function to add an element x in the stack   
    public void push(int data) // insert at the beginning   
    { 
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        System.out.println("inserting :" + data);

          
    } 
 
    // Utility function to check if the stack is empty or not   
    public boolean isEmpty() 
    { 
       if(head == null)
       {
        return true;
       }
       return false;
         
    } 
 
    // Utility function to return top element in a stack   
    public void top() 
    { 
       if(head !=null)
       {
        System.out.println( "top element is: "+ head.data);
       }    
    } 
 
    // Utility function to pop top element from the stack and check for Stack underflow   
    public int pop() // remove at the beginning   
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

 
 

    public static void main(String[] args) 
    { 
        StackLink stackk = new StackLink(); 
 
        stackk.push(1); 
        stackk.push(2); 
        stackk.push(3); 
 
          stackk.top(); 
 
      System.out.println("deleting : "+stackk.pop()); 
      System.out.println("deleting : "+stackk.pop());
      System.out.println("deleting : "+stackk.pop());
 
        if (stackk.isEmpty()) { 
            System.out.print("Stack is empty"); 
        } else { 
            System.out.print("Stack is not empty"); 
        } 
    } 
}
    


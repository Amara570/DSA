package Lab_4;
import java.util.Queue;
 

class Node 
{ 
    int data;       // integer data   
    Node next;      // pointer to the next node   
 
    public Node(int data) 
    { 
        // set the data in allocated node and return the node   
        this.data = data; 
        this.next = null; 
    } 
} 
 
class QueueList
{ 
    private static Node rear = null, front = null; 
    static int size=0;
 
    // Utility function to remove front element from the queue and check for Queue Underflow   
    public static int dequeue()     // delete at the beginning   
    { 
       if(front == null)
        {
            System.out.println("Underflow");
            return -1;
        }
        else{
           int dequeue=front.data;
            front = front.next;
            System.out.println("Dequeued: " + dequeue);
            size--;
            return dequeue;
        }
        
    } 
 
    // Utility function to add an item in the queue   
    public static void enqueue(int data)    // insertion at the end   
    { 
        Node newNode = new Node(data);
         if(front == null)
         {
            front= newNode;
            rear = newNode;
         }
         else{
            rear.next = newNode;
            rear = newNode;
         }
         size++;
          
        System.out.println("Enqueued: " + data);
    } 
 
    // Utility function to return top element in a queue   
    public static int peek() 
    { 
        if (isEmpty()) {
            System.out.println("Queue Underflow ");
            return -1;   
        }
        return front.data;
        
    } 
 
    // Utility function to check if the queue is empty or not   
    public static boolean isEmpty() 
    { 
        return front == null;
    } 
    public int size() {
        return size-1;  // Return the size of the queue
    }
} 
 
class Main { 
    public static void main(String[] args) 
    { 
        QueueList q = new QueueList(); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        q.enqueue(4); 
 
        System.out.printf("Front element is %d\n", q.peek()); 
 
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
 
        if (q.isEmpty()) { 
            System.out.print("Queue is empty"); 
        } else { 
            System.out.print("Queue is not empty"); 
        } 
    } 
} 
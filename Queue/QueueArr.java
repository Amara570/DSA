package Queue;

public class QueueArr {
    
    private int arr[]; 
    private int front; 
    private int rear; 
    private int size; 
    private int count; 
 
    // Constructor to initialize queue   
    QueueArr(int size) 
    { 
        arr = new int[size]; 
       this. size = size; 
        front = -1; 
        rear = -1; 
        count = 0; 
    } 
 
    // Utility function to remove front element from the queue and check for Queue Underflow   
    public void dequeue() 
    { 
        if(front == -1)
        {
            System.out.println("Queue Underflow");
        }
        else{
            
            System.out.println("Deleting : " + arr[front]);
            front = front+1;
            count--;
        }
    } 
 
    // Utility function to add an item to the queue and check for queue overflow   
    public void enqueue(int data) 
    { 
        if(rear == (size-1))
        {
            System.out.println("queue overflow");
        }
        else{
             
            if(front==-1 && rear==-1)
            {
                front = 0;
                rear = 0;
                arr[rear] = data;
                
            }
            else{
                rear = rear+1;
                arr[rear] = data;
            }
            count++;
            System.out.println("Inserting : " + data);
        }

    } 
 
    // Utility function to return front element in the queue and check for Queue Underflow   
    public int peek() 
    { 
        if (isEmpty()) {
            System.out.println("Queue Underflow: No elements to peek");
            return -1;   
        } else {
            return arr[front];
        }
    } 
 
    // Utility function to return the size of the queue   
    public int size() 
    { 
       return count;  
    } 
 
    // Utility function to check if the queue is empty or not   
    public Boolean isEmpty() 
    { 
       return count==0;
    } 
 
    // Utility function to check if the queue is empty or not   
     public Boolean isFull() 
    { 
       return count == size;   
    } 
    
} 
 
class Main 
{ 
    // main function   
    public static void main (String[] args) 
    { 
        // create a queue of capacity 5   
        QueueArr q = new QueueArr(5); 
 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
 
         System.out.println("Front element is: " + q.peek()); 
         q.dequeue(); 
        System.out.println("Front element is: " + q.peek()); 
 
        System.out.println("Queue size is " + q.size()); 
 
        q.dequeue(); 
        q.dequeue(); 
 
        if (q.isEmpty()) 
            System.out.println("Queue Is Empty"); 
        else 
            System.out.println("Queue Is Not Empty"); 
    } 
}  
    


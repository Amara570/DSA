package Lab_4;

public class QueueStack extends Stack {
     
        public Stack s1, s2; 
         
        // Constructor   
        QueueStack(int size) { 
            super(size);
            s1 = new Stack(size); 
            s2 = new Stack(size); 
            
        
        } 
     
        // Enqueue an item to the queue   
        public void enqueue(int data) 
        { 
            s1.push(data);
            
        } 
     
        // Dequeue an item from the queue   
        public int dequeue() 
        { 
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue Underflow ");
                return -1;  
            }  
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
                 return s2.pop(); 
        } 
     
    public static void main(String[] args) { 
    int[] keys = { 1, 2, 3, 4, 5 }; 
    QueueStack q = new QueueStack(5); 
    // insert above keys 
       
    for (int key : keys) { 
         
    q.enqueue(key); 
    } 
     // print 1 
            System.out.println(q.dequeue());    
        // print 2   
            System.out.println(q.dequeue());    
        // print 3  
        System.out.println(q.dequeue()); 
        
    } 
    }  
    


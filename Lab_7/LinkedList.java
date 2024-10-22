package Lab_7;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

 
public class LinkedList {
   
    Node head ;
     
    
    public  void Iterative()
    {
        
        Node  temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }

    }

    public void Recursive(Node head)
    {
       
        if(head == null)
        {
            return;
        } 
        else{
            
            System.out.print(head.data + "  ");
            Recursive(head.next);
        }
    }
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList(); 

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.print("Iteration : ");
        list.Iterative();

        System.out.print("\nRecursion : ");
        list.Recursive(list.head);
        
       
        
    }
    
}

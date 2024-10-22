package Lab_3;

public class Reverse {

    static class Node{ 
        int data; 
        Node next; 
        Node prev; 
        //Constructor 
        Node(int data) 
        { 
        this.data=data; 
        this.next=null; 
        } 
}
    Node head;
    public Node ReverseList(Node head2)
    {
        if(head == null)
        {
            return null;
        } 
        
         Node temp = head;
         while(temp !=null)
         {
            head2 = addFirst(temp.data,head2);
            temp = temp.next;
         }
         return head2;
    }

   public  Node addFirst(int data, Node head)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return head;
        }
        else{
            newNode.next = head;
            head = newNode;
            return head;
        }
    }
    public void traverser()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("LL does not exists!");
        }
        else{
            while (temp != null)
             {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        
        Reverse rev = new Reverse();
        Node head = null;
        rev.addFirst(10, head);
        rev.addFirst(20, head);
        rev.traverser();

        rev.ReverseList(head);
        rev.traverser();
    }
    
}

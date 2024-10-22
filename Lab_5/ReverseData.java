package Lab_5;

public class ReverseData {

    static class Node{
        Object data;
        Node next;

        Node(Object data)
        {
            this.data = data;
            this.next = null;
        }

    }
    Node head;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }
    static int getLength(Node head)
    {
        Node current = head;
        int length = 0;

        while(current.next != null)
        {
            length++;
            current = current.next;
        }
        return length;
    }
    static void printReverse(Node head)
    {
         
        int length = getLength(head);

        for(int i=length; i>=0; i--)
        {
           Node current = head;
           int count =0;
           while(count < i)
           {
            current = current.next;
            count++;
           }
           System.out.print(current.data+ "   " );
      }
   
   }
   public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    
    ReverseData rev = new ReverseData();
    
    rev.addFirst(6);
    rev.addFirst(5);
    rev.addFirst(4);
    rev.addFirst(3);
    rev.addFirst(2);
    rev.addFirst(1);
    System.out.print("original List : ");
    rev.printList();
    
   
   System.out.print("Reversed List : ");
   rev.printReverse(rev.head);
    
   System.out.println();
   System.out.print("original List : ");
   rev.printList();
   
    

    
    
    
    




}
    
}

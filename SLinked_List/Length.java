package SLinked_List;

public class Length {

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    Node head;

    void addToBack(int data)
    {
    Node node=new Node(data);
 
        if(head==null)
        head=node;
        else{
        Node temp=head;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=node;
        }
    }
    void traverser()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    void Length()
    {
        if(head == null)
        {
            System.out.println("LL does not exists");
        }
        else{
            Node temp = head;
            int current=0;
            while(temp.next != null)
            {
                current++;
                temp = temp.next;

            }
            System.out.println("\nLength of the LL is:" + current);
        }
    }
    void MaxElement()
    {
        Node temp = head;
        int max = 0;
        while(temp != null)
        {
            if(temp.data > max)
            {
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.print("Maximum element of LL: "+ max);
    }
    public static void main(String[] args) {
        
        Length L2 = new Length();
        L2.addToBack(10);
        L2.addToBack(20);
        L2.addToBack(30);
        L2.addToBack(40);
        L2.addToBack(50);

        L2.traverser();
        L2.Length();
        L2.MaxElement();
    }
    
}

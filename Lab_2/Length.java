package Lab_2;

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
    Node head = null;

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
    void printList() {
        Node node = head;
        while (node.next != null){
        System.out.print(node.data + " ");
        node = node.next;
        }
        System.out.print(node.data + " ");
    }
public void Length()
{
        if(head == null)
        {
            System.out.println("Linked List does not exist");
        }
        else{
            Node temp = head;
            int length = 0;
            while(temp.next != null)
            {
                length++;
                temp = temp.next;
                 
            }
            System.out.print("The Length of the LL is :"+length);
        }
}
public static void main(String[] args) {
     
    Length L = new Length();

    L.addToBack(1);
    L.addToBack(2);
    L.addToBack(3);
    L.addToBack(4);
    L.addToBack(5);
    L.addToBack(6);

    L.Length();
    

}

    
}

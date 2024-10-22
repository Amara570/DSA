package Doubly_LL;

public class First {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    Node head = null;
    Node tail = null;

    public void create(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void traverse()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("LL doesn't exist");
        }
        else{
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    public static void main(String[] args) {
        
        First f = new First();
       f.create(5);
       f.create(6);
       f.create(7);
       f.traverse();


    }
}

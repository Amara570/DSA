package Assignment_1;

public class Swap {

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

    public void sort()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            int size = 0;

            while(temp != null)
            {
                 if(temp.data > temp.next.data)
                 {
                    temp.data = temp.next.data;
                    temp.next.data = temp.data;
                    temp = temp.next;
                    size++;

                 }
            }
        }

    }
    

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

    public static void main(String[] args) {
        
        Swap s = new Swap();
        s.addToBack(50);
        s.addToBack(40);
        s.addToBack(30);
        s.addToBack(20);
        s.addToBack(10);
        s.printList();

        s.sort();
        s.printList();
    }
    
}

package Lab_3;

public class Tail {
    public static class Node { 
        String name; 
        Node prev, next; 
     
        Node (String name) 
        { 
            this.prev = null; 
            this.next = null; 
            this.name = name; 
        } 
    }  
     
    Node head;
    Node tail;

    public void InsertFirst(String Name)
    {
        Node newNode = new Node(Name);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void InsertLast(String name)
    {
        Node newNode = new Node(name);

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void SpecificInsert(String name,int index)
    {
        Node temp = head;
        Node ptr = temp.next;

        Node newNode = new Node(name);
        for(int i=1; i<index-1; i++)
        {
            temp = ptr;
            ptr = ptr.next;
        }
        newNode.prev = temp;
        newNode.next = ptr;
        temp.next = newNode;
        ptr.prev = newNode;

    }
     public void removeFirst()
     {
        if(head == null )
        {
            System.out.println("LL is empty");
        }
        else{
            Node temp = head;
                temp = temp.next;
                head = temp;
                head.prev = null;
        }
     }
     public void removeLast()
     {
        if(head == null )
        {
            System.out.println("LL is empty");
        }
        else{
            Node temp1 = tail;
            temp1 = temp1.prev;
            temp1.next = null;
            tail = temp1;
        }
     }
     public void removeSpecific(int index)
     {
        Node temp2 = head;
        Node ptr1 = temp2.next;
        for(int i=1; i < (index-1); i++)
         {
            temp2 = ptr1;
            ptr1 = ptr1.next;
        }
        temp2.next = ptr1.next;
        ptr1.next.prev = temp2;
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
                 System.out.println(temp.name);
                 temp = temp.next;
             }
         }
     }
     public static void main(String[] args) {
        
        Tail t1 = new Tail();

        System.out.println(" Initial Linked List");
        t1.InsertFirst("Zameera");
        t1.traverser();

        System.out.println("\nInsertion at the begining");
        t1.InsertFirst("Sahrish");
        t1.traverser();

        System.out.println("\nInsertion at the End");
        t1.InsertLast("Amara");
        t1.InsertLast("Farzeen");
        t1.traverser();

        System.out.println("\nInsertion at Specific Location");
        t1.SpecificInsert("Jaweria",3);
        t1.traverser();

        System.out.println("\nRemove First");
        t1.removeFirst();
        t1.traverser();

        System.out.println("\nRemove last");
        t1.removeLast();
        t1.traverser();

        System.out.println("\nRemove at specific");
        t1.removeSpecific(3);
        t1.traverser();







         

     }
    
}

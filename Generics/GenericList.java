package Generics;

 

class Node<T>
{
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
        this.next = null;
    }
}

public class GenericList<T> {

    Node<T> head;

    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node<T> temp = head;
              while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
             }
     }

     void addMiddle(int index,T data)
        {
        Node<T> newNode = new Node<>(data);
         if(head == null)
         {
            System.out.println("List is empty");
         }
        Node<T> temp =head;
        for(int i=1;i<index-1;i++)
        {
        temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void removeFromFront()
     {
        head=head.next;
     }
   void removeFromBack()
    {
        Node<T> n=head;
        while(n.next.next!=null)
        n=n.next;
        n.next=null;
    }
 
 void removeAt(int index)
 {
        if (index==1) {
        removeFromFront();
        }
        else{
        Node<T> n=head;
        Node<T> temp=null;
        for(int i=1;i<index-1;i++)
        {
        n=n.next;
        }
        temp=n.next;
        n.next=temp.next;
 }
}

     public void printList()
      {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Integer linked list
        GenericList<Integer> intList = new GenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.addMiddle(2,7);
        intList.printList();  // Output: 1 2 3
        intList.removeFromBack();
        intList.printList();

        // String linked list
        GenericList<String> stringList = new GenericList<>();
        stringList.add("Hello!");
        stringList.add("World");
        stringList.addMiddle(2,"she is my");
        stringList.printList();
        stringList.removeAt(1);
        stringList.printList();

}
}

    
    


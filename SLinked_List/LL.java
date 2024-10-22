package SLinked_List;

import java.util.Scanner;

public class LL {
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
void addMiddle(int index,int data)
 {
    Node node =new Node(data);
    node.data=data;
    node.next=null;
    Node temp =head;
    for(int i=1;i<index-1;i++)
    {
    temp=temp.next;
    }
    node.next=temp.next;
    temp.next=node;
 }
 void printList() {
    Node node = head;
    while (node.next != null){
    System.out.print(node.data + " ");
    node = node.next;
    }
    System.out.print(node.data + " ");
}
void removeFromFront()
 {
 head=head.next;
 }
 void removeFromBack()
 {
 Node n=head;
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
        Node n=head;
        Node temp=null;
        for(int i=1;i<index-1;i++)
        {
        n=n.next;
        }
        temp=n.next;
        n.next=temp.next;
 }
}
public boolean search(int num)
{
     Node current = head;
     while(current != null)
     {
        if(current.data == num)
        {
            return true;
        }
        current = current.next;
     }
     return false;
     
    
}
public void Length()
{
   
    
        if(head == null)
        {
            System.out.println("Linked List does not exist");
        }
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            System.out.println(temp);
        }

    
}

    
    public static void main(String[] args) {

        LL l1 = new LL();
        l1.addToBack(1);
        l1.addToBack(2);
        l1.addToBack(3);
        l1.addToBack(4);
        l1.addToBack(5);
        l1.addToBack(6);
       // l1.addMiddle(1,6);
        //l1.removeFromFront();
        //l1.removeFromBack();
        //l1.removeAt(2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search : ");
        int num = sc.nextInt();
       if(l1.search(num))
       {
        System.out.println(num + " is present in the list");
       }
        else{
            System.out.println("Number  is not found in the list");
        }
        l1.printList();
         
        

    }
}

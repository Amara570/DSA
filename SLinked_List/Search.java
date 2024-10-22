package SLinked_List;

import java.util.Scanner;

public class Search {
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
public static void main(String[] args) {

    LL l1 = new LL();
    l1.addToBack(1);
    l1.addToBack(2);
    l1.addToBack(3);
    l1.addToBack(4);
    l1.addToBack(5);
    l1.addToBack(6);
    
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

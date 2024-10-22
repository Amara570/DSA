package CLinked_List;

import java.util.Scanner;

import SLinked_List.Single_Deletion;

public class Circular_Creation {

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
    Node tail = null;

    public void Creation()
    {
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Enter data :");
        data = sc.nextInt();
        Node new_Node = new Node(data);
        if( head == null)
        {
            head = new_Node;
            tail = new_Node;
            new_Node.next = head;
        }
        else{
            new_Node.next = head;
            head = new_Node;
            tail.next = head;
            break;
        }
        System.out.print("Do you want to add more data. if yes, press 1 :");
        n = sc.nextInt();

    } while(n==1);
}


    public void traverser()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("LL does not exists!");
        }
        else{
            do
             {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }while(temp != head);
        }
    }
     
    public static void main(String[] args) {
        
        Circular_Creation c1 = new Circular_Creation();
        c1.Creation();
      
        c1.traverser();
    }
    
}

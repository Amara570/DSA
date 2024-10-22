package CLinked_List;

import java.util.Scanner;

public class Circular_Creation3L {

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
        int data,n,m,p;
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
            System.out.println("Enter 1 to insert the item at the begining, 2 to insert the item at the end, 3 to insert the item at specific location");
            m = sc.nextInt();

            switch(m)
            {
                case 1:
                new_Node.next = head;
                 head = new_Node;
                 tail.next = head;
                 break;

                 case 2:
                 tail.next = new_Node;
                 tail = new_Node;
                 new_Node.next = head;
                 break;

                case 3:
                System.out.println("Enter position of node to be inserted");
                p = sc.nextInt();
                Node temp1 = head;
                for(int i=0; i< (p-1); i++)
                {
                    temp1 = temp1.next;
                }
                new_Node.next = temp1.next;
                temp1.next = new_Node;

                break;
                
            }
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
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp != head);
        }

    }

    public static void main(String[] args) {
        
        Circular_Creation3L c3 = new Circular_Creation3L();

        c3.Creation();
        c3.traverser();

    }
    
}

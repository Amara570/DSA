package CLinked_List;

import java.util.Scanner;

public class Circular_Deletion {

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
    public void Delete()
    {
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            if(head == null)
            {
                System.out.println("LL is empty");
            }
            else
            {
                System.out.println("Enter 1 to delete the item at the begining, 2 to delete the item at the end, 3 to delete the item at specific location");
                m = sc.nextInt();   
                switch(m)
                {
                case 1:
                    Node temp = head;
                    temp= temp.next;
                    head = temp;
                    tail.next = head;
                     break;

                case 2:
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    while(ptr.next != head)
                    {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    temp1.next = head;
                    tail = temp1;
                     break;

                case 3:
                    System.out.println("Enter position of node to be delete");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr1 = temp2.next;
                    for(int i=1; i<p-2; i++)
                    {
                        temp2 = ptr1;
                        ptr1 = ptr1.next;

                    }
                    temp2.next = ptr1.next;
                     break;
                }
            }
            System.out.println("Do you want to delete more data. if yes, press 1  ");
            n = sc.nextInt();
        }while(n==1);
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
        
        Circular_Deletion cd = new Circular_Deletion();
        cd.Creation();
        cd.Delete();
        cd.traverser();
    }
       
}

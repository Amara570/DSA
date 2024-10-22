package SLinked_List;

import java.util.Scanner;

public class Single_Deletion {

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
        }
        else{
            System.out.println("Enter 1 to insert the item at the begining, 2 to insert the item at the end, 3 to insert the item at specific location");
            m = sc.nextInt();

            switch(m)
            {
                case 1:
                new_Node.next = head;
                 head = new_Node;
                 break;

                 case 2:
                 Node temp = head;
                 while (temp.next != null) 
                 {
                    temp = temp.next;
                    
                 }
                 temp.next = new_Node;
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
            while (temp != null)
             {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
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
                     break;

                case 2:
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    while(ptr.next != null)
                    {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    temp1.next = null;
                     break;

                case 3:
                    System.out.println("Enter position of node to be delete");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr1 = temp2.next;
                    for(int i=0; i<p-2; i++)
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
    public static void main(String[] args) {
        
        Single_Deletion sd = new Single_Deletion();
        sd.Creation();
        sd.Delete();
        sd.traverser();
    }
    
}


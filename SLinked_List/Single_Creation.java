package SLinked_List;

import java.util.Scanner;

public class Single_Creation {

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
        int data,n;
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
            new_Node.next = head;
            head = new_Node;
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
    public static void main(String[] args) {
        
        Single_Creation s1 = new Single_Creation();
        s1.Creation();
        s1.traverser();
    }
    
}

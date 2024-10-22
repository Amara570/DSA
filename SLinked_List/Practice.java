package SLinked_List;

import java.util.Scanner;

public class Practice {

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

    public void creation()
    {
        int data,n;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_Node = new Node(data);
            if(head == null)
            {
                head = new_Node;
            }
            else{
                new_Node.next = head;
                head = new_Node;
            }
            System.out.println("Do you want to add more data. if yes, press 1 :");
            n = sc.nextInt();
        }while(n==1);
    }

    public void traverser(){
        Node temp = head;
        if(head == null)
        {
            System.out.println("LL does not exist");
        }
        else{
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        
        Practice p = new Practice();
        p.creation();
        p.traverser();
    }
    
}

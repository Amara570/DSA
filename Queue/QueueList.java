package Queue;
import java.util.Scanner;
public class QueueList {

    static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node f = null;
    Node r = null;

    void Enqueue(Scanner sc)
    {
         System.out.println("Enter data : ");
         int data = sc.nextInt();
         Node newNode = new Node(data);
         if(f == null)
         {
            f= newNode;
            r = newNode;
         }
         else{
            r.next = newNode;
            r = newNode;
         }
    }
    void Dequeue()
    {
        if(f == null)
        {
            System.out.println("Underflow");
        }
        else{
            f = f.next;
        }
        
    }
    void display()
    {
        Node temp = f;
        while(temp != null)
        {
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        
        QueueList Q = new QueueList();
        int d;
        Scanner sc = new Scanner(System.in);
       int l;

        do{
            System.out.println("ENTER 1 TO ENQUEUE");
            System.out.println("ENTER 2 TO DEQUEUE");
            System.out.println("ENTER 3 TO DISPLAY");
            System.out.print("ENTER YOUR CHOICE : ");
            d = sc.nextInt();

            switch(d)
            {
                case 1:
                Q.Enqueue(sc); 
                break;

                case 2:
                Q.Dequeue();
                break;

                case 3:
                Q.display();
                break;
            }
            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU : ");
            System.out.println("ENTER ANY KEY TO EXIT : ");
            l = sc.nextInt();
            
        }while(l == 0);
        System.out.println("EXIT SUCCESSFULLY");
    }
}

    


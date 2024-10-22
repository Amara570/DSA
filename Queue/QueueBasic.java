package Queue;
import java.util.Scanner;
public class QueueBasic {

    int front = -1;
    int rear = -1;
    int n = 10;
    int arr[] = new int[n];

    void Enqueue(Scanner sc)
    {
        if(rear == (n-1))
        {
            System.out.println("queue overflow");
        }
        else{
            System.out.println("Enter item :");
            int i = sc.nextInt();
            if(front==-1 && rear==-1)
            {
                front =0;
                rear = 0;
                arr[rear] = i;
            }
            else{
                rear = rear+1;
                arr[rear] = i;
            }
        }

    }
    void Dequeue()
    {
        if(front == -1)
        {
            System.out.println("Queue Underflow");
        }
        else{
            front = front+1;
        }

    }
    void display() 
    {
        System.out.println("Items are :");
        for(int i=front; i<=rear; i++)
        {
            System.out.println(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        
        QueueBasic Q = new QueueBasic();
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

package Lab_8;

import java.util.Stack;

 class Node{
    String data;
    Node next;

    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
public class UndoRedo {

    Node head;
    Stack stack1 = new Stack<>();
    Stack stack2 = new Stack<>();
    public void Insert(String data)
    {
        
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            stack1.push(newNode);
        }
         
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else{
            Node temp = head;
            while(temp != null)
            {
                stack2.push(stack1.pop(temp.data));
                
            }
        }
    }
    public static void main(String[] args) {
        

    }
    
}

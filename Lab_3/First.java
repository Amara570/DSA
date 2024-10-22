package Lab_3;

class First { 
    static class Node{ 
         int data; 
         Node next; 
         Node prev; 
         //Constructor 
         Node(int data) 
         { 
         this.data=data; 
         this.next=null; 
         } 
 }
 Node head; 
 void addLast(int data) 
 { 
    Node node = new Node(data); 
    if (head == null) 
    {
    head = node; 
    node.next = head; 
    }
    else{ 
    Node n = head; 
    while (n.next != head) 
    n = n.next; 
    n.next = node; 
    } 

 } 
 }

package Assignment_1;



public class Nth {

   static  class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static int getNthNode(Node head, int index) {
        Node current = head;
        int count = 1;

        // Traverse the list until the end or until the nth node is reached
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        // Return -1 if the index is out of bounds
        return -1;
    }
    public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int index = 4;
        int result = getNthNode(head, index);
        if (result != -1) {
            System.out.println("Element at index " + index + " is " + result);
        }
        else {
            System.out.println("Index " + index + " is out of bounds");
        }
    }
}



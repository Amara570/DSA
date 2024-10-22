package SLinked_List;

import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class Merge {

    // Function to merge two sorted linked list
    static Node mergeSortedList(Node a, Node b) {

        // ArrayList to temporarily store the values
        ArrayList<Integer> list = new ArrayList<>();

        // Pushing the values of a linked list
        while (a != null) {
            list.add(a.data);
            a = a.next;
        }

        // Pushing the values of b linked list
        while (b != null) {
            list.add(b.data);
            b = b.next;
        }

        // Sorting the list
        Collections.sort(list);

        // Creating a new list with sorted values
        Node temp = new Node(-1);
        Node head = temp;
        for (int value : list) {
            temp.next = new Node(value);
            temp = temp.next;
        }
        head = head.next;

        // Returning the resultant linked list
        return head;
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 2 -> 4 -> 8 -> 9
       /*  Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);
        */

        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(4);

        // Create another hard-coded linked list:
        // 1 -> 3 -> 8 -> 10
      /*   Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);
        */
        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(4);

        Node res = mergeSortedList(a, b);

        Node temp = res;
           System.out.print("Merged Link List is:\n");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
package Assignment_1;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Swap1 {

    static void swap(Node ptr1, Node ptr2) {
        int tmp = ptr2.data;
        ptr2.data = ptr1.data;
        ptr1.data = tmp;
    }

    static void bubbleSort(Node head) {
        boolean swapped;
        Node current;

        if (head == null)
            return;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertAtTheBegin(Node start_ref, int data) {
        Node ptr1 = new Node(data);

        ptr1.next = start_ref;
        start_ref = ptr1;
        return start_ref;  
    }

    public static void main(String[] args) {
        int[] arr = { 78, 20, 10, 32, 1, 5 };
        int listSize = arr.length;

        Node start = null;

        for (int i = listSize - 1; i >= 0; i--)
            start = insertAtTheBegin(start, arr[i]);

        System.out.println("Linked list before sorting");
        printList(start);

        bubbleSort(start);

        System.out.println("Linked list after sorting");
        printList(start);
    }
}
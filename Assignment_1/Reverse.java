package Assignment_1;

public class Reverse {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addToFront(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        newNode.next = temp;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head == null) {
            return;
        } else {
            Node prev = null;
            Node current = head;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev; 
        }
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        rev.addToFront(5);
        rev.addToFront(4);
        rev.addToFront(3);
        rev.addToFront(2);
        rev.addToFront(1);

        System.out.println("Before list:");
        rev.printList(); rev.reverse();

        System.out.println("After list:");
        rev.printList();
    }
}
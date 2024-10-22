package Assignment_1;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class RemoveDup {
    Node head;

   
    void removeDuplicates() {
        
        if (head == null) {
            System.out.println("List is emptyy");
            return;
        }

        
        Node current = head;

        while (current != null && current.next != null) {
            Node temp = current;

            while (temp.next != null) { 
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        RemoveDup list = new RemoveDup();
        list.addNode(5);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(2);
        list.addNode(1);
        list.addNode(4);
        list.addNode(5);
        list.addNode(3);

        System.out.println("Original List:");
        list.printList();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.printList();
    }
}
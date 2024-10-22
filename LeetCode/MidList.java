package LeetCode;

class  Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MidList {
    // Function to find the middle of the linked list
    public static Node findMiddle(Node head) {
         Node slow = head;
        Node fast = head;
        
        // Traverse the list with the slow pointer moving one step
        // and the fast pointer moving two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // slow pointer will point to the middle
    }
    
    // Utility function to create a linked list from an array
    public static Node createList(int[] arr) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        
        return head;
    }
    
    // Utility function to print the linked list from the head
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        Node head = createList(arr);
        System.out.print("Original List: ");
        printList(head);
        
        Node middle = findMiddle(head);
        System.out.println("Middle Node: " + middle.data);
    }
}

package LeetCode;

//Time complexity O(m+n)
//Space complexity O(k)
class  Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class  ListIntersection {
    
    // Function to find the intersection of two sorted linked lists
    public static Node getIntersection(Node head1, Node head2) {
        Node dummy = new Node(0);  // Dummy node to start the intersection list
        Node tail = dummy;
        
        Node p1 = head1, p2 = head2;
        
        // Traverse both lists and find common elements
        while (p1 != null && p2 != null) {
            if (p1.data == p2.data) {
                // Add the common element to the new list
                tail.next = new Node(p1.data);
                tail = tail.next;
                
                // Move both pointers forward
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.data < p2.data) {
                p1 = p1.next;  // Move the pointer in the first list
            } else {
                p2 = p2.next;  // Move the pointer in the second list
            }
        }
        
        return dummy.next;  // Return the new list (skipping the dummy node)
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
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {2, 4, 6, 8};
        
        Node head1 = createList(arr1);
        Node head2 = createList(arr2);
        
        System.out.print("List 1: ");
        printList(head1);
        System.out.print("List 2: ");
        printList(head2);
        
        Node intersection = getIntersection(head1, head2);
        System.out.print("Intersection List: ");
        printList(intersection);
    }
}

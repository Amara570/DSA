package LeetCode;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertInSorted {
    
    // Function to insert a node with value x in a sorted linked list
    public static ListNode insertSorted(ListNode head, int x) {
        ListNode newNode = new ListNode(x);
        
        // Special case: if the list is empty or x should be inserted at the head
        if (head == null || head.val >= x) {
            newNode.next = head;
            return newNode;  // new node becomes the new head
        }
        
        // Traverse the list to find the correct position to insert x
        ListNode current = head;
        while (current.next != null && current.next.val < x) {
            current = current.next;
        }
        
        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
    
    // Utility function to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        
        return head;
    }
    
    // Utility function to print the linked list from the head
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int x = 6;  // value to insert
        
        ListNode head = createList(arr);
        System.out.print("Original List: ");
        printList(head);
        
        head = insertSorted(head, x);
        System.out.print("List after insertion: ");
        printList(head);
    }
}


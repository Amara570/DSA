package Lab_2;

public class LinkedList implements List {
    private Node head; //dummy
    private int size;  

    // (inner class)
    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public LinkedList() {
        head = new Node(null); //dummy node
        size = 0;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }

    
    public void add(Object item) {
        Node newNode = new Node(item);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    
    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
           System.out.println("Index out of range");
        }
        Node newNode = new Node(item);
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    
    public void remove(int index) {
        if (index < 1 || index > size) {
            System.out.println("Index out of range"); 
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
    
    public void removeFirst(Object item) {
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    
    public List duplicate() {
        LinkedList copykaro = new LinkedList();
        Node current = head.next; // Skipdummyn
        while (current != null) {
            copykaro.add(current.data);
            current = current.next;
        }
        return copykaro; 
    } 

    public LinkedList duplicateReversed() {
        LinkedList reversedList = new LinkedList();
        Node current = head.next; // Skip dummy node

        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head.next;
            reversedList.head.next = newNode;
            reversedList.size++;
            current = current.next;
        }

        return reversedList;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder(); //used for making tostring function easier!
        sb.append("[ size: ").append(size).append(" - ");
        Node current = head.next; // Skipingdummyn
        while (current != null) { 
           sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            } 
            current = current.next;
        } 
        sb.append(" ]");
        return sb.toString();
    }
    
    
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println("Original List: " + list);
        
        list.add(2, "X");
        System.out.println("After adding X at index 2: " + list);
        
        list.remove(3);
        System.out.println("After removing item at index 3: " + list);
        
        list.removeFirst("A");
        System.out.println("After removing item 'A': " + list);
        
        LinkedList duplicate = (LinkedList) list.duplicate();
        System.out.println("Duplicate List: " + duplicate);

         LinkedList reversedDuplicate = list.duplicateReversed();
        System.out.println("Reversed Duplicate List: " + reversedDuplicate);
        
    }
}
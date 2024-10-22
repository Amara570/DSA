package Assignment_1;

    class LinkedList {
        
        static class Node {
            int data;  
            Node next;  
            
            
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head;
    
         
        int nthFromLast(int n) {
            if (head == null) {
                return -1; 
            }
    
            Node mainPtr = head;
            Node refPtr = head;
    
            for (int i = 0; i < n; i++) {
                if (refPtr == null) {
                    return -1; 
                }
                refPtr = refPtr.next;
            }
    
             while (refPtr != null) {
                mainPtr = mainPtr.next;
                refPtr = refPtr.next;
            }
            return mainPtr.data;
        }
     
        public void add(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
    
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
    
           
            list.add(50);
            list.add(90);
            list.add(30);
            list.add(20);
            list.add(10);
    
            int n = 2;
            int result = list.nthFromLast(n);
    
            if (result != -1) {
                System.out.println("The " + n + "th node from the end is: " + result);
            } else {
                System.out.println("The list is empty or n is larger than the list length.");
            }
        }
    }
    
    


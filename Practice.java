import java.util.Arrays;

import Assignment_1.RemoveDup;

public class Practice {

   /*  public static void evenOdd(int arr[])
    {
        int left = 0;
        int right = arr.length-1;

        while(left < right)
        {
            while(arr[left] % 2 == 0 && left < right)
            {
                left++;
            }
            while(arr[right] % 2 != 0 && left < right)
            {
                right--;
            }

            if(left < right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,6,5,7,8,9,2,2,2};
        System.out.print("original : " + Arrays.toString(arr));

        evenOdd(arr);

        System.out.print("\nRearranged : " + Arrays.toString(arr));

    }

        */

        /* 
        public static class Node{
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;

            }
        }
        Node head;

        static int Nth(Node head, int index)
        {
            Node current = head;
            int count =  1;

            while(current != null)
            {
                if(count == index)
                {
                    return current.data;
                }
                count ++;
                current = current.next;
            }
            return -1;
        }
        public static void main(String[] args) {
            
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            int index = 5;
            int result = Nth(head,index);
            if(result != -1)
            {
                System.out.println("element at index " + index + " is " + result);
            }
            else{
                System.out.println(index + "is out of bounds");
            }
        }
        */
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                next = null;
            }
        }
        Node head;
        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
            }
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp = newNode;
        }
        void printList()
        {
            Node temp = head;
            if(temp != null)
            {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        public void RemoveDup()
        {
            if(head == null)
            {
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            while(current != null && current.next != null)
            {
                Node temp = current;
                while (temp.next != null) {
                    if(current.data == temp.next.data)
                    {
                        temp.next = temp.next.next;

                    }
                    else{
                        temp = temp.next;
                    }
                }
                current = current.next;
            }
        }
        public static void main(String[] args) {
            Practice list = new Practice();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println("Original List:");
        list.printList();

        list.RemoveDup();

        System.out.println("After removing duplicates:");
        list.printList();
        }
        
}

    


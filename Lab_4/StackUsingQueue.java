package Lab_4;

 import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> q1, q2;

    // Constructor
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int data) {
        // Always push to q1
        q1.add(data);
    }

    // Pop an element from the stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow: No elements to pop");
            return -1;
        }

        // Move elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // The last remaining element in q1 is the top of the stack
        int poppedElement = q1.remove();

        // Swap q1 and q2 to make sure q1 always has the current elements
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    // Peek the top element of the stack
    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow: No elements to peek");
            return -1;
        }

        // Move elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // The last remaining element in q1 is the top of the stack
        int topElement = q1.peek();

        // Move it to q2 as well since we're not popping it
        q2.add(q1.remove());

        // Swap q1 and q2 to make sure q1 always has the current elements
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());  // Output: 3

        // Pop elements from the stack
        System.out.println("Popped element is: " + stack.pop());  // Output: 3
        System.out.println("Popped element is: " + stack.pop());  // Output: 2

        // Peek the top element after popping
        System.out.println("Top element is: " + stack.peek());  // Output: 1

        // Pop the last element
        System.out.println("Popped element is: " + stack.pop());  // Output: 1
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true
    }
}

    


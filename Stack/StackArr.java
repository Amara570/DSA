package Stack;

public class StackArr {
    private int arr[];      // Array to store stack elements
    private int top;        // Top of the stack
    private int size;       // Maximum size of the stack

    // Constructor to initialize the stack
    public StackArr(int size) {
        this.size = size;
        arr = new int[size];
        top = -1; // Initially, stack is empty, so top is -1
    }

    // Push method to add an element to the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            top++;  // Increment top to point to the new top element
            arr[top] = data;
            System.out.println("Pushed: " + data);
        }
    }

    // Pop method to remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;  // Decrease top to remove the element
            System.out.println("Popped: " + poppedElement);
            return poppedElement;
        }
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;  // Stack is empty if top is -1
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1;  // Stack is full if top is at the last index
    }

    // Method to display all elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a stack of size 5
        StackArr stack = new StackArr(5);

        // Test stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  // Stack elements: 10 20 30
        
        System.out.println("Top element is: " + stack.peek()); // Top element is: 30

        stack.pop();
        stack.display();  // Stack elements: 10 20

        System.out.println("Top element is: " + stack.peek()); // Top element is: 20

        stack.pop();
        stack.pop();
        stack.pop();  // Stack Underflow

        stack.display();  // Stack is empty
    }
}
 

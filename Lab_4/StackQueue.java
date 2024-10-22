package Lab_4;

class StackQueue extends QueueList {

    QueueList q1,q2;

    StackQueue()
    {
        q1 = new QueueList();
        q2 = new QueueList();
    }
    public void push(int data) {
        
        q1.enqueue(data);
    }
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow: No elements to pop");
            return -1;
        }

        
        while (q1.size() > 1) {
            q2.enqueue(q1.dequeue());
        }
        int poppedElement = q1.dequeue();

        QueueList temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    public static void main(String[] args) {
        StackQueue stack = new StackQueue();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped element is: " + stack.pop());  // Output: 3
        System.out.println("Popped element is: " + stack.pop());  // Output: 2
        

        // Pop the last element
        System.out.println("Popped element is: " + stack.pop());  // Output: 1
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true
    }
}

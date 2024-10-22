package Lab_4;

public class Stack {
    public int arr[]; 
    public int top; 
    public int size; 
 
    // Constructor to initialize stack   
   public Stack(int size) 
    { 
        arr = new int[size]; 
        this.size = size; 
        top = -1; 
    } 
 
    // Utility function to add an element x in the stack and check for stack overflow   
    public int push(int data) 
    { 
         if(top == (size-1))
         {
            System.out.println("Overflow");
            return -1;
         } 
         else{
            top = top+1;
            arr[top] = data;
            size++;
            return data;
         } 
    } 
 
    // Utility function to pop top element from the stack and check for stack underflow   
    public int pop() 
    { 
        if(top == -1)
        {
            return -1;
           // System.out.println("Stack empty");
        }
        else{
            int value = arr[top];
            arr[top--] = 0;
            size--;
            return value;
            
        }
    } 
 
    // Utility function to return top element in a stack   
    public int top() 
    { 
        return arr[top];
    } 
 
    // Utility function to return the size of the stack   
    public int size() 
    { 
        return top+1;
    } 
 
    // Utility function to check if the stack is empty or not   
    public Boolean isEmpty() 
    { 
        if(top == -1)
        {
            return true;
        }
        return false;
    } 
 
    // Utility function to check if the stack is full or not   
    public Boolean isFull() 
    { 
         if(top == (size-1)){
            return true;
         } 
         return false;
    } 
 
    public static void main (String[] args) 
    { 
        Stack stack = new Stack(3); 
 
        System.out.println("inserting : " +  stack.push(1));       // Inserting 1 in the stack   
        System.out.println("inserting : " +  stack.push(2));      // Inserting 2 in the stack   
 
       System.out.println("deleting : " +  stack.pop());        // removing the top 2   
       System.out.println( "deleting : " +stack.pop());         // removing the top 1   
 
       System.out.println("inserting : " + stack.push(3)); // Inserting 3 in the stack  
       System.out.println("inserting : " + stack.push(4));       
 
        System.out.println("Top element is: " + stack.top()); 
        System.out.println("Stack size is " + stack.size()); 
 
        stack.pop();        // removing the top 3   
 
        // check if stack is empty   
        if (stack.isEmpty()) 
            System.out.println("Stack Is Empty"); 
        else 
            System.out.println("Stack Is Not Empty"); 
  
    
}
}


    


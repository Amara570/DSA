package Recursion;
public class Fibonacci1 {
    
   static int fibonacci(int n) 
    {
        if (n <=1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {

         
         int n=6;
        System.out.println("Fibonacci Series:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
       
    }
    
}

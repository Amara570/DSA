package Recursion;

public class Fibonacci {

    public static void Fib(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }
        int c = a+b;
        System.out.print(c+"  ");
        Fib(b, c, n-1);
    }

    public static void main(String[] args) {
         int a = 0;
         int b = 1;

         System.out.print(a +"  ");
         System.out.print(b +"  ");

         int n = 7;

         Fib(a, b, n-2);
    }
    
}

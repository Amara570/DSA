package Lab_7;

 

public class Fibonacci {

    //Recursive
    public static void Recursive(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }
        int c = a+b;
        System.out.print(c+"  ");
        Recursive(b, c, n-1);
    }
    //Iterative
    public static void Iterative(int n, int a,int b) {
       
        System.out.print("Iterative : " + a + "  " + b + "  ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + "  ");
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int a = 0;
         int b = 1;

         System.out.print("Recursive : ");
         System.out.print(a +"  ");
         System.out.print(b +"  ");
         int n = 7;
         Recursive(a, b, n-2);

         System.out.println();
         Iterative(n,a,b);
    }
    
}

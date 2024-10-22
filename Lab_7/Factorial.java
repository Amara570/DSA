package Lab_7;

public class Factorial {
    public static int RecursiveFact(int n)
    {
        if(n == 0 || n==1)
        {
            return 1;
        }
        else{
            return n*RecursiveFact(n-1);
        }
    }
    public static void IterativeFact(int a)
    {
        
        int  factorial=1;
       for(int i=1; i<=a; i++)
       {
        factorial*=i;
       }
       System.out.println("Factorial of " + a + " is : " + factorial);
    }

   

    public static void main(String[] args) {
        
       System.out.println("Factorial of 5 is :" + RecursiveFact(5));

       IterativeFact(5);


    }
    
}

package Recursion;

public class Power {

    public static int power(int x, int n)
    {
        if(n==0)            //base case 1
        {
            return 1;
        }
        else if(x == 0)      //base case 2
        {
            return 0;
        }
        int xPownm1 = power(x, n-1);       //kaam
       int  xPown =  x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        
        int x = 2, n = 5;
        System.out.println(power(x, n));
    }
    
}

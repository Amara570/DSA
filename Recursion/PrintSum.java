package Recursion;

public class PrintSum {

    public static void Sum(int i, int n, int sum)
    {
        if(i == n )
        {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Sum(i+1, n, sum);
        System.out.println(i);

    }
    public static void main(String[] args) {
        
        Sum(1, 5, 0);
    }
}

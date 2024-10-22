package Recursion;

public class Print {

    public static void printNum(int n)
    {
        if(n == 0)  //base case
        {
            return;
        }
        else{
            System.out.print(n +"  ");  //print
            printNum(n-1);          //Recursive case
        }
    }
    public static void printNum1(int n)
    {
        if(n == 6)  //base case
        {
            return;
        }
        else{
            System.out.print(n +"  ");  //print
            printNum1(n+1);          //Recursive case
        }
    }
    public static void main(String[] args) {
        
        printNum(5);
        System.out.println();
        printNum1(1);
    }
    
}

package Lab_7;

import java.util.Scanner;
public class Print {

    
    public static void printNum(int n)
    {
        if(n == 0)  
        {
            return;
        }
        else{
            
            System.out.print(n +"  ");   
            printNum(n-1);    
            System.out.print(n +"  ");  
             
        }
        
    }
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Descending  & Ascending: ");
        int n = sc.nextInt();
        printNum(n);

        
    }
    
}

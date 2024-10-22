package Array;

import java.util.Scanner;

public class Insertion1 {
    public static void main(String[] args) {

        int a[] = new int[10];
        int i,pos,val;

        Scanner sc = new Scanner(System.in);
        for(i=0; i<9; i++)
        {
            System.out.print("Enter number : ");
            a[i] = sc.nextInt();

        }
        
        System.out.print("Array : ");
        for(i=0; i<9; i++)
        {
            System.out.print(a[i]+"  ");

        }

        System.out.print("Enter position :");
        pos = sc.nextInt();

        System.out.print("Enter value : ");
        val = sc.nextInt();


        for(i=8; i>=pos-1; i--)
            a[i+1] = a[i];

            a[pos-1] =val;
            
        

        System.out.print("Updated Array : ");
        for(i=0; i<10; i++)
        {
            System.out.print(a[i]+"  ");

        }




        
    }
    
}

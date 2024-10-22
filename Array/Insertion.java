package Array;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        
        int m,n,p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no: of elements in array : ");
        n = s.nextInt();

        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter values : ");
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("enter index of new value to be inserted : ");
        m = s.nextInt();

        System.out.print("Enter new value to be inserted : ");
        p = s.nextInt();

        for(int i=0; i<n+1; i++)
        {
            if(i<m)
            {
                b[i] = a[i];
            }
            else if(i==m)
            {
                b[i] = p;
            }
            else
            {
                b[i] = a[i-1];
            }
        }

        System.out.println("Elements are : ");
        for(int i=0; i<n+1; i++)
        {
            System.out.print(b[i]  + "  ");
        }


        
         
    }
    
}

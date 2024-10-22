package Lab_7;

import java.util.Scanner;
import java.util.Random;

public class Search {
    
    public int Iterative(int arr[],int num)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(num == arr[i])
            {
                return 1;
            }

        }
            return 0;
    }

    public int Recursive(int arr[], int num, int index)
    {
        if(index >= arr.length)
        {
            return 0;
        }
        else if(arr[index] == num)
        {
            return 1;
        }
        return Recursive(arr, num, index+1);

    }

    public static void main(String[] args) {
        
        Search s = new Search();
        int size = 8;
        int arr[] = new int[size];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
         
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }

        for(int i=0; i < arr.length; i++)
        { 
            System.out.print(arr[i] + "  ");
        }

        System.out.print("\nEnter number to search : ");
        int num = sc.nextInt();

       System.out.print("Iterative :"+ s.Iterative(arr, num));
       System.out.print("\nRecursive :"+s.Recursive(arr, num, 0));

        
       

         
    }
}

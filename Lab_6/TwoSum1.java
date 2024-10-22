package Lab_6;

import java.util.Arrays;

public class TwoSum1 {

    public static boolean Sum(int arr[], int k)
    {
         Arrays.sort(arr);

        int left =0;
        int right = arr.length-1;
        
        int sum =0;
        for(int i= left; i < arr.length-1; i++)
        {
            int mid = (i + arr.length-1)/2;
            for(int j = mid; j <= arr.length-1; j++ )
            {
                  sum = arr[i] + arr[j];
            
                 if(sum == k)
                {
                   return true;
                }
                else if(sum  >  k)
                {
                   break;
                }
            
                
            }
           

        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[] = {8,4,1,6};

        int K = 14;

        boolean result = Sum(arr, K);
        System.out.println(result);
    }
    
}

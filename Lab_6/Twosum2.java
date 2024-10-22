package Lab_6;

import java.util.Arrays;

public class Twosum2 {
     public static boolean Sum(int arr[], int k)
    {
         Arrays.sort(arr);

       
        
        int sum =0;
        for(int i= 0; i < arr.length-1; i++)
        {
            int target = k - arr[i];

            int left =i+1;
            int right = arr.length-1;
              
            while (left <= right) {
                int mid = left + (right - left) / 2;  // To avoid overflow
    
                if (arr[mid] == target) {
                    return true;  // Found the target value
                }
    
                if (arr[mid] < target) {
                    left = mid + 1;  // Search in the right half
                } else {
                    right = mid - 1;  // Search in the left half
                }
            }
    
             // Target value not found
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[] = {8,4,1,6};

        int K = 5;

        boolean result = Sum(arr, K);
        System.out.println(result);
    }
    
}

    


package Lab_6;
import java.util.Arrays;

public class TwoSum {


    public static boolean twosum(int arr[], int k )
    {
        Arrays.sort(arr);

        int left =0;
        int right = arr.length-1;

        while (left <= right) {
            int sum = arr[left] + arr[right];
        
        if(sum == k)
        {

            if(left != right )
            {
                return true;
            }
        }
        else if (sum < k)
            {
                left++;
            }
        else{
                right--;
            }
        }
       
    
    return false;
        
    }
    public static void main(String[] args) {
        
        int arr[] = {8,4,1,6};

        int K = 10;

        boolean result = twosum(arr, K);
        System.out.println(result);
    }
    
}

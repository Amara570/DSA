package LeetCode;
import java.util.Arrays;

public class Median {
 
        public int Mid(int[] arr1, int[] arr2 ) {

            int s1 = arr1.length-1;
            int s2 = arr2.length-1;

            int merged[] = new int[s1 + s2];

            int i=0,j=0,k=0;

            while(i < s1 && j < s2)
            {
                if(arr1[i] <= arr2[j])
                {
                    merged[k++] = arr1[i++];
                }
                else{
                    merged[k++] = arr2[j++];
                }
            }
            while(i < s1)
            {
                merged[k++] = arr1[i++];
            }
            while(j < s2)
            {
                merged[k++] = arr2[j++];
            }
            int mid = merged.length/2;
            return mid;
        }

      public static void main(String[] args)
       {
        Median med = new Median();
        int arr1[] = {4,5,3,2};
        int arr2[] = {6,7,1,9,8}; 
         
         ;
       System.out.println("Median of Merged Arrays : "+med.Mid(arr1,arr2));
       }
    
    }  


package Sorts;


public class MergeSort {

    //nlogn
    public static void conquer(int arr[], int si, int mid, int ei)
    {
        int merged[] =  new int[ei - si + 1];
        int index1 = si;
        int index2 = mid+1;
        int x =0;

        //O(n)
        while(index1 <= mid && index2 <= ei)
        {
            if(arr[index1] <= arr[index2]) //compare the elements in two arrays 
            {
                merged[x++] = arr[index1++];  
            }else{
                merged[x++] = arr[index2++];
            }
        }

        //always one while is true so that 1 loop will be executed
        while(index1 <= mid)    //Copy rest of the elements
        {
            merged[x++] = arr[index1++];
        }
        while(index2 <= ei)
        {
            merged[x++] = arr[index2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++)
        {
            arr[j] =merged[i];

        }
    }
    public static void divide(int arr[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        //O(logn)
       int  mid = si + (ei - si)/2; //(si+ei)/2 -> we don't use this because of space complexity
        divide(arr, si, mid);
        divide(arr,mid+1,ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    
}

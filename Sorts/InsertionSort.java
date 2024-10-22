package Sorts;

public class InsertionSort {

    public void Insertion(int arr[], int n)
    {
        int i,j,key;

        for(i=1; i<n; i++)
        {
            key = arr[i];
            j=i-1;

            while(j>=0 && key < arr[j] )
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        
    }
    public static void main(String[] args) {
        
        InsertionSort is = new InsertionSort();
        int arr[] = {5,7,8,4,6,9};
        int n = 6;
        System.out.print("Unsorted : " );
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        is.Insertion(arr, n);
        System.out.print("\nsorted : " );
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + "  ");
        }



    }
    
}

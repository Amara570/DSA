package Lab_7;

public class OneD {

    public static void printForward(int arr[],int size)
    {
        if(size == arr.length)
        {
            return;
        }
        else{
            System.out.print(arr[size] + "  ");
            printForward(arr,size+1);
            
        }
    }
    public static void printReverse(int arr[], int size)
    {
        if(size < 0)
        {
            return;
        }
        else{
            System.out.print(arr[size] + "  ");
            printReverse(arr, size-1);
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        //int size = arr.length-1;
        System.out.print("Array in forward :");
        printForward(arr,0);

        int size = arr.length-1;
        System.out.println();
        System.out.print("Array in Reverse : ");
        printReverse(arr, size);

    }
    
}

package Array;

import java.util.Arrays;

public class EvenOdd1 {

    public static void arrangeOddEven(int[] arr) {
        int[] temp = new int[arr.length];
        int oddIndex = 0;
        int evenIndex = arr.length - 1;

        // Traverse the array and place odd numbers at the start and even numbers at the end
        for (int num : arr) {
            if (num % 2 != 0) {
                temp[oddIndex++] = num;
            } else {
                temp[evenIndex--] = num;
            }
        }

        // Copy the rearranged numbers back to the original array
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        arrangeOddEven(arr);
        
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

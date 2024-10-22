package Array;

import java.util.Arrays;

public class EvenOdd {

    public static void arrangeEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Increment left index while we see even numbers on left
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            // Decrement right index while we see odd numbers on right
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            // Swap arr[left] and arr[right]
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        arrangeEvenOdd(arr);
        
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

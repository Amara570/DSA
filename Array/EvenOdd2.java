package Array;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd2 {

    public static void arrangeOddEven(int[] arr) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        // Separate odd and even numbers into two lists
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // Combine the odd and even lists
        int index = 0;

        // Add all odd numbers first
        for (int odd : oddList) {
            arr[index++] = odd;
        }

        // Add all even numbers next
        for (int even : evenList) {
            arr[index++] = even;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};
        
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        
        arrangeOddEven(arr);
        
        System.out.println("Rearranged array: " + java.util.Arrays.toString(arr));
    }
}


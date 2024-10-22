package Lab_6;

import java.util.Arrays;

public class SortingFour {

    public static int[] sortFour(int[] arr) {
         
        if (arr.length != 4) {
            throw new IllegalArgumentException("The input array must contain exactly 4 elements.");
        }

        if (arr[0] > arr[1]) {
            swap(arr, 0, 1);
        }

        if (arr[2] > arr[3]) {
            swap(arr, 2, 3);
        }

        if (arr[0] > arr[2]) {
            swap(arr, 0, 2);
            swap(arr, 1, 3);
        }

        if (arr[1] > arr[2]) {
            swap(arr, 1, 2);
        }

        if (arr[2] > arr[3]) {
            swap(arr, 2, 3);
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        int[] sortedArr = sortFour(arr);
        System.out.println(Arrays.toString(sortedArr));  // Output: [1, 2, 3, 4]
    }
}
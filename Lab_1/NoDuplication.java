package Lab_1;

import java.util.HashSet;

public class NoDuplication {

    public static void noDup(int[][] arr2D, int[] arr1D) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                int currentElement = arr2D[i][j];
                if (!seen.contains(currentElement)) {
                    seen.add(currentElement);
                    arr1D[index++] = currentElement;
                }
            }
        }

        // Fill the remaining elements with zeros if the 1D array has extra space
        while (index < arr1D.length) {
            arr1D[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr2D = {
            {1, 3, 4, 2, 5},
            {6, 8, 9, 7, 10},
            {11, 3, 5, 7, 9},
            {2, 4, 6, 8, 10}
        };

        int[] arr1D = new int[20];

        noDup(arr2D, arr1D);

        System.out.println("1D array without duplicates: ");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
    }
}

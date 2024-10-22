package Array;

import java.util.Arrays;
public class Sort_Sub {
 public static void main(String[] args) {
 // Java program to sort a subarray using Arrays.sort()
 int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; // Custom input array
 // Sort subarray from index 1 to 4, i.e., only sort subarray {7, 6, 45, 21} and
 //keep other elements as it is.
 Arrays.sort(arr, 1, 5);
 // Printing sorted array
 System.out.printf("Modified arr[] : %s",
 Arrays.toString(arr));
 }
 }

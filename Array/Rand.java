package Array;

import java.util.Arrays;
import java.util.Random;
public class Rand {
 public static void main(String[] args) {
 int data[ ] = new int[10];
 Random rand = new Random(); // a pseudo-random number generator
 // use current time as a seed
 rand.setSeed(System.currentTimeMillis());
 // Fill the data array with pseudo-random numbers from 0 to 99, inclusive
 for (int i = 0; i < data.length; i++)
 data[i] = rand.nextInt(100); // the next pseudo-random number
 // make a copy of the data array
 int[ ] orig = Arrays.copyOf(data, data.length); 
System.out.println("arrays equal before sort: "+ Arrays.equals(data, orig));
 // sorting the data array (orig is unchanged)
 Arrays.sort(data);
 System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
 System.out.println("orig = " + Arrays.toString(orig));
 System.out.println("data = " + Arrays.toString(data));
 }
}

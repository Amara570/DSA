package Lab_5;

public class FirstLetter {

    public static char firstSingleLetter(char[] text, int n) {
        // Step 1: Create an array to store the frequency of each character (assuming ASCII 256 characters)
        int[] frequency = new int[256]; 
        
        // First pass: Count the frequency of each character
        for (int i = 0; i < n; i++) {
            frequency[text[i]]++; // Increment the count of the character
        }
        
        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < n; i++) {
            if (frequency[text[i]] == 1) {
                return text[i]; // Return the first character with a count of 1
            }
        }
        
        return 0; // Return 0 if no unique character is found
    }

    public static void main(String[] args) {
        String str = "Algorithm";
        char[] text = str.toCharArray();
        char result = firstSingleLetter(text, text.length);
        System.out.println(result);
    }
}

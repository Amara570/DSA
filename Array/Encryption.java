package Array;

public class  Encryption {

    public static String encryptMessage(String message, int[] key) {
        char[] encryptedMessage = new char[message.length()];
        
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage[i] = (char) (message.charAt(i) + key[i]);
        }
        
        return new String(encryptedMessage);
    }

    public static void main(String[] args) {
        String message = "Hello world";
        int[] key = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  // Unique key for each character

        // Encrypt the message
        String encryptedMessage = encryptMessage(message, key);
        
        // Display the encrypted message
        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encryptedMessage);
    }
}


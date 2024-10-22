package Lab_8;

public class PalindromeRecur {

    public static boolean palindrome(String str, int left, int right)
    {
        if(left >= right)
        {
            return true;
        }

        if(str.charAt(left) != str.charAt(right))
        {
            return false;
        
        } 
            return palindrome(str, left+1, right-1);
        
    }
    public static void main(String[] args) {
        
        String str = "racecar";

        int left =0;
        int right = str.length()-1;

       
        System.out.println(palindrome(str, left, right));
        
        
    }
    
}

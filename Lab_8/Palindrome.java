package Lab_8;

public class Palindrome {

    public static boolean palindrome(String str)
    {
        int left =0;
        int right = str.length() - 1;

        while(left < right)
        {
        if(str.charAt(left) != str.charAt(right))
         return false;

         left++;
         right--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String s = "racecar";
        System.out.println(palindrome(s));
    }
    
}

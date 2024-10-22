package Lab_5;
import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets against the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }
       
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string with brackets: ");
        String input = sc.nextLine();

        
        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
    


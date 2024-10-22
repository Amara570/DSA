package Lab_5;
import java.util.Stack;
 
public class InfPost {
    int prec(char c)
    {
        if(c == '^')
        {
            return 3;
        }
        else if(c== '*' || c== '/')
        {
            return 2;
        }
        else if(c== '+' || c== '-')
        {
            return 1;
        }
        else {
            return -1;
        }
    }
    public void infixtopostfix(String s)
    {
        Stack <Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')  )
            {
                res.append(c);
            }
            else if(c== '(')
            {
                st.push(c);
            }
            else if(c == ')')
            {
                while (! st.isEmpty() && st.peek() != '(') {
                
                res.append(st.pop());
                }
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && prec(st.peek()) > prec(c))
                {
                   res.append(st.pop());
                    
                }
                st.push(c);
            }

        }
        while(!st.isEmpty())
        {
            res.append(st.pop());
             
        }
         
        System.out.println(res);
    }
    public static void main(String[] args) {
        
        InfPost in = new InfPost();

       // String str = "(a-b/c) * (a-k/l)";  // abc/-ak/l-*

         String str = "A+B*C+D";              //ABC*D++

         in.infixtopostfix(str);

    }

    
}

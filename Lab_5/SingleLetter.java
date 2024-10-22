package Lab_5;

public class SingleLetter {

    public static char firstSingleLetter(char[] text, int n)
    {
        for(int i=0; i<text.length; i++)
        {
            boolean letter = true;
            for(int j=0; j<text.length; j++)
            {
                if(i != j  && text[i] == text[j])
                {
                    letter = false;
                    break;
                }
            }
            if(letter)
            {
                return text[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str = "Algorithm";
         char[]  text = str.toCharArray();
         char result = firstSingleLetter(text, text.length);
         System.out.println(result);

    }
    
}

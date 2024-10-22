package Lab_1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenize {

    public static String[] wordTokenize(String filename)
    {
        String content = "";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while((line = reader.readLine()) != null)
            {
                content += line.replaceAll("[.,:;!?()\"']","") +" ";
            }
            reader.close();
        
    }catch(IOException e){
        e.printStackTrace();
    }

    String[] words = content.split(" ");
    return words;
    
}
public static void main(String[] args) {
    String[] words = wordTokenize("sample.txt");
    System.out.println("words :");
    for(String word : words)
    {
        System.out.println(word);
    }
}
}
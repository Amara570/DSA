package Lab_8;

public class DecToBin {

    public static int decimalTobinary(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else{
            return num % 2 + 10 * (decimalTobinary(num/2));
        }
    }
    public static void main(String[] args) {
        
        int decimal = 20;
        System.out.println(decimalTobinary(decimal));
    }
    
}




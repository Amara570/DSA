package Lab_1;

public class Odd_Even {

    public static void main(String[] args) {
        
        int numbers[] = {1,2,3,5,7,2,2,7,8,9};
        int arrange[] = new int[10];

        int even_index = 9;
        int odd_index = 0;

        
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                arrange[even_index] = numbers[i];
                even_index--;
            }
            else{
                arrange[odd_index] = numbers[i]; 
                odd_index++;
            }
        }
     

       
        for(int i=0; i<arrange.length; i++)
        {
            System.out.print(arrange[i] + " ");
        }
    }
    
}

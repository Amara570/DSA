package Lab_1;

import java.util.HashSet;

public class NoDup {

    public static void noDup(int TwoD_arr[][],int OneD_arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for(int i=0; i<TwoD_arr.length; i++)
        {
            for(int j=0; j<TwoD_arr[i].length; j++)
            {
                int current = TwoD_arr[i][j];
                if(!set.contains(current))
                {
                    set.add(current);
                    OneD_arr[index] = current;
                    index++;
                }
            }
        }

    }

    public static void main(String[] args) {

        int Two_Darr[][] = {
                    {1,2,3,4,5},
                    {1,3,5,6,2},
                    {7,7,12,11,9},
                    {11,3,8,8,2}

        };
        int One_Darr[] = new int[20];
        noDup(Two_Darr, One_Darr);

        for(int i=0; i<One_Darr.length; i++)
        {
            
                System.out.print(One_Darr[i] + " ");
            
        }
        
    }
    
}

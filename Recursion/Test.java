package Recursion;

public class Test {
   public static  void test(int n) {
        if (n > 0) {
            System.out.print(n + "  ");
            test(n-1);
           System.out.print(n + "  ");
       }
   } 
public static void main(String[] args) {
    
    test(4);

}   
    
}

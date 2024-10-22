package Pkg;

public class TestCompany {
    public static void main(String[] args) {
        
        Product p1 = new Product("TV", 4, 350000);
        Product p2 = new Product("Bicycle", 4, 20000);
        Product p3 = new Product("Oven", 3, 40000);

        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hyper Mart", "Karachi");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        Product temProduct = s1.deleteProduct("Bicycle");
        if(temProduct != null)
        {
            System.out.println("Product " +temProduct.getName() + " is deleted");

        }
        else
            System.out.println("There is no product to delete ");

            s1.displayAll();
            s2.addProduct(p1);
            s2.addProduct(p2);
            s2.addProduct(p3);
            s2.displayAll();

            Company c1 = new Company("Unilever");
            c1.addStore(s1);
            c1.addStore(s2);
            c1.displayAll();

            int n = c1.searchNbOfStore("TV");
            System.out.println("Number of Stores have Tv " + n);
        
    }
    
}

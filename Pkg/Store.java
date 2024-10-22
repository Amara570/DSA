package Pkg;

public class Store {

    private String name;
    private String location;
    private Product productList[];
    private int nbProduct;
    
   public  Store(String name, String location)
    {
        this.name = name;
        this.location = location;
        productList = new Product[100];
        nbProduct =0;

    }
    public String getName()
    {
        return name;
    }
    public void addProduct(Product p)
    {
        if(nbProduct < 100)
        {
            productList[nbProduct] = p;
            nbProduct++;
        }
        else{
            System.out.println("Maximum product Reached ");
        }
    }
    public boolean SearchProduct(String productName)
    {
        for(int i=0; i< nbProduct; i++)
        {
            if(productList[i].getName().equals(productName))
            {
                return true;

            }
        }
        return false;

    }
    Product deleteProduct(String productName)
    {
        Product deleteProduct = null;
        for(int i =0; i<nbProduct; i++)
        {
            if(productList[i].getName().equals(productName))
            {
                deleteProduct = productList[i];
                for(int j=0; j<nbProduct-1; j++)
                {
                    productList[j] = productList[j+1];
                }
                productList[nbProduct-1] = null;
                nbProduct--;
                return deleteProduct;

            }
        }
        return null;

    }
    public void displayAll()
    {
        System.out.println("Products in Store : " + name);
        for (int i=0; i< nbProduct; i++)
        {
            System.out.println(productList[i].getName());
        }

    }
}

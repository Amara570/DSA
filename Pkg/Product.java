package Pkg;

public class Product {

    private String name;
    private int quantity;
    private double price;

    Product(String name,int quantity,double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    
}

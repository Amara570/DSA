package Pkg;

public class Company {
    private String name;
    private Store arrStore[];
    private int nbStore;

    Company(String name)
    {
        this.name = name;
        arrStore = new Store[10];
        nbStore = 0;
    }
    public void addStore(Store s)
    {
        if(nbStore < 10)
        {
            arrStore[nbStore] = s;
            nbStore++;
        }
        else{
            System.out.println("Maximum Stores reached ");
        }

    }
    public int searchNbOfStore(String productName)
    {
        int count = 0;
        for(int i=0; i<nbStore; i++)
        {
            if(arrStore[i].SearchProduct(productName))
            {
                count++;
            }
        }
        return count;
    }
    public void displayAll()
    {
        System.out.println("Store belongs to " + name);
        for(int i=0; i<nbStore; i++)
        {
            System.out.println(arrStore[i].getName());
        }
    }
    
}

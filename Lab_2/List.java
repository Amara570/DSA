package Lab_2;

public interface List {
    
    public boolean isEmpty();

    public int size();

    public void add(Object item);

    public void add(int index, Object item);

    public void remove(int index);

    public void removeFirst(Object item);

    public List duplicate();
  
     public List duplicateReversed();


}

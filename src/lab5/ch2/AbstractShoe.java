package lab5.ch2;

public abstract class AbstractShoe implements  Shoe
{
    private int size;
    private String color;

    public AbstractShoe(int size, String color)
    {
        this.size = size;
        this.color = color;
    }

    @Override
    public String getColor()
    {
        return this.color;
    }

    @Override
    public int getSize()
    {
        return this.size;
    }
}

package lab3.visitor;

public class Video implements Element
{
    private String name;
    private String type;
    private int price;
    private int time;

    public Video(String name, String type, int price, int time)
    {
        this.name = name;
        this.type = type;
        this.price = price;
        this.time = time;
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }

    @Override
    public String toString()
    {
        return this.name + ", type:" + this.type + ", price:" + this.price + ", time:" + this.time;
    }

    public int getPrice()
    {
        return this.price;
    }

    public int getTime()
    {
        return time;
    }
}

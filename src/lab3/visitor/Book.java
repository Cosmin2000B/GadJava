package lab3.visitor;

public class Book implements Element
{
    private String name;
    private int numberOfPages;
    private String autor;
    private int price;

    public Book(String name, int numberOfPages, int price)
    {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.autor = autor;
        this.price = price;
    }

    public void setAuthor(String autor)
    {
        this.autor = autor;
    }

    public int getNumberOfPages()
    {
        return this.numberOfPages;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return this.autor + ", name:" + this.name + ", number of pages:" + this.numberOfPages + ", price:" + this.price;
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}

package lab3.visitor;

public class PriceVisitor implements Visitor
{
    private int sum;

    @Override
    public void visit(Book book)
    {
        sum += book.getPrice();
    }

    @Override
    public void visit(Video video)
    {
        sum += video.getPrice();
    }

    @Override
    public void visit(Audio audio)
    {
        sum += audio.getPrice();
    }

    public int getSum()
    {
        return this.sum;
    }

    @Override
    public String toString()
    {
        return "Total sum is: " + this.sum;
    }
}

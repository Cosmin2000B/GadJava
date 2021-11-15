package lab3.visitor;

public class TimeVisitor implements Visitor
{
    private int totalTime = 0;

    @Override
    public void visit(Book book)
    {
        totalTime += book.getNumberOfPages() * 4;
    }

    public void visit(Video video)
    {
        totalTime += video.getTime();
    }

    public void visit(Audio audio)
    {
        totalTime += audio.getTime();
    }

    @Override
    public String toString()
    {
        return "Total time is: " + this.totalTime;
    }
}

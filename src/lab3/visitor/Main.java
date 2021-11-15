package lab3.visitor;

public class Main
{
    public static void main(String[] args)
    {
        Element[] elements = new Element[10];
        Book book1 = new Book("Book1", 300, 50);
        Book book2 = new Book("Book2", 100, 34);

        elements[0] = book1;
        elements[1] = book2;

        Video video1 = new Video("Video1", "Funny", 200, 4);
        Video video2 = new Video("Video2", "Buisness", 300, 20 );

        elements[2] = video1;
        elements[3] = video2;

        Audio audio1 = new Audio("audio1", 30, 5);
        Audio audio2 = new Audio("audio2", 25, 10);

        elements[4] = audio1;
        elements[5] = audio2;

        for(Element element: elements)
            if(element != null)
                System.out.println(element);

        PriceVisitor priceVisitor = new PriceVisitor();
        for(Element element: elements)
            if(element != null)
                element.accept(priceVisitor);

        System.out.println(priceVisitor);

        TimeVisitor timeVisitor = new TimeVisitor();
        for(Element element: elements)
            if(element != null)
                element.accept(timeVisitor);

        System.out.println(timeVisitor);
    }

}

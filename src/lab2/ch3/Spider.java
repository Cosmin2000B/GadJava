package lab2.ch3;

public class Spider extends Animal
{
    protected Spider()
    {
        super(8); // all spiders have 8 legs
    }

    @Override
    public void eat()
    {
        System.out.println("The spider eats!");
    }
}

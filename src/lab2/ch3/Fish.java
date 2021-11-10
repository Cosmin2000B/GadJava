package lab2.ch3;

public class Fish extends Animal implements Pet
{
    private String name;

    protected Fish()
    {
        super(0); // a fish has 0 legs
        this.name = "";
    }

    protected Fish(String name)
    {
        super(0);
        this.name = name;
    }

    @Override
    public void walk()
    {
        System.out.println("A fish can't walk!");
    }

    @Override
    public void eat()
    {
        System.out.println("The fish is eating!");
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void play()
    {
        System.out.println("The fish is playing!");
    }
    //
}

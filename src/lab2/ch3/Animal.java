package lab2.ch3;

abstract public class Animal
{
    protected int legs;

    protected Animal(int legs)
    {
        this.legs = legs;
    }

    public void walk()
    {
        System.out.println("The animal walks on " + this.legs + " legs.");
    }

    abstract public void eat();
}

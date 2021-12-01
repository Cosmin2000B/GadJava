package proiect_Design_Patterns.abstract_factory;

public class CarFactory
{
    public static Car getCar(AbstractCarFactory f)
    {
        return f.create();
    }
}

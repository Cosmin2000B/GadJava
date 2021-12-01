package proiect_Design_Patterns.abstract_factory;

public class BmwFactory implements AbstractCarFactory
{
    @Override
    public Car create()
    {
        return new BmwCar();
    }
}

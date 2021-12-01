package proiect_Design_Patterns.abstract_factory;

public class ToyotaFactory implements AbstractCarFactory
{

    @Override
    public Car create()
    {
        return new ToyotaCar();
    }
}

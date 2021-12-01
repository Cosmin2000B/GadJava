package proiect_Design_Patterns.abstract_factory;

public class BmwCar implements Car
{
    @Override
    public String getManufacturer()
    {
        return "BMW";
    }

    @Override
    public String getEngine()
    {
        return "BMW engine";
    }

    @Override
    public String getModel()
    {
        return "E46";
    }

    @Override
    public String toString()
    {
        return "This car is manufactured by " + this.getManufacturer() + ", it has "
                + this.getEngine() + " and it's model is " + this.getModel();
    }
}

package proiect_Design_Patterns.abstract_factory;

public class ToyotaCar implements Car
{
    @Override
    public String getManufacturer()
    {
        return "Toyota";
    }

    @Override
    public String getEngine()
    {
        return "Toyota engine";
    }

    @Override
    public String getModel()
    {
        return "Sienna (2017)";
    }

    @Override
    public String toString()
    {
        return "This car is manufactured by " + this.getManufacturer() + ", it has "
                + this.getEngine() + " and it's model is " + this.getModel();
    }
}

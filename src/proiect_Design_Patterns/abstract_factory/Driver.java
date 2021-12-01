package proiect_Design_Patterns.abstract_factory;

public class Driver
{
    public static void main(String[] args)
    {
        Car car1 = CarFactory.getCar(new BmwFactory());
        Car car2 = CarFactory.getCar(new ToyotaFactory());

        System.out.println(car1);
        System.out.println(car2);
    }
}

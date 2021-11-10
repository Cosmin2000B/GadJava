package lab3.decorator;

public class DcoratorDriver
{
    public static void main(String[] args)
    {
        Beverage coffe = new Coffe();
        Milk coffeMilk = new Milk(coffe);

        System.out.println(coffeMilk.getDescription());

        Beverage tea = new Tea();
        Milk teaWmilk = new Milk(tea);

        System.out.println(teaWmilk.getDescription());
    }
}

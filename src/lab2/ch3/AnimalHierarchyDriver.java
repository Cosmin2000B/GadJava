package lab2.ch3;

public class AnimalHierarchyDriver
{
    public static void main(String[] args)
    {
        //
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.play();
        a.walk();
        e.walk();
        
        System.out.println();
    }
}

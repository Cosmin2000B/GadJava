package lab1.ch2;

public class FooBar
{
    public static String contains(int num)
    {
        if(num == 0)
            return "";

        if(num % 10 == 3)
            return contains(num/10) + "Foo";
        if(num % 10 == 5)
            return contains(num/10) + "Bar";
        if(num % 10 == 7)
            return contains(num/10) + "Qix";

        return contains(num/10);
    }

    public static String fooBarQuix(int num)
    {
        String toReturn = "";

        if(num % 3 == 0)
            toReturn += "Foo";
        if(num % 5 == 0)
            toReturn += "Bar";
        if(num % 7 == 0)
            toReturn += "Qix";

        toReturn += contains(num);

        if(toReturn.equals(""))
            return "" + num;
        return toReturn;
    }

    public static void main(String[] args)
    {
        for(int i = 1; i <= 53; i++)
            System.out.println(i + " " + fooBarQuix(i));
    }
}

package lab8.ex1;

public class Test
{
    private int j;

    public static void main(String[] args)
    {
        Test test = new Test();
        test.testLambda();
        System.out.println(test);
    }

    public int testLambda()
    {
        int i = 0;
        j++;
        // i++;  //-> ar da eroare

        Runnable r = () ->
        {
            System.out.println(i); // i++
            System.out.println(this.j);
        };

        r.run();
        return i;
    }
}

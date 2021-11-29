package lab7.interference;

public class Main
{
    public static int v = 0;

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(v);

        Runnable runnable = new Runnable()
        {
            public void run()
            {
                v++;
                System.out.println(v);
            }
        };

        for(int i = 0; i < 500; ++i)
            (new Thread(runnable)).start();

        Thread.sleep(1000);

        System.out.println("result = " + v);
    }
}

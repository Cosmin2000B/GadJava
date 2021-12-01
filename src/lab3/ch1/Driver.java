package lab3.ch1;

public class Driver
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
}

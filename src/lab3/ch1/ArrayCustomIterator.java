package lab3.ch1;

public class ArrayCustomIterator
{
    private int[] arr;
    private int position;

    public ArrayCustomIterator(int[] arr)
    {
        this.arr = arr;
        this.position = 0;
    }

    public int next()
    {
        return arr[position++];
    }

    public boolean hasNext()
    {
        return position < arr.length;
    }
}

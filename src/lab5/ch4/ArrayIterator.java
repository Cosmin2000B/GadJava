package lab5.ch4;

import lab5.ch3.GenericList;
import lab5.ch3.IGenericList;
import lab5.ch3.Node;

public class ArrayIterator<T> implements IArrayIterator<T>
{
    private int size;
    private T[] arr;

    private GenericList list;
    private Node iter;

    private int currPos;

    public ArrayIterator(T[] arr)
    {
        this.arr = arr;
        size = arr.length;;
    }

    public  ArrayIterator(GenericList list)
    {
        this.list = list;
        iter = list.getFirst();
    }

    @Override
    public boolean hasNext()
    {
        if(list == null)
            return currPos < size;
        else
            return iter.getNext() != null;
    }

    @Override
    public T next()
    {
        return arr[currPos++];
    }

    public Node nextNode()
    {
        Node aux = iter;
        iter = (Node) iter.getNext();
        return  aux;
    }
}

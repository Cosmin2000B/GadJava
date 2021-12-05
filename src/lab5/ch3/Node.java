package lab5.ch3;

public class Node <T> implements IGenericNode<T>
{
    private T value;
    private Node<T> next;

    public Node(T value)
    {
        this.value = value;
    }

    @Override
    public T getValue()
    {
        return value;
    }

    @Override
    public void setValue(T value)
    {
        this.value = value;
    }

    @Override
    public IGenericNode getNext()
    {
        return next;
    }

    @Override
    public void setNext(IGenericNode next)
    {
        this.next = (Node<T>) next;
    }
}

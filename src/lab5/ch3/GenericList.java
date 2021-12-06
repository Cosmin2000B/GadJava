package lab5.ch3;

public class GenericList<T> implements IGenericList<T>
{
    private Node<T> first;
    private Node<T> last;

    public GenericList()
    {
        //
    }

    public GenericList(T value)
    {
        Node<T> first = new Node<>(value);
        this.first = first;
        this.last = first;
    }

    @Override
    public void insert(T element)
    {
        Node<T> node = new Node(element);

        if(last == null)
        {
            first = node;
            last = node;
        }
        else
        {
            last.setNext(node);
            last = node;
        }
    }

    @Override
    public void println()
    {
        Node<T> iter = first;

        while(iter.getNext() != null)
        {
            System.out.print(iter.getValue() + " ");
            iter = (Node<T>) iter.getNext();
        }

        System.out.println();
    }

    public Node<T> getFirst()
    {
        return first;
    }

    public Node<T> getLast()
    {
        return last;
    }
}

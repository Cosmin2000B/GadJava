package lab5.ch4;

import lab5.ch3.GenericList;
import lab5.ch3.Node;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[] {1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println();
        // STAGE 2

        GenericList<Integer> list= new GenericList(1);
        for(int i = 3; i < 10; i += 2)
            list.insert(i);

        ArrayIterator<GenericList> listIt = new ArrayIterator<>(list);
        while(listIt.hasNext())
        {
            System.out.println(listIt.nextNode().getValue());
        }
    }
}

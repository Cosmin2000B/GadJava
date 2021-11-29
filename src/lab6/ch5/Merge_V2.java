package lab6.ch5;

import java.util.ArrayList;
import java.util.List;

public class Merge_V2
{
    public static List merge(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> toReturn = new ArrayList<>();

        int i1 = 0, i2 = 0;

        while(i1 < list1.size() && i2 < list2.size())
        {
            if(list1.get(i1) < list2.get(i2))
                toReturn.add(list1.get(i1++));
            else
                toReturn.add(list2.get(i2++));
        }

        if(i1 < list1.size())
        {
            while(i1 < list1.size())
                toReturn.add(list1.get(i1++));
        }
        else
        {
            while(i2 < list2.size())
                toReturn.add(list2.get(i2++));
        }

        return toReturn;
    }
}

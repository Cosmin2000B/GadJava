package lab6.set;

import java.util.*;

public class Set
{
    public static void createSet()
    {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,6,7));
        HashSet hashSet = new HashSet(list);

        System.out.println(hashSet);
    }

    public static Map<Integer, String> createMap()
    {
        Map newMap = new HashMap();

        newMap.put(1, "One");
        newMap.put(5, "five");
        newMap.put(7, "seven");
        newMap.put(5, "fiveeeee");

        return newMap;
    }

    public static void main(String[] args)
    {
        createSet();

        Map<Integer, String> map = createMap();
        System.out.println(map);
    }
}

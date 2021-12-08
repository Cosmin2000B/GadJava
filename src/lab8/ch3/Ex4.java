package lab8.ch3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4
{
    public static String mapToString(Map<Integer, String> words)
    {
        return words.entrySet()
                .stream()
                .map(s -> s.getKey() + s.getValue())
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args)
    {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");

        System.out.println(mapToString(myMap));
    }
}

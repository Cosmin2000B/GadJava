package lab8.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Ex3
{
    public static List<String> replaceToUpper(List<String> words)
    {
        return words.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("IoNel", "nU", "este", "cuMINte", "niciodata");

        System.out.println(replaceToUpper(words));
    }
}

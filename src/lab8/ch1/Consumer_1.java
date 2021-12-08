package lab8.ch1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_1
{
    @Test
    public void consumer_1()
    {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));

        Consumer<List<String>> consumer = (List<String> l) -> l.removeAll(l);
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>()); // daca nu sunt egale nu trece ,ai departe
        System.out.println("------------------"); // si nu se printeaza asta
    }

    @Test
    public void consumer_2()
    {
        List<String> list1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = list -> c1.andThen(c2);
        consumer.accept(list1);

        Assert.assertEquals(list1, list2);
    }
}

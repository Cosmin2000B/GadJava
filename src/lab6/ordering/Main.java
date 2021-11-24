package lab6.ordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<Person>();

        Person p1 = new Person("D", 21);
        Person p2 = new Person("B", 20);
        Person p3 = new Person("C", 24);
        Person p4 = new Person("A", 30);
        Person p5 = new Person("B", 19);

        persons.addAll(Arrays.asList(p1, p2, p3, p4, p5));

        Collections.sort(persons);
        // persons.sort(Person::compareTo); // --merge la fel de bn

        for(Person p: persons)
            System.out.println(p);
    }
}

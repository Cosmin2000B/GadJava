package lab6.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersDriver
{
    public static void findLeaders(ArrayList<Integer> numbers)
    {
        int max = numbers.get(numbers.size() - 1);
        System.out.print(numbers.get(numbers.size() - 1) + " ");

        for(int i = numbers.size() - 1; i >= 0; i--)
        {
            if(max < numbers.get(i))
            {
                max = numbers.get(i);
                System.out.print(max + " ");
            }
        }
    }

    public static void findLeaders2(ArrayList<Integer> numbers)
    {
        Collections.reverse(numbers);

        int max = numbers.get(0);
        System.out.print(max);

        for(Integer currentElement: numbers)
        {
            if(max < currentElement)
            {
                max = currentElement;
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(11, 5 ,3 ,1, 2));
        findLeaders(numberList);
        findLeaders2(numberList);
    }
}

package lab3.ch2;

import java.util.Arrays;

public class Main
{
    public static void displaySorted(SortingStrategy strategy, Integer[] arr)
    {
        strategy.sort(arr);

        for(int x: arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};

        Integer[] copy1OfArray = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArray = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy1OfArray);
        displaySorted(new MergeSort(), copy2OfArray);
    }
}

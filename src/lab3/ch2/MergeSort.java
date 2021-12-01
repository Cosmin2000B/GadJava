package lab3.ch2;

public class MergeSort implements SortingStrategy
{
    private void merge(Integer[] list, Integer[] list1, Integer[] list2)
    {
        // go trough first list
        int i1 = 0;
        // go trough second list
        int i2 = 0;
        // go trough temporary list temp
        int it = 0;


        while(i1 < list1.length && i2 < list2.length)
        {
            if(list1[i1] <list2[i2])
                list[it++] = list1[i1++];
            else
                list[it++] = list2[i2++];
        }

        if(i1 < list1.length)
        {
            while(i1 < list1.length)
                list[it++] = list1[i1++];
        }
        else
        {
            while(i2 < list2.length)
                list[it++] = list2[i2++];
        }
    }

    @Override
    public void sort(Integer[] list)
    {
        if(list.length == 1)
            return;

        Integer[] firstHalf = new Integer[list.length/2];
        Integer[] secondHalf;

        // odd number of elements => one more element in the secpnd half
        if(list.length % 2 == 0)
            secondHalf = new Integer[list.length/2];
        else
            secondHalf = new Integer[list.length/2 +1];

        for(int i = 0; i < list.length/2; ++i)
            firstHalf[i] = list[i];

        int aux = 0;
        for(int i = list.length/2; i < list.length; ++i)
            secondHalf[aux++] = list[i];

        sort(firstHalf);
        sort(secondHalf);
        merge(list, firstHalf, secondHalf);
    }
}

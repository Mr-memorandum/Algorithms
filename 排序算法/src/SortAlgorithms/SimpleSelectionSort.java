package SortAlgorithms;

import java.util.Arrays;

public class SimpleSelectionSort {
    SimpleSelectionSort(int[] array)
    {
        System.out.println("Simple Selection sorting:");
        for(int i = 0;i<array.length/2;i++)
        {
            int pointEnd = array.length-i-1;
            for(int j = i;j<array.length-i;j++)
            {
                if(array[j]<array[i])
                {
                    BubbleSort.exchange(array,j, i);
                }

                if(array[i]>array[pointEnd])
                {
                    BubbleSort.exchange(array,i,pointEnd);
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}

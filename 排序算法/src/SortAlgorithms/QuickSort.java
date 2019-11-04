package SortAlgorithms;
import java.util.Arrays;

class QuickSort
{
    QuickSort(int[] array)
    {
        System.out.println("Quick Sorting:");
        Sort(array,0,array.length-1);
    }

    private void Sort(int[] array, int lowSentry, int highSentry)
    {
        if(highSentry > lowSentry)
        {
            int baseElement = array[lowSentry];
            int i = lowSentry;
            int j = highSentry;
            while (i < j)
            {
                while (baseElement <= array[j] && i < j)
                {
                    j--;
                }
                while (baseElement >= array[i] && i < j)
                {
                    i++;
                }
                BubbleSort.exchange(array, i, j);
                System.out.println(Arrays.toString(array));
            }
            BubbleSort.exchange(array, i, lowSentry);
            Sort(array, lowSentry, j - 1);
            Sort(array, j + 1, highSentry);
        }
    }
}

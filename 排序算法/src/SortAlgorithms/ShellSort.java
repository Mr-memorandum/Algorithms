package SortAlgorithms;
import java.util.Arrays;
class ShellSort {
    private void Sort(int[] array, int h)
    {
        for(int i = h;i<array.length;i++)
        {
            int j = i;
            do
            {
                if(array[j]<array[j-h])
                {
                    BubbleSort.exchange(array,j,j-h);
                }
                j = j - h;
            }
            while(j>=h);
            System.out.println(Arrays.toString(array));
        }
    }

    ShellSort(int[] a)
    {
        System.out.println("Shell's sort:");
        int h = a.length/3;
        while(h>=1)
        {
            System.out.println("h is " + h);
            Sort(a,h);
            h = h/2;
        }
    }
}

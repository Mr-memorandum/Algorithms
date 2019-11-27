import java.util.Arrays;

public class HeapSort {
    HeapSort(int[] array)
    {
        heapSort(array);
    }

    public void heapSort(int[] array)
    {
        for(int i = array.length/2-1;i>=0;i--)
        {
            maxHeap(array,i,array.length-1);
            System.out.println(Arrays.toString(array));
        }
        for(int i = array.length-1;i>0;i--)
        {
            exchange(array,0,i);
            maxHeap(array,0,i-1);
            System.out.println(Arrays.toString(array));
        }
    }

    private void maxHeap(int[] array,int start,int end)
    {
        int parentNode = start;
        int childNode = 2*parentNode+1;
        while(childNode<=end)
        {
            if(childNode+1<=end && array[childNode]<=array[childNode+1])
            {
                childNode++;
            }
            if(array[parentNode]<=array[childNode])
            {
                exchange(array,parentNode,childNode);
                parentNode = childNode;
                childNode = 2*parentNode+1;
            }
            else {
                return;
                }
        }
    }

    private void exchange(int[] array,int i,int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

/**
 * This is a QuickSort class.
 * Sorts an array of element using quick sort algorithm.
 * @author thapaliya
 */
public class QuickSort implements SortInterface
{
    private int array[];
    
    /**
     * Sorts the array by partitioning it using pivot points.
     * @param elements 
     */
    public void sort(int[] elements) 
    {
        array=elements;
        quickSort(0, elements.length);
    }
    
    /*
     * Sorts global array in an incresing order
     * low and high will define the array to be sorted from index low to high
     */
    private void quickSort(int low, int high)
    {
        int pivotPoint;
        
        if(high>low)
        {
            pivotPoint=partition(low,high);
            quickSort(low, pivotPoint-1);
            quickSort(pivotPoint+1, high);
        }
    
    }
    
    
    /*
     * Partitions the global array into two halves by using a pivotItem.
     * returns the pivotPoint or index of the array for index low to index high
     */
    private int partition(int low, int high)
    {
        int pivotPoint, pivotItem,j,temp;
        pivotItem= array[low];
        j=low;
        temp=0;
        
        for(int i=low+1; i<array.length; i++)
        {
            if(array[i]<pivotItem)
            {
                j++;
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
             }
        }
        pivotPoint=j;
        
        array[low]=array[pivotPoint];
        array[pivotPoint]=pivotItem;
        return pivotPoint;
    }
    
}

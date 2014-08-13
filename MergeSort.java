/**
 * This is a MergeSort class.
 * Sorts the integer array elements by dividing it into smaller pieces of arrays and then sorts it piece by piece while merging it until the initial array is completely sorted 
 * 
 * @author thapaliya
 */
public class MergeSort implements SortInterface
{
    /**
     * Sorts the integer array elements using divide and conquer strategy
     * elements will be sorted in an increasing order.
     * @param elements 
     */
    public  void sort(int []elements)
    {
        if(elements.length>1)
        {
            int a,b,i,j;
            int firstHalf[], secondHalf[];
            a= elements.length/2;
            b=elements.length - a;
            firstHalf= new int[a];
            secondHalf= new int[b];
        
            i=0;
            j=0;
            while(i<a) firstHalf[i]= elements[i++];
            while(i<(a+b)) secondHalf[j++]=elements[i++];
            sort(firstHalf);
            sort(secondHalf);
            merge(firstHalf, secondHalf,elements);
        }
        
      }
    
   /**
     * first and second should be sorted arrays.
     * Merges two sorted array into one sorted array.
     * third will be a single sorted array containing all the elements from first and second.
     * @param first is already sorted
     * @param second is already sorted
     * @param third will be the merged array.
     */
    public void merge(int first[], int second[], int third[])
    {
        int i,j,k;
        i=0;j=0;k=0;
        
        while(i<first.length && j<second.length)
        {
            if(first[i]>second[j])
            {
                third[k]= second[j];
                j++;
            }
            else
            {
                third[k]=first[i];
                i++;
            }
            k++;
        
        }
        
        if(i==first.length)  while(j<second.length) third[k++]= second[j++];
        else  while(i<first.length) third[k++] = first[i++];
        
     }
    
}

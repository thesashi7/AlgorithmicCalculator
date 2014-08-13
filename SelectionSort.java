
/**
 * This is a SelectionSort class.
 ** Sorts elements in an increasing order by comparing each element from the start index (till the end) to the other elements in increasing index.   
**/

public class SelectionSort implements SortInterface
{
    /**
    * Sorts elements in a linear fashion from smallest to largest.
    **/
    public void sort(int []elements)
    {
        int temp;
        
        for(int i=0; i<elements.length-1; i++)
        {
            for(int j=i; j<elements.length-1; j++)
                if(elements[i]>elements[j+1])
                {
                    temp= elements[i];
                    elements[i]=elements[j+1];
                    elements[j+1]=temp;
                }
        
        }
    }

    
}

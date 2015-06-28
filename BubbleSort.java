

public class BubbleSort implements SortInterface
{
    /**
    * Sorts elements in a linear fashion from smallest to largest.
    **/
    public void sort(int []elements)
    {
        boolean swapped;
        int temp;
        
        do
        {
            swapped = false;
            for(int i = 0; i<elements.length-1; i++)
            {
                if(elements[i]>elements[i+1])
                {
                    temp = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
    }
}

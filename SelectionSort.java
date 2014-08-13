
public class SelectionSort implements SortInterface
{
    public static void sort(int []elements)
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

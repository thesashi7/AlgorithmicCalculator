package AlgoCalc;

public class InsertionSort implements SortInterface{
	
	public void sort(int [] elements){
		int temp,j;
		temp=0;
		
		
		for(int i=1; i<elements.length; i++){
			j = i;
			while(j>0 && elements[j-1] > elements[j]){
				temp = elements[j];
				elements[j] = elements[j-1];
				elements[j-1] = temp;
				j--;
			}
		}
	}
	
}

package AlgoCalc;

public class InsertionSort implements SortInterface{
	
	private int[] array = null;
	int j = 0;
	
	InsertionSort(int[] array){
		this.array = array;
	}
	
	public int[] sort(){
		for(int i=1; i<array.length; i++){
			j = i;
			while(j>0 && array[j-1] > array[j]){
				swap(j-1, j);
				j--;
			}
		}
		return array;
	}
	
	
	private void swap(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}

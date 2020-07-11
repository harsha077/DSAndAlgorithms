package Sort;

public class MergeSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] Arr = {120,100,80,40,10};
		//int[] Arr = {90,70,30};
		MergeSort1 ms = new MergeSort1();
		
		ms.mergeSort(Arr, 0, Arr.length-1);

		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}
	}
	
	void merge(int Arr[], int start, int mid, int end){
		int temp[] = new int[end - start + 1];
		
		int i = start, j = mid+1, k=0;
	
		while(i <= mid && j <= end){
			if(Arr[i] <= Arr[j]){
				temp[k] = Arr[i];
				k += 1;
				i += 1;
			}else{
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}
		
		while(i<=mid){
			temp[k] = Arr[i];
			k += 1;
			i += 1;
		}
		
		while(j <= end){
			temp[k] = Arr[j];
			k+=1;
			j+=1;
		}
		
		for(i = start; i<= end; i+=1){
			Arr[i] = temp[i-start];
		}
	}
	
	void mergeSort(int Arr[], int start, int end){
		if(start < end){
			int mid = (start+end)/2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid+1, end);
			merge(Arr,start, mid, end);
		}
	}

}

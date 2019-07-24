public class SelectionSort {
	public void SelectionSortAscending(int[] A) {
		int length = A.length;
		int temp,minIndex;
		for(int i=0;i<length;i++) {
			minIndex = minIndex(A, i, length);
			temp = A[minIndex];
			A[minIndex] = A[i];
			A[i]=temp;
		}
		
	}
	public void SelectionSortDescending(int[] A) {
		int length = A.length;
		int temp,maxIndex;
		for(int i=0;i<length;i++) {
			maxIndex = maxIndex(A, i, length);
			temp = A[maxIndex];
			A[maxIndex] = A[i];
			A[i]=temp;
		}
		
	}
	private  int minIndex(int[]A , int i,int length) {
		int target_index = i;
		for(int j=i+1;j<length;j++) {
			if(A[j]<A[target_index]) {
				target_index = j;
			}
		}
		return target_index;
	}
	private  int maxIndex(int[]A , int i,int length) {
		int target_index = i;
		for(int j=i+1;j<length;j++) {
			if(A[j]>A[target_index]) {
				target_index = j;
			}
		}
		return target_index;
	}
}

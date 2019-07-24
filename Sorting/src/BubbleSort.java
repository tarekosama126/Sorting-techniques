public class BubbleSort {
	public void BubbleSortAscending( int[] A ) {
		int temp;
		int length = A.length-1;
		for(int i=0;i<length;i++) {
			for(int j =0;j<length-i;j++) {
				if(A[j] > A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		return ;
	}
	public void BubbleSortDecending( int[] A ) {
		int temp;
		int length = A.length;
		for(int i=0;i<length;i++) {
			for(int j =0;j<length-i-1;j++) {
				if(A[j] < A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		return;
	}
	
}

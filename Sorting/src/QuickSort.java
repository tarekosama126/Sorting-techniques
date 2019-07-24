public class QuickSort {
	public void QuickSortAscending(int[] Array, int low, int high) {

		if (low < high) {
			int pivot_index = PartioningAscending(Array, low, high);
			QuickSortAscending(Array, low, pivot_index - 1);
			QuickSortAscending(Array, pivot_index + 1, high);
		}

	}

	public void QuickSortDescending(int[] Array, int low, int high) {
	
		if (low < high) {
			int pivot_index = PartioningDescending(Array, low, high);
			QuickSortDescending(Array, low, pivot_index - 1);
			QuickSortDescending(Array, pivot_index + 1, high);
		}	
		

	}

	private int PartioningAscending(int[] Array, int low, int high) {
		int pivot = Array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (Array[j] <= pivot) {
				i++;

				int temp = Array[i];
				Array[i] = Array[j];
				Array[j] = temp;
			}
		}

		int temp = Array[i + 1];
		Array[i + 1] = Array[high];
		Array[high] = temp;

		return i + 1;
	}
	
	private int PartioningDescending(int[] Array, int low, int high) {
		int pivot = Array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (Array[j] >= pivot) {
				i++;

				int temp = Array[i];
				Array[i] = Array[j];
				Array[j] = temp;
			}
		}

		int temp = Array[i + 1];
		Array[i + 1] = Array[high];
		Array[high] = temp;

		return i + 1;
	}
	
	

}
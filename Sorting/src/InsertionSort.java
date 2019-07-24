public class InsertionSort {
	public void InsertionSortAscending(int[] Array) {

		int i, key, j;
		for (i = 1; i < Array.length; i++) {
			key = Array[i];
			j = i - 1;

			while (j >= 0 && Array[j] > key) {
				Array[j + 1] = Array[j];
				j = j - 1;
			}
			Array[j + 1] = key;
		}
	}

	public void InsertionSortDescending(int[] Array) {

		int i, key, j;
		for (i = 1; i < Array.length; i++) {
			key = Array[i];
			j = i - 1;

			while (j >= 0 && Array[j] < key) {
				Array[j + 1] = Array[j];
				j = j - 1;
			}
			Array[j + 1] = key;
		}
	}

}
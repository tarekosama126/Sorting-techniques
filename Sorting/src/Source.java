import java.util.Random;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		int [] arr = randomarray(size);
		BubbleSort bubble =  new BubbleSort();
		System.out.println("Bubble time :");
		long start = System.nanoTime();
		bubble.BubbleSortAscending(arr);
		long end = System.nanoTime();
		System.out.println(end - start);
		//System.out.println("Bubble Sort:");
		//print(arr);
		
		int [] arr1 = randomarray(size);
		InsertionSort insert = new InsertionSort();
		long start1 = System.nanoTime();
		insert.InsertionSortAscending(arr1);
		long end1 = System.nanoTime();
		System.out.println("Insert time:");
		System.out.println(end1-start1);
		//System.out.println("Insertion Sort:");
		//print(arr1);
		
		int [] arr2 = randomarray(size);
		SelectionSort selection = new SelectionSort();
		long start2 = System.nanoTime();
		selection.SelectionSortAscending(arr2);
		long end2 = System.nanoTime();
		System.out.println("Selection time:");
		System.out.println(end2-start2);
		//System.out.println("Selection Sort:");
		//print(arr2);
		
		int [] arr3 =randomarray(size);
		MergeSort Merge = new MergeSort();
		long start3 = System.nanoTime();
		Merge.MergeSortAscending(arr3,0, arr.length-1);
		long end3 = System.nanoTime();
		System.out.println("Merge time:");
		System.out.println(end3-start3);
		//System.out.println("Merge Sort:");
		//print(arr3);
		
		int [] arr4 =randomarray(size);
		QuickSort Quick = new QuickSort();
		long start4 = System.nanoTime();
		Quick.QuickSortAscending(arr4, 0, arr4.length-1);
		long end4 = System.nanoTime();
		System.out.println("Quick time:");
		System.out.println(end4-start4);
		//System.out.println("Quick Sort:");0
		//print(arr4);
		
		int [] arr5 = randomarray(size);
		Heap y = new Heap();
		long start5 = System.nanoTime();
		y.HeapSortAscending(arr5, arr5.length);
		long end5 = System.nanoTime();
		System.out.println("Heap time:");
		System.out.println(end5-start5);
		//System.out.println("Heap Sort:");
		//print(arr5);
		
		
		
		
	}
	
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			   System.out.print(a[i]+" ");
			}
		System.out.println();
	}
	public static int[] randomarray(int size) {
		Random rand = new Random();
		int [] array = new int [size];
		for(int j=0;j<size;j++) {
			array[j] = rand.nextInt(size); 
		}
		return array;
	}
}

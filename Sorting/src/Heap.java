public class Heap {
	private int Parent(int i) {
		return i/2;
	}
	private int Left(int i) {
		return 2*i;
	}
	private int Right(int i) {
		return (2*i)+1;
	}
	public void BuildMaxHeap(int Array[],int Size) {
		
		for(int i =  Size/2;i>0;i--) {
			
			MaxHeapify(Array, i, Size);
		}
	}
	public void BuildMinHeap(int Array[],int Size) {
		
		for(int i = Size/2;i>0;i--) {
			
			MinHeapify(Array, i, Size);
		}
	}
	private boolean isLeaf(int pos,int size) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
	private void MaxHeapify(int Array[],int i, int HeapSize) {
		int left = Left(i);
		int right = Right(i);
		int largest=i;
		if(isLeaf(i, HeapSize)) {
			return;
		}
		if( Array[left]>Array[largest])
			largest=left;
		if(Array[right]>Array[largest])
			largest=right;
		
		if(largest!=i)
		{
			int temp = Array[i];
			Array[i]= Array[largest];
			Array[largest]=temp;
			MaxHeapify(Array,largest,HeapSize);
			
		}	
	}
	private void MinHeapify(int Array[],int i, int HeapSize) {
		int left = Left(i);
		int right = Right(i);
		int Smallest=i;
		if(isLeaf(i, HeapSize)) {
			return;
		}
		if( Array[left]<Array[Smallest])
			Smallest=left;
		if(Array[right]<Array[Smallest])
			Smallest=right;
		
		if(Smallest!=i)
		{
			int temp = Array[i];
			Array[i]= Array[Smallest];
			Array[Smallest]=temp;
			MinHeapify(Array,Smallest,HeapSize);
			
		}	
		 
	}
	public void HeapSortAscending(int Array[], int Size) {
		BuildMaxHeap(Array, Size);
		for(int i = Array.length-1;i>1;i--) {
			int temp = Array[1];
			Array[1] = Array[i];
			Array[i] = temp;
			Size--;
			MaxHeapify(Array, 1, Size);
		}
	}
	public void HeapSortDescending(int Array[], int Size) {
		BuildMinHeap(Array, Size);
		for(int i = Array.length-1;i>1;i--) {
			int temp = Array[1];
			Array[1] = Array[i];
			Array[i] = temp;
			Size--;
			MinHeapify(Array, 1, Size);
		}
	}

}

public class MergeSort {
	
	public void MergeSortAscending(int arr[], int low, int high) 
    { 
		if(low<high)
		{
			int middle = low + (high - low)/2;
			MergeSortAscending(arr, low, middle);
			MergeSortAscending(arr, middle+1, high);
			MergeAscending(arr,low,middle,high);
		}
    }
	
	public void MergeSortDecending(int arr[], int low, int high) 
    { 
		if(low<high)
		{
			int middle = low + (high - low)/2;
			MergeSortDecending(arr, low, middle);
			MergeSortDecending(arr, middle+1, high);
			MergeDescending(arr,low,middle,high);
		}
    }
	
	private void MergeDescending(int Array[], int low,int middle, int high) {
		int n1 = middle - low +1;
		int n2 = high - middle;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for (int i=0; i<n1; i++) 
            left[i] = Array[low + i]; 
        for (int j=0; j<n2; j++) 
            right[j] = Array[middle + 1+ j]; 
        
        
        
        int i = 0, j=0,k=low; 
        
        while (i < n1 && j < n2) 
        { 
            if (left[i] >= right[j]) 
            { 
                Array[k] = left[i]; 
                i++; 
            } 
            else
            { 
            	Array[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
        	Array[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            Array[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 
	private void MergeAscending(int Array[], int low,int middle, int high) {
		int n1 = middle - low +1;
		int n2 = high - middle;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for (int i=0; i<n1; i++) 
            left[i] = Array[low + i]; 
        for (int j=0; j<n2; j++) 
            right[j] = Array[middle + 1+ j]; 
        
        
        
        int i = 0, j=0,k=low; 
        
        while (i < n1 && j < n2) 
        { 
            if (left[i] <= right[j]) 
            { 
                Array[k] = left[i]; 
                i++; 
            } 
            else
            { 
            	Array[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
        	Array[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            Array[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 
		
		
		
		
	}
		
		
		


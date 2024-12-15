import java.util.Arrays;

public class Merge_Sort {
	
	public static void sort(int arr[]) {
		System.out.println(Arrays.toString(arr));
		int length = arr.length;
		
		if(length < 2)
			return;
		
		int mid = length / 2;
		int left[] = new int[mid];
		int right[] = new int[length - mid];
		
		for(int i = 0; i < mid; i++) 
			left[i] = arr[i];
		
		for(int i = mid; i < length; i++) 
			right[i - mid] = arr[i];
		
		sort(left);
		sort(right);
		
		merge(arr, left, right);
		System.out.println(Arrays.toString(arr));
		
	}
	
  private static void merge(int arr[], int left[], int right[]) {
	  
	  int leftSize = left.length;
	  int rightSize = right.length;
	  
	  int i = 0, j = 0, k = 0;
	  
	  while(i < leftSize && j < rightSize) {
		  if(left[i] <= right[j]) {
			  arr[k] = left[i];
			  i++;
		  }
		  else {
			  arr[k] = right[j];
			  j++;
		  }
		  k++;
	  }
	  while(i < leftSize) {
		  arr[k] = left[i];
		  i++;
		  k++;
	  }
	  while(j < rightSize) {
		  arr[k] = right[j];
		  j++;
		  k++;
	  }
	  
  }
	
	
}

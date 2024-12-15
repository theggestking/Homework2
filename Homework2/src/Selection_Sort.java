import java.util.Arrays;

public class Selection_Sort {

	public static int[] Sort(int arr[]) {

		//5,3,70,12,-123,12
		//5,3,70,12,-123,12

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int indexOfMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					indexOfMin = j;
				}

			}
               swap(arr, i, indexOfMin);
		}
System.out.println(Arrays.toString(arr));
		return new int[] {};
	}

	public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

}

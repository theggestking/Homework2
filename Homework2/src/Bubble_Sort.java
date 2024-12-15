import java.util.Arrays;

public class Bubble_Sort {

	public static int[] sort(int arr[]) {
		//5,3,70,12,-123,12

		System.out.println(Arrays.toString(arr));

		boolean swapped = true;
		while(swapped) {
			swapped = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swapped = true;
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		 }
		}
		System.out.println(Arrays.toString(arr));

		return new int[] {};
	}

}

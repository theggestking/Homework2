import java.util.Arrays;

public class Insertion_Sort {

	public static int[] sort(int arr[]) {

		//5,3,70,12,-123,12
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			int currentValue = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > currentValue) {
				arr[j + 1] = arr[j];

				j--;
			}
			arr[j + 1] = currentValue;
		}
		System.out.println(Arrays.toString(arr));
		return new int[] {};
	}

}

import java.io.*;

class Sorting {	
	public static void main(String args[]){
		int arr[] = { 7, 34, 23, 74, 12, 45, 23, 1, 6, 2, 5, 3};
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	static void bubbleSort(int arr[], int n){
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					
					// Swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}
}
package Lec8;

public class Reverse_Array_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8, 6, 9, 11, 15, 17, 18, 16, 23, 27 };

		Revese(arr, 3, 11);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Revese(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}

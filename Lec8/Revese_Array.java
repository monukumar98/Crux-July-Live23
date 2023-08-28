package Lec8;

public class Revese_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8, 6 };
		Revese(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Revese(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}

package Lec8;

public class Arrays_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);// 3 5
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);//

	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}

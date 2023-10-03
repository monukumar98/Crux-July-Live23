package Lec18;

public class First_Occc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 6, 3, 7, 3, 56, 3, 11 };
		int item = 3;
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return Index(arr, item, idx + 1);

	}

}

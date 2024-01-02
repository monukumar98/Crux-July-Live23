package Lec50;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int Zero_th = Climbing_Stairs(arr, 0);
		int first = Climbing_Stairs(arr, 1);
		System.out.println(Math.min(Zero_th, first));
	}

	public static int Climbing_Stairs(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int f = Climbing_Stairs(arr, i + 1);
		int s = Climbing_Stairs(arr, i + 2);
		return Math.min(f, s) + arr[i];

	}
}

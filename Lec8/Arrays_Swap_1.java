package Lec8;

public class Arrays_Swap_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}

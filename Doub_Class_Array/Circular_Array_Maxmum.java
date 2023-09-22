package Doub_Class_Array;

public class Circular_Array_Maxmum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(MaxmumSum(arr));

	}

	public static int MaxmumSum(int[] arr) {
		int linear_sum = Kadens_Algo(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid = Kadens_Algo(arr);
		int Circular_sum = sum + mid;// circular sum
		if (Circular_sum == 0) {
			return linear_sum;
		}
		return Math.max(linear_sum, Circular_sum);

	}

	public static int Kadens_Algo(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}
}

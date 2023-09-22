package Doub_Class_Array;

public class Maximum_Sum_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] arr2 = { 1, 5, 7, 8, 10, 15, 16, 19 };
		System.out.println(Maximum_Sum(arr1, arr2));

	}

	public static int Maximum_Sum(int[] arr1, int[] arr2) {
		int i = 0;// arr1
		int s1 = 0;// arr1 ka start
		int j = 0;// arr2
		int s2 = 0;// arr2 ka start
		int ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				int sum1 = 0;
				for (int k = s1; k <= i; k++) {
					sum1 += arr1[k];
				}
				int sum2 = 0;
				for (int k = s2; k <= j; k++) {
					sum2 += arr2[k];
				}
				ans = ans + Math.max(sum2, sum1);
				i++;
				j++;
				s1 = i;
				s2 = j;
			}

		}
		int sum1 = 0;
		for (int k = s1; k < arr1.length; k++) {
			sum1 += arr1[k];
		}
		int sum2 = 0;

		for (int k = s2; k < arr2.length; k++) {
			sum2 += arr2[k];
		}
		ans = ans + Math.max(sum2, sum1);
		return ans;

	}

}

package Doub_Class_Array;

import java.util.Scanner;

public class Sorting_In_Linear_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void Sort(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int i = 0;
		while (i <= right) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++;
				i++;
			} else if (arr[i] == 1) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
	}

}

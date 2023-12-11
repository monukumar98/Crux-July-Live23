package Lec42;

import java.util.*;

public class Cras_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
		Cars[] ar = new Cars[5];
		ar[0] = new Cars(200, 10, "White");
		ar[1] = new Cars(1000, 20, "Black");
		ar[2] = new Cars(345, 3, "Yellow");
		ar[3] = new Cars(34, 89, "Grey");
		ar[4] = new Cars(8907, 6, "Red");
		// Sort(ar);
//		Arrays.sort(ar, new Comparator<Cars>() {
//
//			@Override
//			public int compare(Cars o1, Cars o2) {
//				// TODO Auto-generated method stub
//				return o1.price - o2.price;
//			}
//
//		});
		Arrays.sort(ar, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o2.speed - o1.speed;
			}

		});

		Display(ar);

	}

	public static void Display(Cars[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}

	public static <T extends Comparable<T>> void Sort(T[] arr) {

		// pass
		for (int turn = 1; turn < arr.length; turn++) {

			for (int i = 0; i < arr.length - turn; i++) {// 6-1
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}

	}

}

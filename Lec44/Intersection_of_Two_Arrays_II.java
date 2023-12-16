package Lec44;

import java.util.*;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 9, 5 };
		int[] arr2 = { 9, 4, 9, 8, 4 };
		int[] a = Intersection(arr1, arr2);
		for (int v : a) {
			System.out.print(v + " ");
		}

	}

	public static int[] Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				// int v = map.get(arr1[i]);
				map.put(arr1[i], map.get(arr1[i]) + 1);

			} else {
				map.put(arr1[i], 1);
			}

		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				ll.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}
		int[] ans = new int[ll.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ll.get(i);
		}
		return ans;

	}

}

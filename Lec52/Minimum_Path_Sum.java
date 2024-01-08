package Lec52;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Path_Sum(arr, 0, 0));
	}

	public static int Path_Sum(int[][] arr, int r, int c) {
		if (r == arr.length - 1 && c == arr[0].length - 1) {
			return arr[r][c];
		}
		if (r >= arr.length || c >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int right = Path_Sum(arr, r, c + 1);
		int down = Path_Sum(arr, r + 1, c);
		return Math.min(right, down) + arr[r][c];
	}

}

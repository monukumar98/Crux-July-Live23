package Lec52;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(grid, 0, i, dp));
		}
		System.out.println(ans);

	}

	public static int Falling_Path_Sum(int[][] grid, int cr, int cc, int[][] dp) {
		if (cc < 0 || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int dl = Falling_Path_Sum(grid, cr + 1, cc - 1, dp);
		int dr = Falling_Path_Sum(grid, cr + 1, cc + 1, dp);
		int dwon = Falling_Path_Sum(grid, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(dl, Math.min(dr, dwon)) + grid[cr][cc];

	}

}

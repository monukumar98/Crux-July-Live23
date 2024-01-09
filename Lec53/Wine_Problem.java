package Lec53;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(maximum_profit(wine, 0, wine.length - 1, 1, dp));
		System.out.println(maximum_profitBU(wine));
	}

	public static int maximum_profit(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int left = wine[i] * year + maximum_profit(wine, i + 1, j, year + 1, dp);
		int right = wine[j] * year + maximum_profit(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(left, right);
	}

	public static int maximum_profitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * wine.length;
		}
		int year = wine.length - 1;
		for (int d = 1; d < wine.length; d++) {
			for (int j = d; j < dp.length; j++) {
				int i = j - d;
				int left = wine[i] * year + dp[i + 1][j];
				int right = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(left, right);
			}
			year--;

		}
		
		return dp[0][dp[0].length - 1];
	}
}

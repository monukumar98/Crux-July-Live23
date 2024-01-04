package Lec51;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length() + 1][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_ChangeTD(s, t, 0, 0, dp));
	}

// i-->s --> coin
// j-->t --> amount	
	public static int Coin_ChangeTD(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {// amount -->0
			return 1;
		}
		if (i == s.length()) {// coin empty
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Coin_ChangeTD(s, t, i + 1, j + 1, dp);
		}
		exc = Coin_ChangeTD(s, t, i + 1, j, dp);
		return dp[i][j] = inc + exc;

	}

}

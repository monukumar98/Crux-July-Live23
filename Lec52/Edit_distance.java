package Lec52;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";

	}

// i--> s
// j-->t	
	public static int Editdistance(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Editdistance(s, t, i + 1, j + 1);// dp[i-1][j-1]
		} else {
			int D = Editdistance(s, t, i + 1, j);// dp[i-1][j]
			int I = Editdistance(s, t, i, j + 1);// dp[i][j-1]
			int R = Editdistance(s, t, i + 1, j + 1);// dp[i-1][j-1]
			ans = 1 + Math.min(I, Math.min(D, R));

		}
		return ans;

	}

}

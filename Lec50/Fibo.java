package Lec50;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] dp = new int[n + 1];
		System.out.println(fiboTD(n, dp));
		System.out.println(fiboBU(n));

	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = fibo(n - 1);
		int f2 = fibo(n - 2);
		return f2 + f1;
	}

	public static int fiboTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {// dp appply kre
			return dp[n];
		}
		int f1 = fiboTD(n - 1, dp);// dp[n-1]
		int f2 = fiboTD(n - 2, dp);// dp[n-2]
		return dp[n] = f2 + f1;// yaad kra hai
	}

	public static int fiboBU(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

}

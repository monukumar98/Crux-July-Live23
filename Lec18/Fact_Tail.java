package Lec18;

public class Fact_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n, 1));
	}

	public static int fac(int n, int ans) {
		// base case
		if (n == 0) {
			return ans;
		}

		return fac(n - 1, ans * n);

	}

}

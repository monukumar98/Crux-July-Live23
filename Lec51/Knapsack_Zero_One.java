package Lec51;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		System.out.println(Knapsack(wt, val, cap, 0));

	}

	public static int Knapsack(int[] wt, int[] val, int cap, int idx) {

		if (cap == 0 || idx == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + Knapsack(wt, val, cap - wt[idx], idx + 1);
		}
		exc = Knapsack(wt, val, cap, idx + 1);
		return Math.max(inc, exc);
	}

}

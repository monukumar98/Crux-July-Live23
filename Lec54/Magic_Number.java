package Lec54;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(Nth_Magic_Number(n));

	}

	public static int Nth_Magic_Number(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
//			int rem = n % 2;
//			ans = ans + rem * mul;
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			mul *= 5;
			n >>= 1;
		}
		return ans;

	}

}

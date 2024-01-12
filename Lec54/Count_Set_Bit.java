package Lec54;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 75;
		System.out.println(CountSetBit(n));
		System.out.println(FastCountSetBit(n));
	}

	public static int FastCountSetBit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		return c;
	}

	public static int CountSetBit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;// n = n>>1;
		}
		return c;
	}

}

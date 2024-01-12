package Lec54;

public class Check_ith_Bit_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 75;
		int i = 3;
		int mask = 1 << i;
		if ((n & mask) != 0) {
			System.out.println("Set hai ");
		} else {
			System.out.println("Set nhi hai ");
		}

	}

}

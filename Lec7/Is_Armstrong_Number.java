package Lec7;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_ArmstrongNumber(n));
	}

	public static boolean Is_ArmstrongNumber(int n) {
		int c = countofdigit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;

		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}

	}

	public static int countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}

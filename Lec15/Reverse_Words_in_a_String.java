package Lec15;

import java.util.Scanner;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// String s = sc.nextLine();
		// System.out.println(s);
		String s = "     the sky is   blue     ";
		System.out.println(Reverse_Words(s));

	}

	public static String Reverse_Words(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}

		return ans.trim();

	}

}

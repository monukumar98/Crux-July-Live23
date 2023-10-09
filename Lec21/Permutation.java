package Lec21;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		 PrintPermuatation(ques, "");
		//System.out.println(CountPermuatation(ques, ""));

	}

	public static void PrintPermuatation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			PrintPermuatation(s1 + s2, ans + ch);
		}

	}

	public static int CountPermuatation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			count += CountPermuatation(s1 + s2, ans + ch);
		}
		return count;

	}

}

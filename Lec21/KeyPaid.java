package Lec21;

import java.util.*;

public class KeyPaid {
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		Combinations(ques, "", ll);
		System.out.println(ll);
	}

	public static void Combinations(String ques, String ans, List<String> ll) {
		if (ques.length() == 0) {
//			System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);
		int num = ch - '0';
		String press = map[num];
		for (int i = 0; i < press.length(); i++) {
			Combinations(ques.substring(1), ans + press.charAt(i), ll);
		}

	}
}

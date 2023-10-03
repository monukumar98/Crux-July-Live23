package Lec19;

public class SubSqunce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		//PrintSubSeq(ques, "");
		// System.out.println(count);
		System.out.println(CountSubSeqnce(ques, ""));

	}

	// static int count = 0;
	public static void PrintSubSeq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			// count++;
			return;
		}
		char ch = ques.charAt(0);
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans + ch);

	}

	public static int CountSubSeqnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			// count++;
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 = CountSubSeqnce(ques.substring(1), ans);
		int a2 = CountSubSeqnce(ques.substring(1), ans + ch);
		return a1+a2;

	}
}

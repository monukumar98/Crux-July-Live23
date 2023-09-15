package Lec15;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "hello";
		String s3 = new String("hello");
//		System.out.println(s2 == s3);
//		System.out.println(s2.charAt(1));
//		System.out.println(s2.equals(s3));
		System.out.println(eqauls(s2, s3));
	}
	public static boolean eqauls(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}

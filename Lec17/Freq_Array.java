package Lec17;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dsfghjkfdaafsdhgfasdewrtyuioipsdfghjklzxcvbnm";
		int[] frq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			frq[ch - 'a']++;// frq[ch - 'a']= frq[ch - 'a']+1;

		}
		for (int i = 0; i < frq.length; i++) {
			System.out.print(frq[i] + " ");
		}

	}

}

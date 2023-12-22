package Lec45;

public class StringBulider_Vs_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Demo();
		 //StringBulider_Demo();

	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s += i;
		}
		//System.out.println(s);
	}

	public static void StringBulider_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		//System.out.println(sb);
	}

}

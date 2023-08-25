package Lec7;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 7;
		int b = 11;
		System.out.println(val);//
		System.out.println(Add(a, b));
		System.out.println(val);//

	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val = 60;
		Fun_Demo_3.val = Fun_Demo_3.val + 5;
		return c - Sub(c, b);

	}

	public static int Sub(int a, int b) {

		int c = a - b;
		return c;
	}

}

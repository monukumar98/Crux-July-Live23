package Lec16;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 91;
		System.out.println(a);
		System.out.println(a1);
		// auto-boxing
		a1 = a;
		int b = 11;
		Integer b1 = 189;
		// un-boxing
		b = b1;

		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
	}

}

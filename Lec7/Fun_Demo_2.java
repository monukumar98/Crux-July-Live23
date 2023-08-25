package Lec7;

public class Fun_Demo_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
//		int ans = Add();
//		System.out.println(ans);
		System.out.println(Add());
	}
	public static int Add() {
		int a = 8;
		int b = 7;
		int c = a + b - Sub();
		return c;

	}
	public static int Sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		return c;

	}
}

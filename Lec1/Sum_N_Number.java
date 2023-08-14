package Lec1;

public class Sum_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;// sum +=i;
			i = i + 1;//i++;
		}
		System.out.println(sum);
	}

}

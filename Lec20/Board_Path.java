package Lec20;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Printans(n, 0, "");

	}

// curr--> Currently me kahan pe hu 
// ending Goal --> n	
	public static void Printans(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= 3; dice++) {
			Printans(n, curr + dice, ans + dice);
		}
//		Printans(n, curr + 1, ans + 1);
//		Printans(n, curr + 2, ans + 2);
//		Printans(n, curr + 3, ans + 3);

	}

}

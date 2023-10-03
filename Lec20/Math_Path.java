package Lec20;

public class Math_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;// row
		int n = 3;// col
		PrintPath(0, 0, n - 1, m - 1, "");

	}
// cc --> curr col
// cr--> curr row
// ec --> end col
// er --> end row

	public static void PrintPath(int cc, int cr, int ec, int er, String ans) {
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
		PrintPath(cc + 1, cr, ec, er, ans + "H");
		PrintPath(cc, cr + 1, ec, er, ans + "V");
	}

}

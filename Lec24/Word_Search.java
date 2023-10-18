package Lec24;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean ans = Search(board, i, j, word, 0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}

				}

			}
		}
		System.out.println(false);
	}

	public static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
		// TODO Auto-generated method stub
		if (idx == word.length()) {
			return true;
		}
		if (cc < 0 || cr < 0 || cc >= board[0].length || cr >= board.length || word.charAt(idx) != board[cr][cc]) {
			return false;
		}
		board[cr][cc] = '*';
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int k = 0; k < c.length; k++) {
			boolean ans = Search(board, cr + r[k], cc + c[k], word, idx + 1);
			if (ans == true) {
				return true;
			}
		}
		board[cr][cc] = word.charAt(idx);
		return false;
	}

}

package Lec12;

public class Time_and_Sapce_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//
//		System.out.println(end - start);
//		
		int n = 10000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}

		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
			// O(Log N) base 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// O(Log N) base 2;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(Log N) base 6;
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(Log N) base 6;
			n /= 2;
			n /= 3;
		}
		int k = 3;
		while (i <= n) {
			System.out.println("Hey");
			// O(N/k)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(Log N) base k;
			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}

		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(Sqrt(N))
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					// O(N^4)
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// O(Log N) base 2;
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// O(N^2 log(N))
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
				// O(N log(N))
			}
		}

		// bubble
		// Selection
		// Insertion

	}

}

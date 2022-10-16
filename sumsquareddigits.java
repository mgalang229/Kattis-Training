import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/sumsquareddigits

public class sumsquareddigits {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tt = 1; tt <= T; tt++) {
			int k = fs.nextInt(), b = fs.nextInt(), n = fs.nextInt();
			int ans = 0;
			while (n > 0) {
				ans += (n % b) * (n % b);
				n /= b;
			}
			System.out.println(k + " " + ans);
		}
		fs.close();
	}
}

import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/lastfactorialdigit

public class lastfactorialdigit {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int prod = 1;
			for (int i = 0; i < n; i++) {
				prod *= (i + 1);
			}
			System.out.println(prod % 10);
		}
		fs.close();
	}
}

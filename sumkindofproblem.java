import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/sumkindofproblem

public class sumkindofproblem {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int k = fs.nextInt(), n = fs.nextInt();
			int normalSum = n * (n + 1) / 2;
			int copy = n;
			int oddSum = 0;
			for (int i = 1; i <= 20_000; i += 2) {
				if (copy > 0) {
					oddSum += i;
					copy--;
				}
			}
			copy = n;
			int evenSum = 0;
			for (int i = 2; i <= 20_000; i += 2) {
				if (copy > 0) {
					evenSum += i;
					copy--;
				}
			}
			System.out.println(k + " " + normalSum + " " + oddSum + " " + evenSum);
		}
		fs.close();
	}
}


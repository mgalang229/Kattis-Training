import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/freefood

public class freefood {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] freq = new int[366];
			Arrays.fill(freq, 0);
			for (int i = 0; i < n; i++) {
				int s = fs.nextInt(), t = fs.nextInt();
				for (int day = s; day <= t; day++) {
					freq[day]++;
				}
			}
			int count = 0;
			for (int day = 1; day <= 365; day++) {
				if (freq[day] > 0) {
					count++;
				}
			}
			System.out.println(count);
		}
		fs.close();
	}
}

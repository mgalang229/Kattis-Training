import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/parking2

public class parking2 {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			Arrays.sort(a);
			int ans = 0;
			for (int i = 1; i < n; i++) {
				ans += Math.abs(a[i] - a[i-1]);
			}
                        //return back to the parking slot (beginnning)
			System.out.println(ans * 2);
		}
		fs.close();
	}
}

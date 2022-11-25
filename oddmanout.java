import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/oddmanout

public class oddmanout {
	
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
			boolean[] visited = new boolean[n];
			Arrays.fill(visited, false);
			for (int i = 1; i < n; i++) {
				if (a[i] == a[i-1]) {
					visited[i] = visited[i-1] = true;
				}
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					ans = a[i];
				}
			}
			System.out.println("Case #" + tc + ": " + ans);
		}
		fs.close();
	}
}

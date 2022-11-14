import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/coffeecupcombo

public class coffeecupcombo {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		char[] s = fs.next().toCharArray();
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		for (int i = 0; i < n; i++) {
			if (s[i] == '1') {
				visited[i] = true;
				if (i + 1 < n) {
					visited[i+1] = true;
				}
				if (i + 2 < n) {
					visited[i+2] = true;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) { 
			if (visited[i]) {
				ans++;
			}
		}
		System.out.println(ans);
		fs.close();
	}
}


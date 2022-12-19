import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/missingnumbers

public class missingnumbers {
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int[] a = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) { 
			a[i] = fs.nextInt();
			max = Math.max(max, a[i]);
		}
		boolean[] visited = new boolean[max+1];
		Arrays.fill(visited, false);
		for (int i = 0; i < n; i++) {
			visited[a[i]] = true;
		}
		boolean cleared = true;
		for (int i = 1; i <= max; i++) {
			if (!visited[i]) {
				System.out.println(i);
				cleared = false;
			}
		}
		if (cleared) {
			System.out.println("good job");
		}
		fs.close();
	}
}

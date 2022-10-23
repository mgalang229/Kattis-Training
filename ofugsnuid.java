import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/ofugsnuid

public class ofugsnuid {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		fs.close();
	}
}

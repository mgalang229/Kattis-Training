import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/bijele

public class bijele {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = fs.nextInt();
		}
		int[] pattern = new int[] {1, 1, 2, 2, 2, 8};
		for (int i = 0; i < 6; i++) {
			if (a[i] > pattern[i]) {
				System.out.print("-");
			}
			System.out.print(Math.abs(a[i] - pattern[i]) + " ");
		}
		System.out.println();
		fs.close();
	}
}

import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/tri

public class tri {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = 3;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		boolean found = false;
		if (a[0] + a[1] == a[2]) {
			printAnswer(a[0], a[1], a[2], '+', '=');
		} else if (a[0] - a[1] == a[2]) {
			printAnswer(a[0], a[1], a[2], '-', '=');
		} else if (a[0] * a[1] == a[2]) {
			printAnswer(a[0], a[1], a[2], '*', '=');
		} else if (a[0] / a[1] == a[2]) {
			printAnswer(a[0], a[1], a[2], '/', '=');
		} else if (a[0] == a[1] + a[2]) {
			printAnswer(a[0], a[1], a[2], '=', '+');
		} else if (a[0] == a[1] - a[2]) {
			printAnswer(a[0], a[1], a[2], '=', '-');
		} else if (a[0] == a[1] * a[2]) {
			printAnswer(a[0], a[1], a[2], '=', '*');
		} else if (a[0] == a[1] / a[2]) {
			printAnswer(a[0], a[1], a[2], '=', '/');
		} 
		fs.close();
	}
	
	static void printAnswer(int x, int y, int z, char op1, char op2) {
		System.out.println(x + String.valueOf(op1) + y + String.valueOf(op2) + z);
	}
}

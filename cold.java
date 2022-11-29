import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/cold

public class cold {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				counter++;
			}
		}
		System.out.println(counter);
		fs.close();
	}
}

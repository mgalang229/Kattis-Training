import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/relocation

public class relocation {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt(), q = fs.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		for (int i = 0; i < q; i++) {
			int type = fs.nextInt();
			if (type == 1) {
				int c = fs.nextInt(), x = fs.nextInt();
				a[c-1] = x;
			} else {
				int firstComp = fs.nextInt(), secondComp = fs.nextInt();
				System.out.println(Math.abs(a[firstComp-1] - a[secondComp-1]));
			}
		}
		fs.close();
	}
}

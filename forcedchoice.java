import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/forcedchoice

public class forcedchoice {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int temp = fs.nextInt(), num = fs.nextInt(), q = fs.nextInt();
		for (int i = 0; i < q; i++) {
			int n = fs.nextInt();
			boolean keep = false;
			for (int j = 0; j < n; j++) {
				int x = fs.nextInt();
				if (x == num) {
					keep = true;
				}
			}
			System.out.println(keep ? "KEEP" : "REMOVE");
		}
		fs.close();
	}
}

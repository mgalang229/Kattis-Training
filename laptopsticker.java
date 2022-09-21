import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/laptopsticker

public class laptopsticker {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt(), d = fs.nextInt();
		System.out.println(a - c > 1 && b - d > 1 ? 1 : 0);
		fs.close();
	}
}

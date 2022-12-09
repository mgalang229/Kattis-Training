import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/whichisgreater

public class whichisgreater {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int a = fs.nextInt(), b = fs.nextInt();
		System.out.println((a > b) ? 1 : 0);
		fs.close();
	}
}

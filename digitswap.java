import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/digitswap

public class digitswap {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int newNum = 0;
		while (n > 0) {
			newNum = newNum * 10 + (n % 10);
			n /= 10;
		}
		System.out.println(newNum);
		fs.close();
	}
}

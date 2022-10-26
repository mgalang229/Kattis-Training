import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/knightpacking

public class knightpacking {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		System.out.println(n % 2 == 1 ? "first" : "second");
		fs.close();
	}
}


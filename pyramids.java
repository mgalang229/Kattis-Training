import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/pyramids

public class pyramids {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		long currentSum = 0;
		int count = 0;
		for (int i = 1; i * i <= 100_000_000; i += 2) {
			currentSum += i * i;
			if (currentSum > n) {
				break;
			}
			count++;
		}
		System.out.println(count);
		fs.close();
	}
}

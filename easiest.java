import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/easiest

public class easiest {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		while (fs.hasNextInt()) {
			int n = fs.nextInt();
			if (n == 0) {
				continue;
			}
			int num = 11;
			while (true) {
				if (sameDigitSum(num * n, n)) {
					break;
				}
				num++;
			}
			System.out.println(num);
		}
		fs.close();
	}
	
	static boolean sameDigitSum(int num, int n) {
		return getSumDigits(num) == getSumDigits(n);
	}
	
	static int getSumDigits(int n) {
		int copy = n;
		int sum = 0;
		while (copy > 0) {
			sum += (copy % 10);
			copy /= 10;
		}
		return sum;
	}
}


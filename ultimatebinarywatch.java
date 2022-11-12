import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/ultimatebinarywatch

public class ultimatebinarywatch {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int n = 4, m = 9;
		char[][] watch = new char[n][m];
		int[] skip = new int[] {2, 4, 5, 6, 8};
		for (int i = 0; i < n; i++) {
			Arrays.fill(watch[i], '.');
			for (int j = 0; j < m; j++) {
				if (checkSkip(j + 1, skip)) {
					watch[i][j] = ' ';
				}
			}
		}
		int index = 0;
		for (int j = 0; j < m; j++) {
			if (checkSkip(j + 1, skip)) {
				continue;
			}
			int curDigit = s[index] - '0';
			int bit = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (hasBit(curDigit, bit)) {
					watch[i][j] = '*';
				}
				bit++;
			}
			index++;
		}
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < m; j++) {
				System.out.print(watch[i][j]);
			}
			System.out.println();
		}
		fs.close();
	}
	
	static boolean hasBit(int val, int bit) {
		return (val & (1 << bit)) != 0;
	}
	
	static boolean checkSkip(int val, int[] skip) {
		for (int i = 0; i < skip.length; i++) { 
			if (val == skip[i]) {
				return true;
			}
		}
		return false;
	}
}


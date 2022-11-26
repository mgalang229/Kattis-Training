import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/lineup

public class lineup {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		char[][] s = new char[n][];
		for (int i = 0; i < n; i++) {
			s[i] = fs.next().toCharArray();
		}
		boolean increasing = true, decreasing = true;
		for (int i = 1; i < n; i++) {
			if (isLexicogSmaller(s[i], s[i-1])) {
				increasing = false;
			}
			if (!isLexicogSmaller(s[i], s[i-1])) {
				decreasing = false;
			}
		}
		if (increasing) {
			System.out.println("INCREASING");
		} else if (decreasing) {
			System.out.println("DECREASING");
		} else {
			System.out.println("NEITHER");
		}
		fs.close();
	}
	
	static boolean isLexicogSmaller(char[] s1, char[] s2) {
		int n = s1.length, m = s2.length;
		for (int i = 0; i < (int) Math.min(n, m); i++) {
			if (s1[i] < s2[i]) {
				return true;
			} else if (s1[i] > s2[i]) {
				return false;
			}
		}
		return n <= m;
	}
}

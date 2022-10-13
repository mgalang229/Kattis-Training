import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/alphabetspam

public class alphabetspam {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		double whitespace = 0, lower = 0, upper = 0, symbol = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '_') {
				whitespace++;
			} else if (isLowerCase(s[i])) {
				lower++;
			} else if (isUpperCase(s[i])) {
				upper++;
			} else {
				symbol++;
			}
		}
		double whiteRatio = whitespace / s.length;
		double lowerRatio = lower / s.length;
		double upperRatio = upper / s.length;
		double symbolRatio = symbol / s.length; 
		System.out.printf("%.16f\n", whiteRatio);
		System.out.printf("%.16f\n", lowerRatio);
		System.out.printf("%.16f\n", upperRatio);
		System.out.printf("%.16f\n", symbolRatio);
		fs.close();
	}
	
	static boolean isLowerCase(char ch) {
		return 'a' <= ch && ch <= 'z';
	}
	
	static boolean isUpperCase(char ch) {
		return 'A' <= ch && ch <= 'Z';
	}
}

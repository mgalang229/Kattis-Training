import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/eyeofsauron

public class eyeofsauron {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int bar = 0;
		boolean crossed = false;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '(') {
				crossed = true;
			} else if (s[i] == '|') {
				if (!crossed) {
					bar++;
				} else {
					bar--;
				}
			}
		}
		System.out.println(bar == 0  ? "correct" : "fix");
		fs.close();
	}
}

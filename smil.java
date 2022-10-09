import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/smil

public class smil {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int n = s.length;
		boolean found = false;
		for (int i = 0; i < n; i++) {
			found = false;
			if (i + 1 < n) {
				if ((s[i] == ':' || s[i] == ';') && s[i+1] == ')') {
					found = true;
				}
			}
			if (i + 2 < n) {
				if ((s[i] == ':' || s[i] == ';') && s[i+1] == '-' && s[i+2] == ')') {
					found = true;
				}
			}
			if (found) {
				System.out.println(i);
			}
		}
		fs.close();
	}
}

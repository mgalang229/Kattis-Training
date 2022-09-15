import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/autori

public class autori {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		String acro = s[0] + "";
		for (int i = 1; i < s.length; i++) {
			if (s[i-1] == '-') {
				acro += s[i];
			}
		}
		System.out.println(acro);
		fs.close();
	}
}

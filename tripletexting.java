import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/tripletexting

public class tripletexting {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int n = s.length;
		String message1 = "";
		for (int i = 0; i < n / 3; i++) {
			message1 += s[i];
		}
		String message2 = "";
		for (int i = n / 3; i < n / 3 * 2; i++) {
			message2 += s[i];
		}
		String message3 = "";
		for (int i = n / 3 * 2; i < n; i++) {
			message3 += s[i];
		}
		String ans = "";
		if (message1.equals(message2) || message1.equals(message3)) {
			ans = message1;
		} else {
			ans = message2;
		}
		System.out.println(ans);
		fs.close();
	}
}

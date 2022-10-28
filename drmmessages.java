import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/drmmessages

public class drmmessages {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int n = s.length;
		int sum = 0;
		for (int i = 0; i < n / 2; i++) {
			sum += (s[i] - 'A');
		}
		for (int i = 0; i < n / 2; i++) {
			s[i] = (char) ('A' + ((sum + (s[i] - 'A')) % 26));
		}
		sum = 0;
		for (int i = n / 2; i < n; i++) {
			sum += (s[i] - 'A');
		}
		for (int i = n / 2; i < n; i++) {
			s[i] = (char) ('A' + ((sum + (s[i] - 'A')) % 26));
		}
		for (int i = 0; i < n / 2; i++) {
			System.out.print((char) ('A' + (((s[n/2+i] - 'A') + (s[i] - 'A')) % 26)));
		}
		System.out.println();
		fs.close();
	}
}

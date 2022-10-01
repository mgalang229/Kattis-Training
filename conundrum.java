import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/conundrum

public class conundrum {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		char[] per = new char[] {'P', 'E', 'R'};
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != per[i%3]) {
				ans++;
			}
		}
		System.out.println(ans);
		fs.close();
	}
}

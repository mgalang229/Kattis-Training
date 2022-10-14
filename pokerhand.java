import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/pokerhand

public class pokerhand {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = "A23456789TJQK".toCharArray();
		int[] freq = new int[s.length];
		Arrays.fill(freq, 0);
		int max = 0;
		for (int i = 0; i < 5; i++) {
			char[] cards = fs.next().toCharArray();
			for (int j = 0; j < s.length; j++) {
				if (cards[0] == s[j] || cards[1] == s[j]) {
					freq[j]++;
					max = Math.max(max, freq[j]);
				}
			}
		}
		System.out.println(max);
		fs.close();
	}
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Problem Link: https://open.kattis.com/problems/sevenwonders

public class sevenwonders {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int[] freq = new int[3];
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'T') {
				freq[0]++;
			} else if (s[i] == 'C') {
				freq[1]++;
			} else {
				freq[2]++;
			}
		}
		int ans = 0;
		for (int j = 0; j < 3; j++) {
			ans += freq[j] * freq[j];
		}
		ans += 7 * Math.min(freq[0], Math.min(freq[1], freq[2]));
		System.out.println(ans);
		fs.close();
	}
	
	static final Random rnd = new Random();
	
	static void shuffleSort(char[] a) { //change this
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int newInd = rnd.nextInt(n);
			char temp = a[newInd]; //change this
			a[newInd] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
}

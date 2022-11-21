import java.util.Scanner;
import java.util.TreeSet;

// Problem link: https://open.kattis.com/problems/ptice

public class ptice {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		char[] s = fs.next().toCharArray();
		String adrian = "";
		for (int i = 0; i < n; i++) {
			adrian += (char) ((char) 'A' + (i % 3));
		}
		char[] brunoPattern = {'B', 'A', 'B', 'C'};
		String bruno = "";
		for (int i = 0; i < n; i++) {
			bruno += brunoPattern[i%4];
		}
		char[] goranPattern = {'C', 'C', 'A', 'A', 'B', 'B'};
		String goran = "";
		for (int i = 0; i < n; i++) {
			goran += goranPattern[i%6];
		}
		String[] patterns = {adrian, bruno, goran};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < patterns.length; i++) {
			int counter = 0;
			for (int j = 0; j < n; j++) {
				if (s[j] == patterns[i].charAt(j)) {
					counter++;
				}
			}
			max = Math.max(max, counter);
		}
		String[] names = {"Adrian", "Bruno", "Goran"};
		TreeSet<String> ts = new TreeSet<>();
		for (int i = 0; i < patterns.length; i++) {
			int counter = 0;
			for (int j = 0; j < n; j++) {
				if (s[j] == patterns[i].charAt(j)) {
					counter++;
				}
			}
			if (counter == max) {
				ts.add(names[i]);
			}
		}
		System.out.println(max);
		for (String ss : ts) {
			System.out.println(ss);
		}
		fs.close();
	}
}

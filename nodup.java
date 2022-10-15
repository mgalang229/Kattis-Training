import java.util.HashSet;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/nodup

public class nodup {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.nextLine().toCharArray();
		HashSet<String> words = new HashSet<>();
		String curWord = "";
		boolean duplicate = false;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				if (words.contains(curWord)) {
					duplicate = true;
					break;
				}
				words.add(curWord);
				curWord = "";
			} else {
				curWord += s[i];
			}
		}
		if (words.contains(curWord)) {
			duplicate = true;
		}
		System.out.println(!duplicate ? "yes" : "no");
		fs.close();
	}
}

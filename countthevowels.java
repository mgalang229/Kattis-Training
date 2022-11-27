import java.util.Scanner;

// Link: https://open.kattis.com/problems/countthevowels

public class countthevowels {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.nextLine().toCharArray();
		int vowel = 0;
		for (int i = 0; i < s.length; i++) {
			if (isVowel(s[i])) {
				vowel++;
			}
		}
		System.out.println(vowel);
		fs.close();
	}
	
	static boolean isVowel(char c) {
		String vowels = "AEIOU";
		if (vowels.contains(String.valueOf(c))) {
			return true;
		}
		if (vowels.toLowerCase().contains(String.valueOf(c))) {
			return true;
		}
		return false;
	}
}

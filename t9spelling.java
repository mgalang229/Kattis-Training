import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/t9spelling

public class t9spelling {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		fs.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			char[] s = fs.nextLine().toCharArray();
			int n = s.length;
			char[][] keypad = {
				"abc".toCharArray(), "def".toCharArray(),
				"ghi".toCharArray(), "jkl".toCharArray(),
				"mno".toCharArray(), "pqrs".toCharArray(),
				"tuv".toCharArray(), "wxyz".toCharArray()
			};
			System.out.print("Case #" + tc + ": ");
			//if same group, put a space
			int prevGroup = 0;
			for (int i = 0; i < n; i++) {
				if (s[i] == ' ') {
					if (i - 1 >= 0 && s[i-1] == ' ') {
						System.out.print(" ");
					}
					System.out.print("0");
					prevGroup = 0;
					continue;
				}
				int rep = 0;
				int group = 0;
				outer: for (int j = 0; j < keypad.length; j++) {
					for (int k = 0; k < keypad[j].length; k++) {
						if (keypad[j][k] == s[i]) {
							group = j + 2;
							rep = k + 1;
							break outer;
						}
					}
				}
				if (group == prevGroup) {
					System.out.print(" ");
				}
				for (int r = 0; r < rep; r++) {
					System.out.print(group);
				}
				prevGroup = group;
			}
			System.out.println();
		}
		fs.close();
	}
}


import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/fiftyshades

public class fiftyshades {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int counter = 0;
		outer: for (int q = 1; q <= n; q++) {
			char[] s = fs.next().toCharArray();
			for (int i = 0; i < s.length; i++) {
				if (i + 3 < s.length && exists(s, i, i + 3)) {
					counter++;
					continue outer;
				}
			}
		}
		if (counter > 0) {
			System.out.println(counter);
		} else {
			System.out.println("I must watch Star Wars with my daughter");
		}
		fs.close();
	}
	
	static boolean exists(char[] s, int start, int end) {
		String str = "";
		for (int i = start; i <= end; i++) {
			str += s[i];
		}
		return str.equalsIgnoreCase("pink") || str.equalsIgnoreCase("rose");
	}
}

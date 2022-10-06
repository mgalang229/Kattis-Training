import java.util.Arrays;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/heimavinna

public class heimavinna {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int ans = 0;
		boolean[] visited = new boolean[s.length];
		Arrays.fill(visited, false);
		for (int i = 0; i < s.length; i++) {
			if (visited[i]) {
				continue;
			}
			if (s[i] != '-' && s[i] != ';') {
				int index = i;
				String startText = "", endText = "";
				int flag = 0;
				while (index < s.length && s[index] != ';') {
					if (s[index] == '-') {
						flag = 1;
					} else {
						if (flag == 0) {
							startText += s[index];
						} else {
							endText += s[index];
						}
					}
					visited[index] = true;
					index++;
				}
				char[] startTextArr = startText.toCharArray();
				int start = 0;
				for (int j = 0; j < startTextArr.length; j++) {
					start = start * 10 + (startTextArr[j] - '0');
				}
				char[] endTextArr = endText.toCharArray();
				int end = 0;
				for (int j = 0; j < endTextArr.length; j++) {
					end = end * 10 + (endTextArr[j] - '0');
				}
				if (end == 0) {
					ans++;
				} else {
					ans += (end - start + 1);
				}
			}
		}
		System.out.println(ans);
		fs.close();
	}
}

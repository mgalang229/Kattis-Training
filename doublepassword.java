import java.util.Scanner;

/*

Problem link: https://open.kattis.com/problems/doublepassword

1111
1234

1
1, 2
1, 3
1, 4

1111
1211
1131
1114
1231
1234
1134
1214

= distinct 4-digit sequences

2718
2718

2
7
1
8

 */

public class doublepassword {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s1 = fs.next().toCharArray();
		char[] s2 = fs.next().toCharArray();
		int ans = 1;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != s2[i]) {
				ans *= 2;
			}
		}
		System.out.println(ans);
		fs.close();
	}
}

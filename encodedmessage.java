import java.util.Scanner;

/*

Problem link: https://open.kattis.com/problems/encodedmessage

RST
EEO
TCP

eedAR
BtVro
lsies
uAoRe
erles

 */

public class encodedmessage.java {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tt = 1; tt <= T; tt++) {
			char[] s = fs.next().toCharArray();
			int n = (int) Math.sqrt(s.length);
			char[][] message = new char[n][n];
			int row = 0, col = 0;
			for (int i = 0; i < s.length; i++) {
				message[row][col] = s[i];
				if (col == n - 1) {
					row++;
					col = 0;
				} else {
					col++;
				}
			}
			String decodedMessage = "";
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 0; j < n; j++) {
					decodedMessage += message[j][i];
				}
			}
			System.out.println(decodedMessage);
		}
		fs.close();
	}
}

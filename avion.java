import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/avion

public class avion {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int q = 5;
		boolean escaped = true;
		for (int qry = 0; qry < q; qry++) {
			char[] s = fs.next().toCharArray();
			int n = s.length;
			boolean checker = false;
			for (int i = 0; i < n; i++) {
				if (i + 2 < n && s[i] == 'F' && s[i+1] == 'B' && s[i+2] == 'I') {
					checker = true;
					break;
				}
			}
			if (checker) {
				escaped = false;
				System.out.print((qry+1) + " ");
			}
		}
		System.out.println(escaped ? "HE GOT AWAY!" : "");
		fs.close();
	}
}


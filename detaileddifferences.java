import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/detaileddifferences

public class detaileddifferences {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tt = 1; tt <= T; tt++) {
			char[] first = fs.next().toCharArray();
			char[] second = fs.next().toCharArray();
			System.out.println(String.valueOf(first));
			System.out.println(String.valueOf(second));
			for (int i = 0; i < first.length; i++) {
				if (first[i] != second[i]) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println("\n");
		}
		fs.close();
	}
}

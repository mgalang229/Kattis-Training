import java.util.Scanner;

/*

Problem link: https://open.kattis.com/problems/chanukah

day = 1 2 3 4 5 6 7 8

 */

public class chanukah {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int p = fs.nextInt();
		for (int pp = 1; pp <= p; pp++) {
			int k = fs.nextInt(), n = fs.nextInt();
			System.out.println(k + " " + (n * (n + 1) / 2 + n));
		}
		fs.close();
	}
}

import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/skruop

public class skruop {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int val = 7;
		fs.nextLine();
		for (int i = 0; i < n; i++) {
			String s = fs.nextLine();
			if (s.equals("Skru op!")) {
				if (val < 10) {
					val++;
				}
			} else if (val > 0) {
				val--;
			}
		}
		System.out.println(val);
		fs.close();
	}
}


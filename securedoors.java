import java.util.HashSet;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/securedoors

public class securedoors {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		fs.nextLine();
		HashSet<String> st = new HashSet<>();
		for (int i = 0; i < n; i++) {
			char[] log = fs.nextLine().toCharArray();
			String temp = "", firstParam = "";
			for (int j = 0; j < log.length; j++) {
				if (firstParam.equals("") && log[j] == ' ') {
					firstParam = temp;
					temp = "";
				} else {
					temp += log[j];
				}
			}
			String secondParam = temp;
			if (firstParam.equals("entry")) {
				System.out.print(secondParam + " entered ");
				if (!st.contains(secondParam)) {
					st.add(secondParam);
					System.out.println();
				} else {
					System.out.println("(ANOMALY)");
				}
			} else {
				System.out.print(secondParam + " exited ");
				if (st.contains(secondParam)) {
					st.remove(secondParam);
					System.out.println();
				} else {
					System.out.println("(ANOMALY)");
				}
			}
		}
		fs.close();
	}
}

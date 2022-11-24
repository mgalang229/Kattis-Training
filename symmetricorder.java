
import java.util.Scanner;

/*

Problem link: https://open.kattis.com/problems/symmetricorder

1	7	2	6		3		5		4
Bo Pat Jean Kevin Claude William Marybeth

 */

public class symmetricorder {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int set = 1;
		while (fs.hasNextInt()) {
			int n = fs.nextInt();
			if (n == 0) {
				break;
			}
			String[] names = new String[n];
			for (int i = 0; i < n; i++) {
				names[i] = fs.next();
			}
			int[] newInd = new int[n];
			int startInd = 0, endInd = n - 1;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					newInd[i] = startInd;
					startInd++;
				} else {
					newInd[i] = endInd;
					endInd--;
				}
			}
			String[] newNames = new String[n];
			for (int i = 0; i < n; i++) {
				newNames[newInd[i]] = names[i];
			}
			System.out.println("SET " + set);
			for (String name : newNames) {
				System.out.println(name);
			}
			set++;
		}
		fs.close();
	}
}

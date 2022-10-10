import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/reversebinary

public class reversebinary {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		while (n > 0) {
			arr.add(n % 2);
			n /= 2;
		}
		Collections.reverse(arr);
		int ans = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 1) {
				ans += (1 << i);
			}
		}
		System.out.println(ans);
		fs.close();
	}
}

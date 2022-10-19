import java.util.HashSet;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/modulo

public class modulo {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		HashSet<Integer> st = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int n = fs.nextInt();
			st.add(n % 42);
		}
		System.out.println(st.size());
		fs.close();
	}
}

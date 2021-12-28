import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader in = new FastReader();
		String s = in.next();
		int cnt = 0;
		for (int i = 0; i < (int) s.length(); i++) {
			if (s.charAt(i) == 'e') {
				cnt++;
			}
		}
		String ans = Character.toString(s.charAt(0));
		for (int i = 0; i < 2 * cnt; i++) {
			ans += "e";
		}
		ans += s.charAt((int) s.length() - 1);
		System.out.println(ans);
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}

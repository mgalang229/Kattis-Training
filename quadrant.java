import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader in = new FastReader();
		int x = in.nextInt();
		int y = in.nextInt();
		int ans = 1;
		if (x < 0 && y > 0) {
			ans = 2;
		} else if (x < 0 && y < 0) {
			ans = 3;
		} else if (x > 0 && y < 0) {
			ans = 4;
		}
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

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader in = new FastReader();
		int[] a = new int[5];
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				int x = in.nextInt();
				sum += x;
			}
			a[i] = sum;
			mx = Math.max(mx, sum);
		}
		for (int i = 0; i < 5; i++) {
			if (a[i] == mx) {
				System.out.println((i + 1) + " " + a[i]);
				break;
			}
		}
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

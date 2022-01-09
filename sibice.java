import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
        	a[i] = in.nextInt();
        }
        int diagonal = (int) Math.sqrt((w * w) + (h * h));
        for (int i = 0; i < n; i++) {
        	System.out.println((a[i] <= diagonal ? "DA" : "NE"));
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

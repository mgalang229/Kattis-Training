import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int h = in.nextInt();
        int v = in.nextInt();
        // choose the formed rectangle/square that has the longer sides:
        int x = Math.max(n - h, h);
        int y = Math.max(n - v, v);
        System.out.println(x * y * 4);
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

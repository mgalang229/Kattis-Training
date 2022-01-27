import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int tt = in.nextInt();
        for (int qq = 1; qq <= tt; qq++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	int c = in.nextInt();
        	// one of the conditions below must be satisfied:
        	// 1. a + b = c
        	// 2. a - b = c or b - a = c
        	// 3. a * b = c
        	// 4. a / b = c or b / a = c
        	boolean checker = false;
        	checker |= (a + b == c);
        	checker |= (Math.abs(a - b) == c);
        	checker |= (a * b == c);
        	checker |= (a == b * c || b == a * c);
        	System.out.println(checker ? "Possible" : "Impossible");
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

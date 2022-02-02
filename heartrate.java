import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        for (int qq = 1; qq <= n; qq++) {
        	double b = in.nextDouble();
        	double p = in.nextDouble();
        	double min_apbm = (60 * (b - 1)) / p; // minimum APBM -> subtract 1 from b
        	double bpm = (60 * b) / p; // BPM -> follow the formula in the problem statements
        	double max_apbm = (60 * (b + 1)) / p; // maximum APBM -> add 1 to b
        	System.out.printf("%.4f %.4f %.4f\n", min_apbm, bpm, max_apbm);
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

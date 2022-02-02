import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        long n = in.nextLong();
        while (!valid(n)) {
        	n++; // keep incrementing n until it becomes a harshad number
        }
        System.out.println(n);
    }
	
	// this function will check if n is divisible by the sum of its digits
	static boolean valid(long n) {
		long sum = 0;
		long copy_n = n;
		while (copy_n > 0) {
			sum += (copy_n % 10);
			copy_n /= 10;
		}
		return (n % sum == 0);
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

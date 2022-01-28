import java.io.*;
import java.util.*;

public class Main {
	static final int INF = (int) 1e5 + 1;
	
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int L = in.nextInt();
        int D = in.nextInt();
        int X = in.nextInt();
        Pair p = new Pair(INF, -1);
        for (int num = L; num <= D; num++) {
        	if (getSum(num) == X) {
        		p = new Pair(Math.min(p.first, num), Math.max(p.second, num));
        	}
        }
        System.out.println(p.first);
        System.out.println(p.second);
    }
	
	static int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

	static class Pair {
		public int first;
		public int second;
		
		Pair(int first, int second) {
			this.first = first;
			this.second = second;
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

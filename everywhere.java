import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int tt = in.nextInt();
        for (int qq = 1; qq <= tt; qq++) {
        	int n = in.nextInt();
        	String[] a = new String[n];
        	Arrays.fill(a, "");
        	int id = 0;
        	for (int i = 0; i < n; i++) {
        		String city = in.next();
        		if (!findCity(a, n, city)) {
        			a[id] = city;
        			id++;
        		}
        	}
        	System.out.println(id);
        }
    }
	
	static boolean findCity(String[] a, int n, String city) {
		for (int i = 0; i < n; i++) {
			if (a[i].equals(city)) { // use equals() when comparing strings
				return true;
			}
		}
		return false;
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

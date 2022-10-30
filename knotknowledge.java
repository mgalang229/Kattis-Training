import java.util.Scanner;
import java.util.Arrays;

// Problem link: https://open.kattis.com/problems/knotknowledge

public class knotknowledge {
    public static void main(String args[]) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n - 1; i++) {
            int x = fs.nextInt();
            for (int j = 0; j < n; j++) {
                if (x == a[j]) {
                    visited[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println(a[i]);
                break;
            }
        }
        fs.close();
    }
}

import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/cudoviste

public class cudoviste {
    public static void main(String args[]) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt(), m = fs.nextInt();
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = fs.next().toCharArray();
        }
        for (int squash = 0; squash < 5; squash++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (s[i][j] == '#') {
                        continue;
                    }
                    if (i + 1 < n && j + 1 < m) {
                        int curSquash = 0;
                        outer: for (int k = i; k <= i + 1; k++) {
                            for (int l = j; l <= j + 1; l++) {
                                if (s[k][l] == 'X') {
                                    curSquash++;
                                }
                                if (s[k][l] == '#') {
                                    curSquash = -1;
                                    break outer;
                                }
                            }
                        }
                        // System.out.println(curSquash + " , " + squash);
                        if (curSquash == squash) {
                            count++;
                        }
                    }
                }
                // System.out.println();
            }
            System.out.println(count);
        }
        fs.close();
    }
}

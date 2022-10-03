import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/batterup

public class batterup {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int average = 0;
        int numAverage = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if (x >= 0) {
                average += x;
                numAverage++;
            }
        }
        System.out.println((double) average / numAverage);
        scan.close();
    }
}

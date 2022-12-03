import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/jobexpenses

public class jobexpenses {
    public static void main(String args[]) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int expenses = 0;
        for (int i = 0; i < n; i++) {
            int x = fs.nextInt();
            if (x < 0) {
                expenses += Math.abs(x);
            }
        }
        System.out.println(expenses);
        fs.close();
    }
}

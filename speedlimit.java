import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/speedlimit

public class speedlimit {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		while (fs.hasNextInt()) {
			int n = fs.nextInt();
			if (n == -1) {
				break;
			}
			int ans = 0, prev = 0;
			for (int i = 0; i < n; i++) {
				int speed = fs.nextInt(), time = fs.nextInt();
				ans += speed * (time - prev);
				prev = time;
			}	
			System.out.println(ans + " miles");
		}
		fs.close();
	}
}

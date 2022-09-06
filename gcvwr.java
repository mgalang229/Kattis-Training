import java.util.Scanner;

public class gcvwr {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int g = fs.nextInt(), t = fs.nextInt(), n = fs.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += fs.nextInt();
		}
		int rem = (int) ((int) (g - t) * 0.9);
		System.out.println(rem - sum);
		fs.close();
	}
}

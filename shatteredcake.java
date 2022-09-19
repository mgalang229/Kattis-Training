import java.util.Scanner;

public class shatteredcake {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int w = fs.nextInt();
		int n = fs.nextInt();
		int totalArea = 0;
		for (int i = 0; i < n; i++) {
			int l = fs.nextInt();
			int ww = fs.nextInt();
			totalArea += l * ww;
		}
		System.out.println(totalArea / w);
		fs.close();
	}
}

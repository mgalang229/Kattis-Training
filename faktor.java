import java.util.Scanner;

public class faktor {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int articles = fs.nextInt(), impact = fs.nextInt();
		System.out.println((articles*(impact-1)) + 1);
		fs.close();
	}
}

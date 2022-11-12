import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/unlockpattern

public class unlockpattern {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = 3;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = fs.nextInt();
			}
		}
		Point[] points = new Point[9];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				points[a[i][j]-1] = new Point(i, j);
			}
		}
		double ans = 0;
		for (int i = 1; i < 9; i++) {
			ans += getDistance(points[i-1].x, points[i-1].y, points[i].x, points[i].y);
		}
		System.out.printf("%.10f\n", ans);
		fs.close();
	}
	
	static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(getSquare(Math.abs(x2 - x1)) + getSquare(Math.abs(y2 - y1)));
	}
	
	static double getSquare(double x) {
		return x * x;
	}
	
	static class Point {
		double x, y;
		
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}


import java.util.Scanner;

/*

Problem Link: https://open.kattis.com/problems/trik

AB

100
010
001

CBABCACCC

100
001
010
100
100
001
001
100
001
100

A = swap(0, 1)
B = swap(1, 2)
C = swap(0, 2)

 */

public class trik {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.next().toCharArray();
		int[] ind = new int[3];
		ind[0] = 1;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'A') {
				swap(ind, 0, 1);
			} else if (s[i] == 'B') {
				swap(ind, 1, 2);
			} else {
				swap(ind, 0, 2);
			}
		}
		for (int i = 0; i < 3; i++) {
			if (ind[i] == 1) {
				System.out.println((i + 1));
				break;
			}
		}
		fs.close();
	}
	
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}

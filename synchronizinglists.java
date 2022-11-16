import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/synchronizinglists

public class synchronizinglists {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		while (fs.hasNextInt()) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = fs.nextInt();
			}
			int[] copyA = a.clone();
			shuffleSort(copyA);
			shuffleSort(b);
			HashMap<Integer, Integer> mp = new HashMap<>();
			for (int i = 0; i < n; i++) {
				mp.put(copyA[i], b[i]);
			}
			for (int i = 0; i < n; i++) {
				System.out.println(mp.get(a[i]));
			}
			System.out.println();
		}
		fs.close();
	}
	
	static final Random rnd = new Random();
	
	static void shuffleSort(int[] a) { //change this
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int newInd = rnd.nextInt(n);
			int temp = a[newInd]; //change this
			a[newInd] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
}


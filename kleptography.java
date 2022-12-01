import java.util.Scanner;

/*

Problem link: https://open.kattis.com/problems/kleptography

marywasnosyagain
pirpumsemoystoal

p - m = d
i - a = i
r - r = a
p - y = r
u - w = y
m - a = m
s - s = a
e - n = r
m - o = y
o - s = w
y - y = a
s - a = s
t - g = n
o - a = o
a - i = s
l - n = y

 */

public class kleptography {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		char[] plain = fs.next().toCharArray();
		char[] cipher = fs.next().toCharArray();
//		for (int i = 0; i < cipher.length; i++) {
//			System.out.print(cipher[i]+" - "+plain[i]+" = ");
//			char newLetter = '?';
//			if (cipher[i] >= plain[i]) {
//				newLetter = (char) ((char) 'a' + (cipher[i] - plain[i]));
//			} else {
//				int diff = 'z' - plain[i];
//				diff += (cipher[i] - 'a') + 1;
////				System.out.print(diff + " ");
//				newLetter = (char) ((char) 'a' + diff);
//			}
//			System.out.println(newLetter);
//		}
		
		char[] ans = new char[m];
		int index = n - 1;
		for (int i = m - 1; i >= m - n; i--) {
			ans[i] = plain[index];
			index--;
		}
		index = n - 1;
		for (int i = m - 1; i >= 0; i--) {
			if (i - n < 0) {
				break;
			}
			if (cipher[i] >= plain[index]) {
				plain[index] = (char) ((char) 'a' + (cipher[i] - plain[index]));
			} else {
				int diff = 'z' - plain[index];
				diff += (cipher[i] - 'a') + 1;
				plain[index] = (char) ((char) 'a' + diff);
			}
//			System.out.println(cipher[i] + " - " + plain[index]);
			ans[i-n] = plain[index];
			index--;
			if (index < 0) {
				index = n - 1;
			}
		}
//		System.out.println();
		System.out.println(ans);
		fs.close();
	}
}

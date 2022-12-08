import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/pokechat

public class pokechat {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		char[] s = fs.nextLine().toCharArray();
		char[] message = fs.next().toCharArray();
		String ans = "";
		for (int i = 0; i < message.length; i += 3) {
			String m = message[i] + "" + message[i+1] + message[i+2];
			ans += s[Integer.parseInt(m)-1];
		}
		System.out.println(ans);
		fs.close();
	}
}

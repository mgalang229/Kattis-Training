import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Problem link: https://open.kattis.com/problems/cups

public class cups {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		fs.nextLine();
		ArrayList<Cup> cups = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			char[] s = fs.nextLine().toCharArray();
			String temp = "", firstParam = "";
			for (int j = 0; j < s.length; j++) {
				if (firstParam.equals("") && s[j] == ' ') {
					firstParam = temp;
					temp = "";
				} else {
					temp += s[j];
				}
			}
			String secondParam = temp;
			if (isNumber(firstParam.toCharArray())) {
				cups.add(new Cup(Integer.parseInt(firstParam) / 2, secondParam));
			} else {
				cups.add(new Cup(Integer.parseInt(secondParam), firstParam));
			}
		}
		Collections.sort(cups, new Comparator<Cup>() {
			@Override
			public int compare(Cup o1, Cup o2) {
				return Integer.compare(o1.radius, o2.radius);
			}
		});
		for (Cup cup : cups) {
			System.out.println(cup.color);
		}
		fs.close();
	}
	
	static boolean isNumber(char[] param) {
		for (int i = 0; i < param.length; i++) {
			if (param[i] < '0' || param[i] > '9') {
				return false;
			}
		}
		return true;
	}
	
	static class Cup {
		String color;
		int radius;
		
		Cup(int radius, String color) {
			this.radius = radius;
			this.color = color;
		}
	}
}

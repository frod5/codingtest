package string;

import java.util.Scanner;

public class ChangeUpperAndLower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				System.out.print((char)('a'+ ch - 'A'));
			} else {
				System.out.print((char)('A'+ ch - 'a'));
			}
		}
	}
}

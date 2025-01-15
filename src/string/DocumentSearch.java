package string;

import java.util.Scanner;

public class DocumentSearch {

	/**
	 * 백준 1543
	 * 문서검색
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();

		// 내 풀이
		// int count = 0;
		// for (; ; ) {
		// 	if (doc.indexOf(word) < 0) {
		// 		break;
		// 	}
		// 	doc = doc.substring(doc.indexOf(word) + word.length());
		// 	count++;
		// }
		//
		// System.out.println(count);

		//다른 풀이
		String replaced = doc.replace(word, "");
		int length = doc.length() - replaced.length();
		int count = length / word.length();
		System.out.println(count);
	}
}

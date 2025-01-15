package string;

import java.util.Scanner;

public class WordStudy {
	/**
	 * 백준 1157 단어공부 문제
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String lowerWord = scanner.nextLine().toLowerCase();

		int[] countArray = new int[26];
		for (int i = 0; i < lowerWord.length(); i++) {
			countArray[lowerWord.charAt(i) - 'a']++;
		}

		int max = 0;
		char maxAlphabet = '?';
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > max) {
				max = countArray[i];
				maxAlphabet = (char)(i + 'A');
			} else if (countArray[i] == max) {
				maxAlphabet = '?';
			}
		}

		System.out.println(maxAlphabet);
	}
}

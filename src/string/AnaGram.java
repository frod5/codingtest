package string;

import java.util.Scanner;

public class AnaGram {
	public static void main(String[] args) {
		/**
		 * string에서 각 문자 카운트사용 예제 활용
		 */
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		int result = 0;

		int[] countA = countByAlphabet(str1);
		int[] countB = countByAlphabet(str2);

		for (int i = 0; i < countA.length; i++) {
			result += Math.abs(countA[i] - countB[i]);
		}

		System.out.println(result);
	}

	private static int[] countByAlphabet(String str) {
		int countArray[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			countArray[str.charAt(i) - 'a']++;
		}
		return countArray;
	}
}

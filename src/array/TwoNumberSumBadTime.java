package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TwoNumberSumBadTime {
	/**
	 * 백준 3273
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");
		int X = Integer.parseInt(br.readLine());
		int findCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num1 = Integer.parseInt(numbers[i]);
			for (int j = i + 1; j < numbers.length ; j++) {
				int num2 = Integer.parseInt(numbers[j]);
				if((num1 + num2) == X) {
					findCount++;
				}
			}
		}
		bw.write(findCount+"\n");
		bw.flush();
	}
}

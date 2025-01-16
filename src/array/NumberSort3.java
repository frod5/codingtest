package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumberSort3 {
	/**
	 * 백준 10989
	 * 수 정렬하기3
	 * <p>
	 * Scanner 사용시 시간초과
	 * countArray 사용
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001]; // 범위보다 + 1
		for (int i = 0; i < T; i++) {
			int val = Integer.parseInt(br.readLine());
			cnt[val]++;
		}

		for (int i = 1; i <= 10000; i++) {
			while (cnt[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();

		// bw.close();
		// br.close();
	}
}

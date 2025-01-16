package array;

import java.util.Scanner;

public class LineUp {
	/**
	 * 10431
	 * 줄세우기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		while (testCaseCount-- > 0) {
			int testCaseNum =sc.nextInt();
			int[] h = new int[20];
			for (int i = 0; i < h.length; i++) {
				h[i] = sc.nextInt();
			}

			int cnt = 0;
			int[] sorted = new int[h.length];
			for (int i = 0; i < sorted.length; i++) {
				//1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
				//1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
				boolean find = false;
				for (int j = 0; j < i; j++) {
					if(sorted[j] > h[i]) {
						//2. 찾았다면 그 학생에 앞에 선다.
						//3. 그 학생과 그 뒤에 학생이 모두 한칸씩 물러난다.
						find = true;
						for (int k = i-1; k >= j ; k--) {
							sorted[k + 1] = sorted[k];
							cnt++;
						}
						sorted[j] = h[i];
						break;
					}
				}
				if(!find) {
					sorted[i] = h[i];
				}
			}
			System.out.println(testCaseNum + " " + cnt);
		}
	}
}

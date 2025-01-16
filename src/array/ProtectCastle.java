package array;

import java.util.Scanner;

public class ProtectCastle {
	/**
	 * 백준 1236 성지키기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
		}

		int existRowCount = 0;
		for (int i = 0; i < N; i++) {
			boolean exists = false;
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'X') {
					exists = true;
					break;
				}
			}
			if(exists) existRowCount++;
		}

		int existColCount = 0;
		for (int i = 0; i < M; i++) {
			boolean exists = false;
			for (int j = 0; j < N; j++) {
				if(map[j][i] == 'X') {
					exists = true;
					break;
				}
			}
			if(exists) existColCount++;
		}

		int needRowCount = N - existRowCount;
		int needColCount = M - existColCount;

		System.out.println(Math.max(needRowCount, needColCount));
	}
}

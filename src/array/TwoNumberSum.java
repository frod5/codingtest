package array;

import java.util.Scanner;

public class TwoNumberSum {
	/**
	 * 백준 3273
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int X = sc.nextInt();

		boolean[] exist = new boolean[100_000_01];
		for (int i = 0; i < N; i++) {
			exist[arr[i]] = true;
		}

		int ans = 0;
		for (int i = 0; i < (X-1)/2; i++) {
			if(i<=1000000 && X-i <= 1000000) {
				ans += (exist[i] && exist[X-i]) ? 1 : 0;
			}
		}
		System.out.println(ans);
		// for (int i = 0; i < N; i++) {
		// 	int pairValue = X - arr[i];
		// 	if(0 <= pairValue && pairValue <= 100_000_0){
		// 		ans += exist[pairValue] ? 1 : 0;
		// 	}
		// }
		//
		// System.out.println(ans/2);
	}
}

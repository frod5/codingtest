package string;

import java.util.Scanner;

public class SaltBoom {
	/**
	 * 백준 소금 폭탄
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] currentTime = sc.nextLine().split(":");
		String[] dropTime = sc.nextLine().split(":");

		int currentTImeSecond = Integer.parseInt(currentTime[0]) * 3600 + Integer.parseInt(currentTime[1]) * 60 + Integer.parseInt(currentTime[2]);
		int dropTimeSecond = Integer.parseInt(dropTime[0]) * 3600 + Integer.parseInt(dropTime[1]) * 60 + Integer.parseInt(dropTime[2]);

		int needTime = dropTimeSecond - currentTImeSecond;
		if(needTime <= 0) {
			needTime += 24 * 3600;
		}

		int needHour = needTime / 3600;
		int needMin = needTime % 3600 / 60;
		int needSec = needTime % 60;

		System.out.printf("%02d:%02d:%02d", needHour, needMin, needSec);
	}
}

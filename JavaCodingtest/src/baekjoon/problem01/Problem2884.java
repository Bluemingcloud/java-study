package baekjoon.problem01;

import java.util.Scanner;

public class Problem2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		int alarmMinute = H*60 + M -45;
		if (alarmMinute>=0) {
			System.out.println(alarmMinute/60 + " " + alarmMinute%60);
		} else {
			alarmMinute += 24*60;
			System.out.println(alarmMinute/60 + " " + alarmMinute%60);
		}
		scan.close();
	}
}

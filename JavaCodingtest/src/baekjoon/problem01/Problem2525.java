package baekjoon.problem01;

import java.util.Scanner;

public class Problem2525 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nowHour = scan.nextInt();
		int nowMinute = scan.nextInt();
		int addMinute = scan.nextInt();
		int ovenMinute = nowHour*60 + nowMinute + addMinute;
		
		if ( ovenMinute >= 24*60 ) {
			ovenMinute -= 24*60;
			System.out.println(ovenMinute/60 + " " + ovenMinute%60);
		} else {
			System.out.println(ovenMinute/60 + " " + ovenMinute%60);
		}
		
		scan.close();
	}
}

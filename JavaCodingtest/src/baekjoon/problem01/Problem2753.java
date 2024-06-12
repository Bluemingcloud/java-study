package baekjoon.problem01;

import java.util.Scanner;

public class Problem2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		boolean yCheck = (y % 4 == 0 & y % 100 != 0) | y % 400 == 0;
		if (yCheck) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
	}
}

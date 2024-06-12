package baekjoon.problem01;

import java.util.Scanner;

public class Problem18108 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		if (y  >= 1000 & y <= 3000) {
			System.out.println(y - 543);
		}
		scan.close();
	}
}

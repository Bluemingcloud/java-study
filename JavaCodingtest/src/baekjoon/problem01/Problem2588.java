package baekjoon.problem01;

import java.util.Scanner;

public class Problem2588 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (b >= 100 & b < 1000) {
			int b1 = b % 10;
			int b2 = b % 100 - b1;
			int b3 = b - b1 - b2;
			
			System.out.println(a * b1);
			System.out.println((a * b2)/10);
			System.out.println((a * b3)/100);
			System.out.println(a * b);			
		}

		scan.close();

	}

}

package baekjoon.problem03;

import java.util.Scanner;

public class Problem11022 {
	public static void main(String[] args) {
		// A + B - 8
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		String[] message = new String[T];
		for(int i = 0; i < T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			message[i] = "Case #"+ (i+1) +": " + a + " + " + b + " = " + (a+b);			
		}
		for(int i = 0; i < T; i++) {
			System.out.println(message[i]);
		}
		
		scan.close();
	}
}

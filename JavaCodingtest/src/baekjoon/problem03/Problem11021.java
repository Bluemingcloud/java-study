package baekjoon.problem03;

import java.util.Scanner;

public class Problem11021 {
	public static void main(String[] args) {
		// A + B - 7
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = a+b;
		}
		for(int i = 1; i<arr.length + 1; i++) {
			System.out.println("Case #" + i + ": " + arr[i-1]);
		}
		
		scan.close();
	}
}

package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem2609Third {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
        int divisor = euclidean(a , b);
        int multiple = a * (b / divisor);
		System.out.println(divisor);
		System.out.println(multiple);		
	}
	public static int euclidean(int a, int b) {
		if(b == 0) {
			return a;
		}
		return euclidean(b, a % b);
	}
}
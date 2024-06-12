package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem2609Second {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int min = a > b ? a : b;	
        int divisor = 0;
		for(int i = 0; i < min; i++) {
			if(a % (min - i) == 0 && b % (min - i) == 0) {
				divisor = min - i;
				break;
			}
		}
        int multiple = a * (b / divisor);
		System.out.println(divisor);
		System.out.println(multiple);		
	}
}
package baekjoon.solvedClass1;

import java.util.Scanner;

public class Problem8958 {
	public static void main(String[] args) {
		
		// OX 퀴즈
		/*
		 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		 * 예를 들어,
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();			
		}
		sc.close();
		
		for(String ox : arr) {
			int score = 1;
			int result = 0;
			for(int i = 0; i < ox.length(); i++) {
				if(ox.charAt(i) == 'X') {
					score = 0;
				} else {
					result += score;
				}
				score++;
			}
			System.out.println(result);
		}		
	}
}

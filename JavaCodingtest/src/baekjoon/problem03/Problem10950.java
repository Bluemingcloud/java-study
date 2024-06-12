package baekjoon.problem03;

import java.util.Scanner;

public class Problem10950 {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 출력 : 
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int[] numArr = new int[cnt];
		
		for (int i = 0; i<cnt; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			numArr[i] = a+b;
		}
		
		for (int i = 0; i<numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		scan.close();		
	}
}

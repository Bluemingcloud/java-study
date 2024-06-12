package baekjoon.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10952 {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 맨 마지막 줄은 0 0 으로 주어진다.
		 * 출력 : 
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		/*
		 * 가변 배열의 정의
		 * ArrayList 를 활용
		 * 
		 * 사용법 : ArrayList<타입> 리스트이름 = new ArrayList<>();
		 * 타입은 풀네임, 첫 글자는 대문자
		 * 
		 * 리스트이름.add(값); 사용하여 리스트에 새로운 값과 공간을 추가한다.
		 */
		
		ArrayList<Integer> sumList = new ArrayList<>();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while (a != 0 & b != 0) {
			sumList.add( a + b );		
			a = scan.nextInt();
			b = scan.nextInt();
		}		
		
		for(int sum : sumList) {
			System.out.println(sum);
		}	
		
		scan.close();		
	}
}

package baekjoon.problem03;

import java.util.Scanner;

public class Problem10951 {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 
		 * 출력 : 
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		
		/*
		 * 가변 배열의 정의
		 * ArrayList 를 활용
		 * 
		 * 사용법 : ArrayList<타입> 리스트이름 = new ArrayList<>();
		 * 타입은 풀네임, 첫 글자는 대문자
		 * 
		 * 리스트이름.add(값); 사용하여 리스트에 새로운 값과 공간을 추가한다.
		 */
		
		/*
		 * 끝이 정해지지 않음.
		 * 입력이 끝나면 멈추게 하기.
		 * scanner 메소드 중 스캐너이름.hasNextInt() 사용
		 * 	- boolean 값으로 return 한다. 다음입력이 있으면 true, 없으면 false.
		 */
		Scanner scan = new Scanner(System.in);		
		
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);			
		}			
		
		scan.close();		
	}
}

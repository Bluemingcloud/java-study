package day05;

public class EnhancedForEx {
	public static void main(String[] args) {
		
		//향상된 for문
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 0; i < arr.length; i++) {
			System.out.println("인덱스 " + i + "에 있는 값 : " + arr[i]);
		}
		
		for(int a : arr) {		// 배열의 값을 순서대로 a 에 담는다.
			System.out.println("향상된 for 문 에서 a 값 : " + a);
		}
		System.out.println("-----------------------------");
		
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		for(char c : arr2) {
			System.out.println(c);
		}
		System.out.println("-----------------------------");
		
		
		//향상된 for문을 이용하여 합계와 평균(실수부분)을 출력.
		int[] score = {33, 55, 43, 23, 43, 66};
		int sum = 0;
		System.out.println("점수");
		int i = 1;
		for(int d : score) {
			sum += d;			
			System.out.print(i + "번 : " + d + "  ");
			i++;
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
	}
}

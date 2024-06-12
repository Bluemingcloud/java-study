package baekjoon.problem03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem25304 {
	public static void main(String[] args) {
//		영수증에 적힌,
//
//		구매한 각 물건의 가격과 개수
//		구매한 물건들의 총 금액을 보고, 
//		구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//		
//		입력 : 
//			지불한 값 X
//			구매한 물건의 종류 수 N
//			N개의 줄에서 각 물건의 가격 a 와 물건을 구매한 개수 b
//		출력 : 
//			지불한 값과 계산 값이 일치하면 Yes 아니면 No
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int N = scan.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[i] = a*b;
		}
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		if( X == sum ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scan.close();		
	}
}

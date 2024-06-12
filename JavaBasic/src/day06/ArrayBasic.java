package day06;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		/*
		 * Tmi
		 * 모든 프로그래밍언어에서 시작값은 0 부터시작
		 * 통계 언어인 알 에서는 시작값이 1
		 * 통계학에 사용되는 표준표기법에 기반하기 때문에 1부터 사용
		 */
		
		// 배열문법
		int[] arr; // 배열선언
		
		// 배열생성
		arr = new int[5];
		
		// 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr);	// 배열의 주소값 이 출력된다.
									// 주소값 : 어딘가 만들어진 위치.
		// 배열의 모형을 문자열로 확인 : Arrays 사용
		System.out.println(Arrays.toString(arr));
		// 배열안의 값을 바꿀수 있다.
		arr[3] = 100;
		
		// 배열의 길이
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열을 선언하는 다양한 방법들
		int[] arr2 = new int[7];	// 한번에 쓰기. 초기화가 안됨.
		int[] arr3 = {1,2,3,4,5,6};	// 중괄호로 초기화.
		int[] arr4 = new int[] {1,2,3,4,5,6};	
		
		// 배열은 값을 지정하지 않으면, 타입의 기본값으로 초기화.
		// int : 0, double : 0.0, boolean : false, String : null
		System.out.println(Arrays.toString(arr2));
	}
}

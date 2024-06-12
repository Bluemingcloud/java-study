package day06;

import java.util.Arrays;

public class ArrayBasic2 {
	public static void main(String[] args) {
		
		// 배열의 순회
		int[] arr = {34, 65, 23, 53, 65, 93};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("인덱스 " + i + " 의 값 : " + arr[i]);
		}
		
		for(int a : arr) {
			System.out.println("값 : " + a);
		}
		
		System.out.println("---------------------");
		
		// 배열을 거꾸로 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println("인덱스 " + (arr.length - i - 1) + " 의 값 : " + arr[arr.length - i -1]);
		}
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println("인덱스 " + i + " 의 값 : " + arr[i]);
		}
		
		// 배열 요소들의 합계
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		
		
		// 향상된 for문 사용시 a 값은 범위 내에서만 존재
		// a 를 바꾼다고 배열안의 값이 변하는 것은 아니다.
		// 인덱스를 통해 배열의 요소값에 직접 대입해야한다.
		int[] arr2 = new int[7];
		
		int i = 0;
		for(int a : arr2) {
			i++;
			a = i;
		}
		System.out.println(Arrays.toString(arr2));	// [0, 0, 0, 0, 0, 0, 0] 출력
		
		// arr2.length 사용 없이 arr2의 배열 수만큼 반복한다.
		int j = 0;
		for(int a : arr2) {
			arr2[j] = j + 1;
			j++;			
		}
		System.out.println(Arrays.toString(arr2));	// [1, 2, 3, 4, 5, 6, 7] 출력
		
	}

}

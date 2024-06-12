package day08;

import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		// 배열도 메서드의 매개변수 or 반환으로 사용할 수 있을까? yes
		int[] arr = {1,2,3,4,5,6,7};
		
//		method01({1,2,3,4,5,6,7})	// 메서드의 매개변수에는 변수명을 입력(주소값을 사용)
		method01(arr);
		System.out.println();
		
		int[] result = method02();
		System.out.println(Arrays.toString(result));
		
		System.out.println("---------------------------------");
		int a = 1;
		int[] ar = {1,2,3};
		method03(a, ar);
		
		System.out.println("a : " + a);			// 메서드 안에서 값을 변경해도 변수의 값이 변하지 않음
		System.out.println(Arrays.toString(ar));	// 메서드 안에서 값을 변경하면 배열의 값도 변함.
													// 같은 주소값을 사용하여 변경하기 때문 (얕은 복사?)
	}
	
	// 매개변수로 배열을 받는 메서드
	static void method01(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "->");
		}
	}
	
	// 반환으로 배열을 리턴하는 메서드
	static int[] method02() {
		int[] arr = {1,2,3,4};		
		return arr;
	}
	
	// call by reference
	static void method03(int a, int[] arr) {
		a = 10;			// 메서드 안에서 a 를 10으로 변경.
		arr[0] = 10;	// 메서드 안에서 0 번째 인덱스를 10으로 변경.
	}

}

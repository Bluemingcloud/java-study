package day07;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		
		// 배열의 복사
		// 2가지 개념 - 얕은복사, 깊은복사
		// 얕은복사 - 주소값을 통한 복사 (원본 배열에도 실제 영향을 미침)
		// 깊은복사 - 완전 새로운 배열을 만들어서 복사
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);			// 주소값 출력
		
		int[] newArr = arr;					// 얕은복사
		System.out.println(newArr);			// 같은 주소값으로 복사
		System.out.println(newArr == arr);	// true
		
		newArr[0] = 100;
		System.out.println(Arrays.toString(newArr));	// {100,2,3,4,5}
		System.out.println(Arrays.toString(arr));		// {100,2,3,4,5} : 같은 주소값이라 변경해도 같음
		
		System.out.println("----------------------------------");
		
		// 깊은복사
		int[] arr2 = new int[arr.length];
		System.out.println(arr2);						// 새로운 주소값에 배열 저장
		for(int i = 0; i < arr.length; i++) {			// 깊은복사
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));		// [100, 2, 3, 4, 5]
		System.out.println(arr == arr2);				// false : 다른 주소값
		arr2[0] = 200;
		System.out.println(Arrays.toString(arr2));		// [200, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr));		// [100, 2, 3, 4, 5] : 원본 배열에는 영향을 미치지 않는다.
		
		
	}

}

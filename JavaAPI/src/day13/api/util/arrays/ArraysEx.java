package day13.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {

		// 배열관련 클래스 Arrays
		int[] arr = {3, 4, 5, 1, 2, 6, 7, 9, 10};
		
		// toString()
		// 배열을 문자열로 바꾸기
		System.out.println("Arrays.toString()");
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		// sort()
		// 배열 정렬
		// 반환 값 없이 바로 배열이 정렬된다.
		System.out.println("Arrays.sort()");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		// binarySearch()
		// 요소 검색. 요소의 인덱스 값을 반환
		// 정렬이 되어있는 배열만 제대로 동작한다.
		System.out.println("Arrays.binarySearch()");
		int index = Arrays.binarySearch(arr, 3);
		System.out.println("3이 있는 위치 : " + index);
		
		// 찾을 요소가 없으면 -1 을 반환한다.
		System.out.println(Arrays.binarySearch(arr, 0));
		System.out.println();
		// copyOf(), copyOfRange()
		// 배열의 복사
		System.out.println("Arrays.copyOf(), Arrays.copyOfRange()");
		int[] ar = Arrays.copyOf(arr, arr.length + 3);
		System.out.println(Arrays.toString(ar));
		
		int[] ar2 = Arrays.copyOfRange(arr, 2, 7);
		System.out.println(Arrays.toString(ar2));
		
		System.out.println();
		// equals()
		// 배열 비교
		System.out.println("Arrays.equals()");
		int[] ar3 = Arrays.copyOf(ar, ar.length);
		System.out.println(Arrays.equals(ar, ar2));
		System.out.println(Arrays.equals(ar, ar3));
	}

}

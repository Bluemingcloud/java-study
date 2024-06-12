package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsert {
	public static void main(String[] args) {
		
		// 배열은 크기가 고정
		// 추가하기위해서? - 추가되는것 처럼 새로운 배열을 만들어 나타낸다.
		// 1. 원본 배열의 + 1 크기의 새로운 배열을 만든다.
		// 2. 값을 옮긴다.
		// 3. 마지막에 값을 하나 추가한다.
		
		int[] arr = {10,20,30,40,50};
		int data = 60;	// 추가할 값
		
		// 1
		int[] arr2 = new int[arr.length + 1];
		
		// 2
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];			
		}
		
		// 3
		arr2[arr2.length - 1] = data;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		// 4. arr 을 arr2 로 바꾸기.
		arr = arr2;
		// 5. arr2 삭제 
		arr2 = null;
		System.out.println(Arrays.toString(arr));
		
		// 리스트로 만들어보기.
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		arrList.add(data);
		System.out.println(arrList);		
		
	}

}

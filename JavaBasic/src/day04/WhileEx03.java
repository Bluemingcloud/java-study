package day04;

import java.util.Arrays;

public class WhileEx03 {
	public static void main(String[] args) {
		
		// 배열의 반복.
		
		//int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		/*
		System.out.println(arr[0]);	// 시작값 0
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);	// 끝 길이 미만 (길이 - 1)
		*/
		
		/*
		int i = 0;	// 배열의 접근
		int sum = 0;
		while(i < arr.length) {
			
			//System.out.println(arr[i]);
			sum += arr[i];
			
			i++;
		}
		System.out.println("배열 요소의 합 : " + sum);
		*/
		
		// 배열에 순서대로 값을 저장
		
		int[] arr2 = new int[10];	// 길이가 10인 배열
		System.out.println(Arrays.toString(arr2));	// 요소들이 초기값 0 으로 저장된 배열
		
		int j = 0;
		while(j < arr2.length) {
			
			arr2[j] = j+1;
			j++;
			
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
}

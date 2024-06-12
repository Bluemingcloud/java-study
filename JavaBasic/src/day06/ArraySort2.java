package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort2 {
	public static void main(String[] args) {
		
		// 버블정렬 - 가장 느린 정렬방식
		// 가장 큰 수를 뒤로 보냄
		// 현재 원소와 바로 뒤의 원소를 비교후 정렬
		
		//int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 1회전
		// 5, 1, 23, 43, 100, 40, 200
		// 2회전
		// 1, 5, 23, 43, 40, 100, 200
		// 3회전
		// 1, 5, 23, 40, 43, 100, 200 끝
		// ....
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*200) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
		
		for(int i = 0; i < arr.length - 1; i++) {	// 전체를 몇번 회전할 것인가.
			
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr));
		
		
		// 가장 빠른 정렬 - 퀵 정렬
		// Arrays.sort(arr);
		
		int[] arr2 = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = (int)(Math.random()*200) + 1;
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("---------------------------");
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
				
	}

}

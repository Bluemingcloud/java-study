package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		
		// 배열의 정렬
		// 정렬을 하는 방법 9~10 개 정도 됨
		// 선택정렬, 버블정렬 <- 좀 느림
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*200) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
		
		// 오름차순 정렬
		// int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 1, 5, 23, 40, 43, 100, 200 오름차순
		
		// 선택정렬
		// 1회전
		// 1, 23, 5, 43, 200, 100, 40
		// 2회전
		// 1, 5, 23, 43, 200, 100, 40
		// 3회전
		// 1, 5, 23, 43, 200, 100, 40
		// 4회전
		// 1, 5, 23, 40, 200, 100, 43
		// 5회전
		// 1, 5, 23, 40, 43, 100, 200
		// 마지막
		// 1, 5, 23, 40, 43, 100, 200
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {	// i는 대상, j는 비교 대상
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		int[] tempArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int cnt = 0;
			for(int a : arr) {
				if(a > temp) {
					cnt++;
				}
			}
			tempArr[tempArr.length-cnt-1] = temp;			
		}
//		System.out.println(Arrays.toString(tempArr));
		
		
		int[] tempArr2 = new int[arr.length];
		int[] cntArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int temp2 = arr[i];
			for(int a : arr) {
				if(a > temp2) {
					cntArr[i]++;
				}
			}
		}
//		System.out.println(Arrays.toString(cntArr));
		for(int i = 0; i < cntArr.length; i++) {
			tempArr2[arr.length - cntArr[i] - 1] = arr[i];
		}
//		System.out.println(Arrays.toString(tempArr2));
	}
}

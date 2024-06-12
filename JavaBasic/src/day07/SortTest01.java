package day07;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ranArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			ranArr[i] = (int)(Math.random()*50)+1;
		}
		System.out.println(Arrays.toString(ranArr));
		
		int[] ranArr2 = new int[ranArr.length];
		
		// 깊은복사를 통해 원본배열에 영향을 주지 않게 한다.
		for(int i = 0; i < ranArr.length; i++) {
			ranArr2[i] = ranArr[i];
		}
		
		// 버블정렬 : O(N^2)
		for(int i = 0; i < ranArr.length - 1; i++) {
			for(int j = 0; j < ranArr.length - 1 - i; j++) {
				int temp = 0;
				if(ranArr[j] > ranArr[j+1]) {
					temp = ranArr[j];
					ranArr[j] = ranArr[j+1];
					ranArr[j+1] = temp;
				}				
			}			
		}
		System.out.println(Arrays.toString(ranArr));
		
		// 선택정렬 : O(N^2)
		for(int i = 0; i < ranArr2.length - 1; i++) {
			for(int j = i + 1; j < ranArr2.length; j++) {
				int temp = 0;
				if(ranArr2[i] > ranArr2[j]) {
					temp = ranArr[i];
					ranArr[i] = ranArr[j];
					ranArr[j] = temp;
				}
			}			
		}
		System.out.println(Arrays.toString(ranArr2));
		
		// 이진탐색
		// Arrays.binarySearch(arr, 값) : 인덱스 혹은 음수
		int find = scan.nextInt();
		int start = 0;
		int end = ranArr.length - 1;
		int mid = 0;
		while(start <= end) {
			mid = (start+end)/2;
			if(ranArr[mid] == find) {
				System.out.println(mid);
				break;
			} else if(ranArr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}			
		}
 		if(start > end) {
 			System.out.println("없습니다.");
 		}
 		scan.close();
	}
}

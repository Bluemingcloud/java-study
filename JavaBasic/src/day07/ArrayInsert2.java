package day07;

import java.util.Arrays;

public class ArrayInsert2 {
	public static void main(String[] args) {
		
		// 배열의 중간에 추가
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int targetIndex = 2;
		int data = 100;
		
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		for(int i = newArr.length - 1; i > targetIndex; i--) {
			newArr[i] = newArr[i-1];
		}
		
		newArr[targetIndex] = data;
		System.out.println(Arrays.toString(newArr));
		
		int[] newArr2 = new int[arr.length + 1];
		for(int i = 0; i < newArr2.length; i++) {
			if(i == targetIndex) {
				newArr2[i] = data;
			} else if(i > targetIndex) {
				newArr2[i] = arr[i-1];
			} else {
				newArr2[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr2));
		
	}

}

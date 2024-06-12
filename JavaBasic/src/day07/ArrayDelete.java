package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		// 배열의 삭제 - 사실 배열은 삭제가 없다.
		// 마치 삭제된 것 처럼 보이게 한다.
		/*
		 * 1. 삭제할 위치 다음값들을 하나씩 당겨온다.
		 * 2. 길이 - 1 인 새로운 배열에 값을 옮겨담는다.
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int targetIndex = 5;
		
		for(int i = targetIndex; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		int[] newArr = new int[arr.length - 1];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		// 기존 arr 은 삭제.
		arr = newArr;
		newArr = null;
		System.out.println(Arrays.toString(arr));
		
		
		// 리스트로 만들어 보기.
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i = 0; i < arr2.length; i++) {
			newList.add(arr2[i]);
		}
		newList.remove(targetIndex);
		System.out.println(newList);
 	}

}

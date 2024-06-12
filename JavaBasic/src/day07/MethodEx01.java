package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx01 {
	
	public static void main(String[] args) {
		
		// 메서드
		// 메서드는 다른 메서드안에서 선언할 수 없다.
		// main 은 사실 메서드.
		// 새로운 메서드를 선언하기 위해서는 main 밖의 범위에서 선언
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int max = scan.nextInt();
		int[] arr = isRanArr(num, max);
		System.out.println(Arrays.toString(arr));
		System.out.println(isSum(arr));
		System.out.println(isMaxNum(arr));
		System.out.println(Arrays.toString(isSelcSort(arr)));
		
		String result = isSumStr();
		System.out.println(result);
		
		// 리턴이 있는 함수는 출력문 안에서 바로 호출이 됩니다.
		System.out.println(isSumStr());
		
		scan.close();
	}
	
	static int[] isRanArr(int n, int max) {
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * max) + 1;
		}
		return arr;
	}
	
	static int isSum(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	
	static int isMaxNum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int a : arr) {
			if(a > max) {
				max = a;
			}
		}
		return max;
	}
	
	static int[] isSelcSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;									
				}
			}
		}
		return arr;
	}
	
	static String isSumStr() {
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
	}

}

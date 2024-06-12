package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem1181 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].length() > arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;							
				}
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].length() != arr[j].length()) {
					break;
				}
				if(arr[i].equals(arr[j])) {
					arr[i] = null;
					break;
				}
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(String str : arr) {
			if(str == null) {
				continue;
			}
			System.out.println(str);
		}		
	}
}

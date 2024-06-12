package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2751Second {
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 2
		// 오름차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		pivotSort(arr,0 , arr.length - 1);
		
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.println("" + sb);			
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[left]; 
		int low = left;
		int high = right; 
		
		while(low < high) {
			
			while(arr[high] > pivot && low < high) {
				high--;
			}
			
			while(arr[low] <= pivot && low < high) {
				low++;
			}
			
			swap(arr, low, high);
		}
		
		swap(arr, low, left);	
		
		return low;
	}
	
	public static void pivotSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivot = partition(arr, low, high);
		
		pivotSort(arr, low, pivot - 1);
		pivotSort(arr, pivot + 1, high);
	}

}

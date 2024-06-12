package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2751Fourth {
	

	public static int[] temp;
	
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 2
		// 오름차순 정렬
		// merge sort
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		temp = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(arr, 0, arr.length - 1);
		
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);			
		br.close();
	}
	
	public static void mergeSort(int[] a, int left, int right) {
		
		for(int size = 1; size <= right; size += size) {
			
			for(int l = 0; l <= right - size; l += (2 * size)) {
				
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				
				merge(a, low, mid, high);				
			}			
		}
		
	}
	
	public static void merge(int[] a, int left, int mid, int right) {
		int l = left;
		int r = mid + 1;
		int index = left;
		
		while(l <= mid && r <= right) {
			
			if(a[l] <= a[r]) {
				temp[index] = a[l];
				index++;
				l++;
			} else {
				temp[index] = a[r];
				index++;
				r++;
			}
			
			if(l > mid) {
				while(r <= right) {
					temp[index] = a[r];
					index++;
					r++;	
				}
			} else {
				while(l <= mid) {
					temp[index] = a[l];
					index++;
					l++;
				}
			}
			
			for(int i = left; i<= right; i++) {
				a[i] = temp[i];
			}
		}		
		
	}

}

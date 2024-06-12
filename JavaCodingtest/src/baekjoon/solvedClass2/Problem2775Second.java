package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem2775Second {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = new int[14];
		for(int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}		
			
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			if(k == 0) {
				System.out.println(arr[n - 1]);
				continue;
			}
			int[] result = dynamicMethod(n,arr);
			for(int j = 0; j < k - 1; j++) {
				result = dynamicMethod(n, result);
			}
			System.out.println(result[n - 1]);
		}
		
	}
	public static int[] dynamicMethod(int n, int[] arr) {
		int[] result = new int[n];
		result[0] = 1;
		for(int i = 1; i < result.length; i++) {
			for(int j = 0; j <= i; j++) {
				result[i] += arr[j];
			}			 
		}
		return result;
	}
}

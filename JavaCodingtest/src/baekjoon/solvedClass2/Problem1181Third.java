package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1181Third {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					return str1.compareTo(str2);
				} else {
					return str1.length() - str2.length();
				}
			}			
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append("\n");
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append("\n");
			}			
		}
		System.out.println(sb);
		br.close();
				
	}
}

package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11720 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] arr = str.split("");
		// String[] arr = br.readLine().split(""); 로 한번에 표기 가능.
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		// charAt 사용시 Character.getNumericValue 로 char 형식의 숫자를 수 로 저장가능
		// 혹은 String.valueOf(numbers.charAt(i)) 로도 가능
		System.out.println(sum);
	}
}

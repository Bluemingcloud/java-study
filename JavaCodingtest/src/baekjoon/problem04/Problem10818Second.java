package baekjoon.problem04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10818Second {
	public static void main(String[] args) throws IOException {
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ",n);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(String a : arr) {
			if(Integer.parseInt(a) >= max) {
				max = Integer.parseInt(a);
			}
			if(Integer.parseInt(a) <= min) {
				min = Integer.parseInt(a);
			}
		}
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}

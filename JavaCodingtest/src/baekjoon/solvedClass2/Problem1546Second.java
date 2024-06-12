package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1546Second {
	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double[] arr = new double[N];
		
		double M = 0;		
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
			if(arr[i] > M) {
				M = arr[i];
			}
		}
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != M) {
				sum += arr[i];
			} else {
				sum += M;
			}
		}
		
		System.out.println(((sum)/M*100)/N);
		br.close();
	}
}
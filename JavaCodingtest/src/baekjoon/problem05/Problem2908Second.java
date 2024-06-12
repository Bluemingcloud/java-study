package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2908Second {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			// StringBuilder 중 .reverse() 사용으로 쉽게 가능 
			StringBuilder sb = new StringBuilder(st.nextToken());
			int a = Integer.parseInt(sb.reverse().toString());
			sb = new StringBuilder(st.nextToken());
			int b = Integer.parseInt(sb.reverse().toString());
			if(a >= b) {
				bw.write(a + "");
			} else {
				bw.write(b + "");
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

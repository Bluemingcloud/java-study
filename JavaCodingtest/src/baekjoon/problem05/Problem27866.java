package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27866 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String iStr = br.readLine();
		int i = Integer.parseInt(iStr);
		
//		System.out.println(str.substring(i-1,i));
		// println 사용시 128ms
		// BufferedWriter 사용시 120ms
		
		bw.write(str.charAt(i-1));			
		bw.flush();
	}
}

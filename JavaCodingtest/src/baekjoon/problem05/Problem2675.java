package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2675 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < T; i++) {
				st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken());
				String s = st.nextToken();
				
				for(int j = 0; j < s.length(); j++) {
					for(int k = 0; k < r; k++) {
						bw.write(s.charAt(j)+"");
					}
				}
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

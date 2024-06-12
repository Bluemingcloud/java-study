package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1152Second {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			// st.countTokens(); 을 통해 간단히 사용 가능하다.
			bw.write(st.countTokens() + "");
			
			br.close();
			bw.flush();
			bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

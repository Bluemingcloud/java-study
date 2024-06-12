package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2609Fourth {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
        int divisor = euclidean(a , b);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(divisor);
        sb.append("\n");
        sb.append(a * (b / divisor));
        
        bw.write(""+sb);
        bw.flush();
        bw.close();
        br.close(); 	
	}
	public static int euclidean(int a, int b) {
		if(b == 0) {
			return a;
		}
		return euclidean(b, a % b);
	}
}
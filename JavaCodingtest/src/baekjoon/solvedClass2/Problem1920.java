package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem1920 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			map.put(Integer.parseInt(st.nextToken()), 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			int chk = Integer.parseInt(st.nextToken());  
			sb.append(map.containsKey(chk) ? map.get(chk) : 0);
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}

}

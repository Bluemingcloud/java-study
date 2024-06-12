package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem10814 {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> ageMap = new HashMap<Integer, Integer>();
		Map<Integer, String> nameMap = new HashMap<Integer, String>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			ageMap.put(i, Integer.parseInt(st.nextToken())); 
			nameMap.put(i, st.nextToken());
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		int age = 0;
		while(age++ <= 200) {
			
			for(int i = 0; i < n; i++) {
				if(ageMap.get(i) == age) {
					sb.append(age).append(" ").append(nameMap.get(i));
					sb.append("\n");
				}
			}		
			
		}
		System.out.println(sb);		
		
	}

}

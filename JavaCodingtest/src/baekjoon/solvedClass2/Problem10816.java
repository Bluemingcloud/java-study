package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem10816 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		while(n-- > 0) {
			int card = Integer.parseInt(st.nextToken());
			if(map.get(card) == null) {
				map.put(card, 1);
			} else {
				map.put(card, map.get(card) + 1);
			}			
		}
		
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(m-- > 0) {
			int chk = Integer.parseInt(st.nextToken());
			if(map.get(chk) == null) {
				sb.append(0).append(" ");
			} else {
				sb.append(map.get(chk)).append(" ");
			}
			
		}
		
		System.out.println(sb);
		br.close();
	}

}

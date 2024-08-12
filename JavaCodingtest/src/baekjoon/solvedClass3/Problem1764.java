package baekjoon.solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1764 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		Queue<String> queue = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}
		
		for(int i = 0; i < m; i++) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				queue.offer(name);
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(queue.size()).append("\n");
		while(queue.size() != 0) {
			sb.append(queue.poll()).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}

}

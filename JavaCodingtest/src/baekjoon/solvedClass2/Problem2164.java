package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164 {
	
	public static void main(String[] args) throws IOException {
		
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
		
	}

}

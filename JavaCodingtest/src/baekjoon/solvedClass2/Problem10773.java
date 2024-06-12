package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10773 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		String str;
		while(k-- > 0) {
			str = br.readLine();
			if(!str.equals("0")) {
				stack.push(Integer.parseInt(str));
			} else {
				stack.pop();
			}
		}
		int sum = 0;
		for(int num : stack) {
			sum += num;
		}
		
		System.out.println(sum);
		
	}

}

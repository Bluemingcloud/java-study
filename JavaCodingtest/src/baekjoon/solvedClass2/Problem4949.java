package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem4949 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack;
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		while(true) {
			str = br.readLine();
			if(str.equals(".")) break;
			
			char[] arr = str.toCharArray();
			
			stack = new Stack<>();
			boolean flag = false;
			
			for(char c : arr) {
				if(c == '(') stack.push(')');
				if(c == '{') stack.push('}');
				if(c == '[') stack.push(']');
				
				if(c == ')' || c == '}' || c == ']') {
					if(stack.isEmpty()) {
						flag = true; 
						break;
					} else {
						char chk = stack.pop();
						if(c != chk) {
							flag = true;
							break;
						}												
					}
				}
			}
			
			if(!flag && stack.isEmpty()) {
				sb.append("yes");
			} else {
				sb.append("no");
			}
			sb.append("\n");
		}
		bw.write("" + sb);
		bw.flush();
		bw.close();
		br.close();
	}

}

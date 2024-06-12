package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem9012 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String str;
		while(t-- > 0) {
			str = br.readLine();
			Stack<Boolean> stack = new Stack<>();
			boolean flag = false;
			for(char c : str.toCharArray()) {
				if(c == '(') stack.push(true);
				if(c == ')') {
					if(stack.isEmpty())	{
						flag = true; break;
					} else stack.pop();
				}				
			}
			if(!flag && stack.isEmpty()) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
			bw.flush();
		}		
		bw.close();
		br.close();		
	}
}

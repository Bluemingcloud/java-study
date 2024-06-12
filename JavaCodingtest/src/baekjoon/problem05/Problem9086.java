package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			if(str.length() == 1) {
				System.out.println(str+str);
			} else {
				System.out.println(str.substring(0,1) + str.substring(str.length() - 1,str.length()));
			}			
		}		
	}
}

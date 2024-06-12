package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split("");
		
		int[] cntArr = new int['z'-'a'+1];
		
		String[] alphaArr = new String['z'-'a'+1];
		for(int i = 0; i < alphaArr.length; i++) {
			alphaArr[i] = (char)('a' + i)+"";
			cntArr[i] = -1;
		}
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < alphaArr.length; j++) {
				if(cntArr[j] != -1) {
					continue;
				}
				if(strArr[i].equals(alphaArr[j])) {
					cntArr[j] = i;
				} 			
			}						
		}
		for(int c : cntArr) {
			System.out.print(c + " ");
		}
	}
}

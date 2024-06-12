package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2908 {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] strArr = br.readLine().split(" ");
			
			// StringBuilder 중 .reverse() 사용으로 쉽게 가능 
			for(int i = 0; i < strArr.length; i++) {
				String temp = "";
				for(int j = 0; j < strArr[i].length(); j++) {
					temp += strArr[i].charAt(strArr[i].length()-j-1);
				}
				strArr[i] = temp;				
			}
			
			if(Integer.parseInt(strArr[0]) >= Integer.parseInt(strArr[1])) {
				bw.write(strArr[0]);
			} else {
				bw.write(strArr[1]);
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

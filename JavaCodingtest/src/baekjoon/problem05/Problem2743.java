package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2743 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			System.out.println(str.length());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

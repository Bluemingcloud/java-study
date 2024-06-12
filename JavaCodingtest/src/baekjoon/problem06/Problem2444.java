package baekjoon.problem06;

import java.util.Scanner;

public class Problem2444 {
	public static void main(String[] args) {
		// 별찍기 - 7
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int arrLeng = 2*N-1;
		String[] strArr = new String[arrLeng];
		
		for(int i = 0; i<N; i++) {
			String str = "";
			for(int j = N-1; j>i; j--) {
				str+=" ";
			}
			for(int j = 0; j<2*i+1; j++) {
				str+="*";
			}
			strArr[i] = str;
		}
		for(int i = 0; i<strArr.length/2+1; i++) {
			strArr[strArr.length-i-1] = strArr[i];
		}
		for(String result : strArr) {
			System.out.println(result);
		}
	}
}

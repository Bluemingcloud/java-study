package baekjoon.problem04;

import java.util.Scanner;

public class Problem5597 {
	public static void main(String[] args) {
		
		// 과제 안 내신 분?
		
		Scanner scan = new Scanner(System.in);
		
		// 입력한 번호는 1, 없는 번호는 0 으로 인덱스를 활용해 나타낸다.
		int[] studentArr = new int[30];	

		for(int i = 0; i < 28; i++) {	
			int chk = scan.nextInt();	
			studentArr[chk-1]++;		 
		}

		for(int i = 0; i<studentArr.length; i++) {
			if(studentArr[i] == 0) {
				System.out.println(i+1);
			}
		}		
		
		scan.close();		
	}
}

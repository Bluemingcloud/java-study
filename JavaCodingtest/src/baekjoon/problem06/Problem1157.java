package baekjoon.problem06;

import java.util.Scanner;

public class Problem1157 {
	public static void main(String[] args) {
		// 입력 받은 단어의 중복이 제일 많은 알파벳을 출력 
		// 최대 중복 수 가 같으면 ? 출력
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		// toCharArray : String 값을 char 배열로 변환 시키는 실행문
		char[] strArr = str.toCharArray();
		
		char[] chkArr = new char['Z'-'A'+1];
		int[] cntArr = new int['Z'-'A'+1];
		for(int i = 0; i < chkArr.length; i++) {
			chkArr[i] = (char)(65+i);
		}
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < chkArr.length; j++) {
				if(strArr[i] == chkArr[j] | (char)(strArr[i] - ('a' - 'A')) == chkArr[j]) {
					cntArr[j]++;
				}
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		int maxCnt = 1;
		for(int i = 0; i < cntArr.length; i++) {
			if( cntArr[i] > max) {
				max = cntArr[i];
				maxIndex = i;
				maxCnt = 1;
			} else if (max == cntArr[i]) {
				maxCnt++;
			}		
		}
		
		if(maxCnt == 1) {
			System.out.println(chkArr[maxIndex]);
		} else {
			System.out.println("?");
		}		
	}
}

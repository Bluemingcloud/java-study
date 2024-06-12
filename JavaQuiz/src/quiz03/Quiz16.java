package quiz03;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
//		첫째 줄에 반복 횟수, 둘째 줄에 반복할 문자열이 주어집니다.
//
//		반복횟수 만큼 문자열을 붙여서 출력해 주세요.
//		문자열의 합을 이용해 출력해 주세요.
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		String txt = scan.next();
		String result = "";
		int i = 0;
		while(i<cnt) {
			result += txt;
			i++;
		}		
		System.out.println(result);
		scan.close();
	}

}

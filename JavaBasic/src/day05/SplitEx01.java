package day05;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEx01 {
	public static void main(String[] args) {
		
		// split 사용 연습
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		//12345
		
		// 변수.split(나누는 단위, 나누는 개수)
		String[] strArr = str.split("");
		System.out.println(Arrays.toString(strArr));
		//[1, 2, 3, 4, 5]
		
		String[] strArr2 = str.split("",3);
		System.out.println(Arrays.toString(strArr2));
		//[1, 2, 345]
		
		scan.close();	
		
	}
}

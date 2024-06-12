package baekjoon.problem06;

//import java.util.Arrays;
import java.util.Scanner;

public class Problem10988 {
	public static void main(String[] args) {
		
		// 팰린드롬 확인하기
		// 팰린드롬 : 앞으로 읽어도 뒤로 읽어도 같은 단어.
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		// level
		
		String[] strArr = str.split("");
//		System.out.println(Arrays.toString(strArr));
		// [l, e, v, e, l]
		
//		System.out.println(strArr[0]);					// l
//		System.out.println(strArr[strArr.length-1]);	// l
		
//		System.out.println(strArr[0] == strArr[strArr.length-1]);
		// false 가 출력 된다. 이유는?
		// 문자열 String 은 == 사용시 각각의 참조값을 비교한다.
		// 문자열은 불변(immutable) 하기에 각각 같은 문자열을 갖더라도 다른 참조값을 가진다.
		// 따라서 strArr 안의 문자열 끼리 비교는 다른 참조값이므로 false 가 출력된다.
		
//		System.out.println(strArr[0].equals(strArr[strArr.length-1]));
		// equals 사용시 true 출력.
		

		// 단어 총 길이의 절반만 확인하면 된다.
		int chk = 0;
		for(int i = 0; i<strArr.length/2; i++) {
			if(strArr[i].equals(strArr[strArr.length-i-1])) {
				chk++;
			}
		}
//		System.out.println(chk);
		// 2 (length/2 : 2로 나눈 몫과 같은 값)
		
		if(chk == strArr.length/2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}				
	}
}

package quizObject17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringQuiz02 {
	
	public static void main(String[] args) {
		
		/* 주민번호 검증메서드 masking(String) : String
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 950101-2000000 -> 여자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		Scanner sc = new Scanner(System.in);
		try {
			String ssn = sc.nextLine();
			String mask = masking(ssn);
			System.out.println(mask);
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
	public static String masking(String ssn) throws InputMismatchException {
		
		String str = "검증데이터 " + ssn + " -> ";
		
		ssn = ssn.replace("-", "");		

		if(ssn.length() != 13) {
			throw new InputMismatchException(str + "예외");
		} 
		
		char gen = ssn.charAt(6);
		
		if(gen < '1' || gen > '4') {
			throw new InputMismatchException(str + "예외");
		}

		str += ( gen == '1' || gen == '3' ) ? "남자" : "여자";

		System.out.println(str);
		String mask = ssn.substring(0, 6);
		mask += "-*******";
		
		return mask;
	}

}

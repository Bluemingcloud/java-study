package quizObject17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken01 {

	public static void main(String[] args) {
	    /*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 *    4. 날씨가
		 *    5. 좋네요ㅋ
		 * 5. 분리된 문자열을 배열에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		System.out.println(st.countTokens());
		
		String[] arr = new String[st.countTokens()];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			System.out.println((i + 1) + ". " + arr[i]);
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}

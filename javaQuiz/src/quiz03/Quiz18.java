package quiz03;

public class Quiz18 {
	public static void main(String[] args) {
		
		// for 문 사용
		
		// 1. 7~100까지 정수 중에서 7의 배수를 가로로 출력
		for(int i = 7; i <= 100; i++) {
			if(i%7 == 0) {
				System.out.print(i + " ");
			}
		}
//		System.out.print("\n");
		System.out.println();	// 줄 바꿈 방법.
		
		// i의 증감을 7씩 하면 7의 배수만 나올 수 있다.
		for(int i = 7; i<=100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
				
		// 2. 1~100까지 정수 중에서 9의 배수의 개수를 출력
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%9 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// 증감을 9씩 하여 9의 배수마다 카운트
		int cnt2 = 0;
		for (int i = 9; i <= 100; i += 9 ) {
			cnt2++;
		}
		System.out.println(cnt2);
		
		// 3. 50~100까지 두 수 사이의 합계 출력
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 4. A~Z 까지 문자열의 합 출력
		String txt = "";
		for(char i = 65; i <= 90; i++) {
			txt += i;
		}
		System.out.println(txt);
		
		// char 로도 반복이 가능
		String txt2 = "";
		for(char i = 'A'; i<= 'Z'; i++) {
			txt2 += i;
		}
		System.out.println(txt2);
		
	}

}

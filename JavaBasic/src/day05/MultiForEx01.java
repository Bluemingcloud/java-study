package day05;

public class MultiForEx01 {
	public static void main(String[] args) {
		//반복의 중첩
//		int cnt = 0;
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 9; j++) {
//				cnt++;
//				System.out.println(i + " - " + j);
//			}
//		}
//		System.out.println(cnt);
		
		//모든 구구단 2~9단
		for(int i = 2; i<=9; i++) {
			System.out.println("구구단:" + i + "단");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("-------------");
		}
		
		
		
		
	}
}

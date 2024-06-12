package day04;

public class ForEx01 {
	public static void main(String[] args) {
		
		/*
		 * int i = 1;
		 * while(i<=10) {
		 * 		System.out.println(i);
		 * 		i++;
		 * }
		 */
		// 원하는 실행문만 범위안에 넣으면 된다.
		for(int i = 1; i <= 10; i++) {
			 System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
}

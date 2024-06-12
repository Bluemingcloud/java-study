package quiz03;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
//		금액 x원이 주어집니다
//		가장 최선의 방법으로 거스름돈을 구하려고 합니다.
//
//		예를 들어 17780원 이라면
//
//		1000원 지폐 17개
//		500원 동전 1개
//		100원 동전 2개
//		50원 동전 1개
//		10원 동전 3개 가 필요합니다.
//
//		배열 arr에는 아래처럼 동전이 주어집니다.
//		int[] arr = {1000, 500, 100, 50, 10}
//
//		이 배열을 활용해서 동전과 필요 개수를 순서대로 출력해주세요.
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int[] arr = {1000, 500, 100, 50, 10};
		
		String result = "";
		
		int i = 0;
		while(i<arr.length) {
			
			if(result == "") {
				result = arr[i] + " " + (x / arr[i]);
			} else {
				result = result + " " + arr[i] + " " + (x / arr[i]);
			}
			
			x =  x % arr[i];			
			i++;
		}
		
		System.out.println(result);	
		
		String temp1 = "테스트 확인" + " ";
		String temp2 = "테스트 확인";
		System.out.println(temp1);
		
		if (temp1 == temp2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		scan.close();		
	}
}

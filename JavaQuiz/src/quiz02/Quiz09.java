package quiz02;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {		
		/*
		길동이네 가게가 가게를 오픈 했습니다.

		구입할 수 있는 메뉴는 [수박, 사과, 멜론, 귤] 입니다.

		메뉴의 가격은 다음과 같습니다.
		수박 = 4만원
		사과 = 3만원
		멜론 = 5만원
		귤 = 6만원
		없는 메뉴라면 "없는메뉴" 를 출력해 주세요

		메뉴를 입력하면 해당 알맞은 가격을 출력하는 문장을 작성해주세요.
		단 switch문으로 작성해주세요
		*/
		/*
		 * 위 코드에서 입력을 3개를 받고
		 * 입력된 3개의 메뉴 전체가격을 출력해보기
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		String[] menuArr = {"수박", "사과", "멜론", "귤"};
//		
//		System.out.print("구매 개수를 입력하세요>");
//		int num = scan.nextInt();
//	
//		System.out.print("과일을 입력하세요>");
//		String[] selectArr = new String[num];
//		
//		for(int i = 0; i < selectArr.length; i++) {
//			String select = scan.next();
			for(int j = 0; j < menuArr.length; j++) {
			}
//			if(menuArr.equals(select)) {
//				selectArr[i] = select;
//			} else {
//				selectArr[i] = "없는메뉴";
//			}
//			
//		}
//		System.out.println(Arrays.toString(selectArr));
//		
//		int[] cntArr = new int[4];

//		
//		
//		//자바에서는 indexOf를 사용하기 위해 Arrays.asList 를 통해 list로 만들고 사용해야 한다.
//		Arrays.asList(menuArr).indexOf("사과");
		
		
		String menu = scan.next();
		
		switch (menu) {
		case "수박":
			System.out.println("4만원");
			break;
		case "사과":
			System.out.println("3만원");
			break;
		case "멜론":
			System.out.println("5만원");
			break;
		case "귤":
			System.out.println("6만원");
			break;
		default:
			System.out.println("없는메뉴");
			break;
		}
		

		scan.close();		
	}
}

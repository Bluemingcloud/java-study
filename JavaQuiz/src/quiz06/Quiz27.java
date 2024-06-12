package quiz06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz27 {
	
	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수정하고 싶은 이름을 입력받아서,
		 * 해당 이름이 존재하면, 수정할 이름을 새롭게 입력받습니다.
		 * 
		 * 만약에 값이 없으면 "이름은 존재하지 않습니다." 를 출력합니다.
		 * 
		 * 문자열의 비교
		 * 문자열.equals(비교할문자열)
		 */
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 학생의 별명을 입력하세요>");
		String targetName = scan.nextLine();
//		boolean run = false;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].equals(targetName)) {
//				System.out.println(arr[i] + " 학생의 별명을 변경합니다.");
//				System.out.print(">");
//				arr[i] = scan.nextLine();
//				run = true;
//				break;
//			}
//		}
//		if(run) {
//			System.out.println(Arrays.toString(arr));
//		} else {
//			System.out.println("별명이 존재하지 않습니다.");			
//		}	
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j].equals(targetName)) {
				System.out.println(arr[j] + " 학생의 별명을 변경합니다.");
				System.out.print(">");
				arr[j] = scan.nextLine();
				System.out.println(Arrays.toString(arr));
				break;
			} 
			if(j == arr.length - 1) {
				System.out.println("별명이 존재하지 않습니다.");
			}
		}
		
		scan.close();
		
	}
}

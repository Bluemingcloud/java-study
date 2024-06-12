package day02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// 입력
		// 1. 스캐너를 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너가 가지고 있는 기능을 활용해서 데이터를 입력받음
		System.out.print("너 이름이 뭐야?>");
		String name = scan.next();		// 공백 앞까지 문자열을 받음
		
		System.out.print("너 나이가 몇이야?>");
		int age = scan.nextInt();		// 정수를 입력받음
		
		System.out.print("키는 몇이야?>");
		double cm = scan.nextDouble(); 	// 실수를 입력받음
		
		// nextLine 과 다른 입력구문을 사용하면, 입력이 무시되고 넘어가는 경우가 있음
		// 공백, 엔터, 라인변경 도 각각 값이 존재한다.
		// nextLine 은 엔터값을 받아 소모시키는 역할
		// nextDouble 에는 엔터값이 남아 있음
		// 둘을 같이 쓰면 nextDouble에 남아 있던 엔터값을 nextLine이 바로 소모시켜 입력이 넘어가게 된다.
		
		System.out.print("자기소개>");
		scan.nextLine();	// nextDouble에 남아 있던 엔터값을 미리 소모시켜 다음 입력을 기다리게 만든다.
		String intro = scan.nextLine(); // 공백을 포함한 문자열을 받음
		
		System.out.println("너의 이름은 : " + name + ", 나이는 : " + age );
		System.out.println("키 : " + cm + " cm");
		System.out.println("자기소개 : " + intro );
		
		// 3. 스캐너 종료
		scan.close();
	}
}

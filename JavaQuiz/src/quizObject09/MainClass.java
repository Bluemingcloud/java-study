package quizObject09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 */

		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		// 크기 2의 User 배열 생성
		User[] arr = new User[2];
		
		// User 객체 2개 생성
		User user1 = new User("김길동", 456456, 30);
		User user2 = new User("홍길동", 123456, 20);
		
		// User 배열에 2개의 객체 저장
		arr[0] = user1;
		arr[1] = user2;
		
		// 향상된 for문 사용 
		// getter 메서드로 모든 변수 출력
		for(User u : arr) {
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
		}

		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 
		 * 스캐너를 User 안에 쓰라는 뜻이 아닙니다.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		// 크기 5의 User 배열 생성
		User[] arr2 = new User[5];
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// while문 사용
		// setter 를 이용하여 Scanner로 입력받은 값 저장
		int i = 0;
		while(i < arr2.length) {
			arr2[i] = new User();
			arr2[i].setName(sc.nextLine());
			arr2[i].setRrn(sc.nextInt());
			arr2[i].setAge(sc.nextInt());
			sc.nextLine();	// 남아있는 엔터 값 소모
			i++;
		}
		
		// Arrays.toString(배열) 사용하여 배열 출력
		System.out.println(Arrays.toString(arr2));	
		
		
		// 생성자로 바로 생성
		User[] arr3 = new User[5];
		
		for(int j = 0; j < arr3.length; j++) {
			arr3[j] = new User(sc.next(), sc.nextInt(), sc.nextInt());
		}
		sc.close();
		for(User u : arr3) {
			System.out.println(u.getName() + "-" + u.getRrn() + "-" + u.getAge());
		}	
	}
}

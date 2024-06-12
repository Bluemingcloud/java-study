package quizObject18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	public static void main(String[] args) {
		
		// 간단한 회원정보 관리 프로그램
		/*
		 메뉴에 따라서 기능이 나뉘는 프로그램을 작성하세요
		 1. 스캐너로 이름, 나이를 입력받아서 User객체에 저장하고, 리스트에 하나추가
		 2. list 안에 저장된 모든 회원정보를 반복문으로 출력
		 3. 찾을 이름을 입력받아서, 이름이 있다면 이름과 나이를 출력합니다.
		 	단, 찾는 이름이 없으면 이름 + "님은 없습니다." 를 출력
		 4. 삭제할 이름을 입력받아서 동일한 이름을 가진 User객체를 리스트에서 삭제합니다.
		  	단, 첫번째로 찾은 User객체만 삭제
		 */
		Scanner sc = new Scanner(System.in);
		
		// 값을 저장할 리스트
		List<UserVO> list = new ArrayList<>();
		
		// 회원정보 관리 프로그램 시작
		while(true) {
			// 입력이 정수인 경우만 실행하기 위해 try catch 문 사용
			try {
				System.out.println("------------------------------------------------------------------------");
				System.out.println("[1.회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료]");
				System.out.print("메뉴>");
				// menu 에 입력받은 값 저장
				int menu = sc.nextInt();	
							
				switch (menu) {
				// menu 값에 따른 다른 기능실행을 위한 switch문
				case 1:
				// 1 을 입력 받은 경우 회원 등록
					
					System.out.println("1. 회원 등록");
					System.out.print("이름>");
					// 입력받은 값을 name 에 저장
					String name = sc.next();
					System.out.println("이름 : " + name);
					
					System.out.print("나이>");
					// 입력받은 값을 age 에 저장
					int age = sc.nextInt();
					System.out.println("나이 : " + age);
					
					// 입력받은 name, age 값으로 UserVO 객체 생성과 list 에 저장
					list.add(new UserVO(name, age));
					
					System.out.println("회원이 등록 되었습니다.");
					break;

				case 2:
				// 2 를 입력 받은 경우 회원 전체보기
					
					// 아직 등록한 회원이 없는 경우 탈출
					if(list.size() == 0) {
						System.out.println("회원이 없습니다.");
						break;
					}
					
					System.out.println("2. 회원 전체보기");
					
					// 향상된 for문으로 회원 정보 출력 반복
					for(UserVO user : list) {
						System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
					}
					break;
					
				case 3:
				// 3 을 입력 받은 경우 회원 정보검색
					
					// 아직 등록한 회원이 없는 경우 탈출
					if(list.size() == 0) {
						System.out.println("회원이 없습니다.");
						break;
					}
					
					System.out.println("3. 회원 정보검색");
					System.out.println("검색할 회원의 이름을 입력하세요.");
					System.out.print("이름>");
					// 입력받은 이름을 targetName 에 저장
					String targetName = sc.next();
					
					// 일치하는 이름이 없으면 flag = true;
					boolean flag = true;
					
					for(UserVO user : list) {
						// 이름과 일치하면 정보 출력
						if(user.getName().equals(targetName)) {
							System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
							// 일치하는 이름이 있으므로 flag = false;
							flag = false;
							// 정보출력 후 바로 for문 탈출
							// 같은 이름이 있을 수 있다!
//							break; 
							
						}
					}
					
					// 일치하는 정보가 없으면 동작 (flag = true;)
					if(flag) {
						System.out.println(targetName + "님은 없습니다.");
					}				
					break;
					
				case 4:
				// 4 를 입력받은 경우 회원 정보삭제
					
					// 아직 등록한 회원이 없는 경우 탈출
					if(list.size() == 0) {
						System.out.println("회원이 없습니다.");
						break;
					}
					
					System.out.println("4. 회원 정보삭제");
					System.out.println("삭제할 회원의 이름을 입력하세요.");
					System.out.print("이름>");
					// 입력받은 이름을 removeName 에 저장
					String removeName = sc.next();
					
					// 일치하는 이름이 없으면 flag2 = true;
					boolean flag2 = true;
					
					for(int i = 0; i < list.size(); i++) {
						if(list.get(i).getName().equals(removeName)) {
						// 일치하는 이름이 있으면 remove
							list.remove(i);
							System.out.println(removeName + "님의 정보가 삭제되었습니다.");
							// 일치하는 이름이 있으므로 flag2 = false;
							flag2 = false;
							// 정보 삭제 후 바로 for문 탈출
							break;
						}
					}		
					
					// 일치하는 이름이 없는 경우 동작 (flag = true;)
					if(flag2) {
						System.out.println(removeName + "님은 없습니다.");
					}
					break;
					
				case 5:
				// 5 를 입력받은 경우 프로그램 종료
					
					System.out.println("프로그램이 종료됩니다.");
					System.out.println("------------------------------------------------------------------------");
					
					// while 문 탈출
					break;
					
				default:
				// menu 로 입력 받은 값이 1 부터 5 가 아닌 경우
					
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
					break;
				}	
				
			} catch (InputMismatchException e) {
				
				// 정수가 아닌 경우의 에러 처리
				System.out.println("정수를 입력하세요");
				sc.nextLine();
			}	
					
		}

	}
}
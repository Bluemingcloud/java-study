package quizObject05;

import java.util.Scanner;

public class MyAccount extends Account {
	
	MyAccount() {
	}
	
	MyAccount(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}
	
	// 비밀번호를 Scanner 로 입력 받고 
	// 비밀번호가 일치하지 않으면 return;
	// 비밀번호가 일치하면 
	//    남은 잔액 balance(부모 클래스의 변수) 보다 
	//    money가 적을 때만 인출 가능
	@SuppressWarnings("resource")
	void withDraw(int money) {
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요>");
		String pw = scan.nextLine();        // 비밀번호를 Scanner 로 입력
		
		if(pw.equals(password) != true) {   // 비밀번호 일치 여부 확인
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;                           // return 으로 종료.
		}
		
		if(balance >= money) {              // 잔액 보다 적은 금액이면 인출
			balance -= money;			
		} else {
			System.out.println("잔액부족");   // 잔액 보다 많은 금액이면 "잔액부족" 출력
		}		
	}
	
	// 입금기능
	// 입금시 비밀번호를 확인한다.
	// 입금 할 금액을 출력하고, Y / N 으로 확인을 받는다.
	// Y 혹은 N 입력시에만 입금 혹은 취소를 출력하고
	// 다른 입력을 받으면 Y / N 을 입력 받을때 까지 반복한다.
	// 무한 반복을 방지하기 위해 0 을 입력 받으면 return 한다.
	@SuppressWarnings("resource")
	void deposit(int money) {
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요>");
		String pw = scan.nextLine();      // 비밀번호 입력
		
		if(pw.equals(password) != true) { // 비밀번호 일치 여부 확인.
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println(money + "원을 입금합니다.");
		
		while(true) {                     // 입금 동의 여부 반복.
			System.out.print("Y / N >");
			String chk = scan.next();       // 입금 동의 여부 확인.
			
			if(chk.equals("0")) {            // 0 입력시 return
				return;
			}
			
			if(chk.equals("Y") | chk.equals("y")) { // Y / N 혹은 다른 입력인지 확인.
				balance += money;
				System.out.println("입금되었습니다.");
				return;
			} else if(chk.equals("N") | chk.equals("n")) {
				System.out.println("입금을 취소합니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
			// if else 구문은 무조건 각각의 실행문 중 하나는 실행한다.		
		}
//		scan.close();
	}
}

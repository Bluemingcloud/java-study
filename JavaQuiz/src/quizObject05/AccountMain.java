package quizObject05;

public class AccountMain {
	
	public static void main(String[] args) {
		/*
		길동이는 Account를 상속받는 나의계좌를 만드려고 한다.
		기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.
		
		1. Account를 상속받고
		withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
		금액을 감소시키려고 한다.
		또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
		withDraw() 메서드를 오버라이딩 해주세요.
		
		
		2. deposit 입금기능은 자유롭게 오버라이딩 해보세요.
		
		*/
		
		MyAccount newAcc = new MyAccount("홍길동", "54321", 5000);
		
		int bal2 = newAcc.getBalance();		
		System.out.println(newAcc.name + "님의 계좌 잔액은: " + bal2 + "원 입니다.");
		System.out.println("-----------------------------------------------------");
		
		newAcc.withDraw(2000);
		bal2 = newAcc.getBalance();
		System.out.println(newAcc.name + "님의 계좌 잔액은: " + bal2 + "원 입니다.");
		System.out.println("-----------------------------------------------------");
		
		newAcc.deposit(3000);	
		bal2 = newAcc.getBalance();
		System.out.println(newAcc.name + "님의 계좌 잔액은: " + bal2 + "원 입니다.");
		
	}

}

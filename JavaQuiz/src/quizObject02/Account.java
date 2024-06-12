package quizObject02;

public class Account {
	
	String name;
	String password;
	int balance;
	
	Account() {
		
	}

	Account(String aName, String aPassword, int aBalance) {
		name = aName;
		password = aPassword;
		balance = aBalance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withDraw(int money) {
		if(balance >= money) {
			balance -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}		
	}
	
	int getBalance() {
		return balance;	// 클래스 외부에서 값을 가져갈 수 있게 한다.
	}
}

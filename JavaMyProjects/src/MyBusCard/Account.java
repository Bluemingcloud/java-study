package MyBusCard;

import java.util.Scanner;

public class Account {
	
	private static final int MAX_ATTEMPTS = 5;
	private static final int MAX_PASSWORD_LENGTH = 9;
	
	private double balance;
	private String password;
	private Scanner sc;
	
	public Account(String password, Scanner sc) {
		this.balance = 0;
		this.password = password;
		this.sc = sc;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public void setMoney(double balance) {
		this.balance = balance;
	}
	public void addMoney(double amount) {
		this.balance += amount;
	}
	public void subMoney(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	private boolean authenticateUser() {
		int attempts = 0;
		while(attempts < MAX_ATTEMPTS) {
			System.out.print("비밀번호를 입력하세요>");
			String pass = sc.nextLine();			
			if(this.password.equals(pass)) {
				return true;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				attempts++;
			}
		}
		System.out.println("비밀번호를 " + MAX_ATTEMPTS + "회 잘못 입력하였습니다.");
		return false;
	}
	
	public void resetPassword() {
		if(authenticateUser()) {
			String newPass = "";
			int attempts = 0;
			while(true) {
				if(attempts == MAX_ATTEMPTS) {
					System.out.println(MAX_ATTEMPTS + "회 잘못 입력하였습니다.");
					System.out.println("작업을 종료합니다.");
					return;
				}
				System.out.print("변경할 비밀번호를 입력하세요>");
				newPass = sc.nextLine();
				if(newPass.contains(" ")) {
					System.out.println("공백은 입력할 수 없습니다.");
				} else if(newPass.length() < MAX_PASSWORD_LENGTH) {
					System.out.println("비밀번호는 " + MAX_PASSWORD_LENGTH + "자 이상이여야 합니다.");
				} else {
					break;
				}
				attempts++;
			}
			
			attempts = 0;
			while(true) {
				if(attempts == MAX_ATTEMPTS) {
					System.out.println(MAX_ATTEMPTS + "회 잘못 입력하였습니다.");
					System.out.println("작업을 종료합니다.");
					return;
				}
				System.out.print("한번 더 입력하세요>");
				String chkPass = sc.nextLine();
				if(chkPass.equals(newPass)) {
					this.password = newPass;
					System.out.println("비밀번호가 변경되었습니다.");
					return;
				} else {
					System.out.println("일치하지 않습니다.");
					attempts++;
				}
			}
		}
	}
	
	public boolean depositMoney(double amount) {
		if(authenticateUser()) {
			addMoney(amount);
			System.out.println("입금되었습니다.");
			return true;
		} else {
			System.out.println("작업을 종료합니다.");
			return false;
		}
	}
	
	public boolean withdrawMoney(double amount) {
		if(authenticateUser()) {
			if(this.balance >= amount) {
				subMoney(amount);
				System.out.println("출금되었습니다.");
				return true;
			} else {
				System.out.println("잔액이 부족합니다.");
				return false;
			}
		} else {
			System.out.println("작업을 종료합니다.");
			return false;
		}
	}

}

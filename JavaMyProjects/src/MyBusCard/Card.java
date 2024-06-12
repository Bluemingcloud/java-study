package MyBusCard;

public class Card {
	
	private Account account;
	private String name;
	private double payment;
	private double payBack;
	
	public Card(String name, Account account) {
		this.account = account;
		this.name = name;
		this.payment = 0;
		this.payBack = 0;
	}
	
	public String getName() {
		return this.name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public double getPayment() {
		return this.payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public void addPayment(double payment) {
		this.payment += payment;
	}
	
	public double getPayBack() {
		return payBack;
	}
	public void setPayBack(double payBack) {
		this.payBack = payBack;
	}
	public void addPayBack(double payBack) {
		this.payBack += payBack;
	}
	
	public void useCard(int fare) {
		account.subMoney(fare);
		System.out.println(name + " 입니다.");
		System.out.println(fare + " 원");
	}
	
	public void doPay() {
		account.subMoney(payment);
		setPayment(0);
	}
	public void doPayBack() {
		account.addMoney(payBack);
		setPayBack(0);
	}
	

}

package MyBusCard;

public class TMoneyCard extends Card {
	
	private static int CARD_PREPAID_TMONEYCARD = 100000;
	private static String DEFAULT_CARD_NAME = "티머니 교통카드";
	private int tMoney;
	
	public TMoneyCard(String name, Account account) {
		super(name, account);
		if(account.withdrawMoney(CARD_PREPAID_TMONEYCARD)) {
			tMoney = CARD_PREPAID_TMONEYCARD;
		} else {
			tMoney = 0;
		}
	}
	
	public TMoneyCard(Account account) {
		this(DEFAULT_CARD_NAME, account);
	}
	public int getTMoney() {
		return tMoney;
	}
	public void addTMoney(double amount) {
		Account acc = getAccount();
		if(acc.withdrawMoney(amount)) {
			setAccount(acc);
			tMoney += amount;
		}
	}
	private void subTMoney(int amount) {
		this.tMoney -= amount;
	}
	
	@Override
	public void useCard(int fare) {
		if(tMoney >= fare) {
			subTMoney(fare);
			System.out.println(getName() + " 입니다.");
			System.out.println(tMoney + " 원");
		} else {
			System.out.println("잔액이 부족합니다.");
		}		
	}
	

}

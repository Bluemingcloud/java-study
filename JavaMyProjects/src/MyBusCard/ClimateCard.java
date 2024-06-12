package MyBusCard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClimateCard extends Card {
	
	private static final int CARD_PREPAID_CLIMATECARD = 62000;
	private static final String DEFAULT_CARD_NAME = "기후동행카드";
	private LocalDate expireDate;
	private DateTimeFormatter dateFormatter;
	
	public ClimateCard(String name, Account account) {
		super(name, account);
		account.subMoney(CARD_PREPAID_CLIMATECARD);
		this.expireDate = LocalDate.now().plusMonths(1).minusDays(1);
		this.dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); 
	}
	public ClimateCard(Account account) {
		this(DEFAULT_CARD_NAME, account);
	}
	
	@Override
	public void useCard(int fare) {
		System.out.println(getName() + " 입니다.");
		System.out.println("만기일 : " + expireDate.format(dateFormatter));
	}
}

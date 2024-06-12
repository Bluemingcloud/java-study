package MyBusCard;

public class PostPaidCard extends Card {

	private static String DEFAULT_CARD_NAME = "후불교통카드";
	private int count;
	
	public PostPaidCard(String name, Account account) {
		super(name, account);
		count = 0;
	}
	
	public PostPaidCard(Account account) {
		this(DEFAULT_CARD_NAME, account);
	}
	
	@Override
	public void useCard(int fare) {
		count++;
		addPayment(fare);
		System.out.println(getName() + " 입니다.");
		System.out.println(count * fare + " 원");
	}

}

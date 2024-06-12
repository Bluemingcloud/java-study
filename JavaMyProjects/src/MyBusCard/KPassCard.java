package MyBusCard;

public class KPassCard extends Card {
	
	private static final int MIN_USE_COUNT = 15;
	private static final int MAX_USE_COUNT = 60;
	private static final String DEFAULT_CARD_NAME = "K-Pass";
	private int useCount;
	private int age;
	
	public KPassCard(int age, String name, Account account) {
		super(name, account);
		useCount = 0;
		this.age = age;		
	}	
	public KPassCard(String name, Account account) {
		this(0, name, account);
	}
	public KPassCard(Account account) {
		this(0, DEFAULT_CARD_NAME, account);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public void useCard(int fare) {
		addPayment(fare);
		useCount++;		
		if(useCount >= MIN_USE_COUNT && useCount <= MAX_USE_COUNT) {
			double discount = useCount * fare * getDiscountRateByAge(age);
			addPayBack(discount);
		}	
		System.out.println(getName() + " 입니다.");
		System.out.println(useCount * fare + " 원");
		
	}
	
	private double getDiscountRateByAge(int age) {
		return (age >= 19 && age <= 34) ? 0.3 : 0.2;				
	}	


}

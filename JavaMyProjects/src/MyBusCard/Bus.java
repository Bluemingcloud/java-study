package MyBusCard;

public class Bus {
	
	private static final int BUS_FARE = 1400;
	private static final long TRANSFER_TIME_LIMIT = 30000;
	private static Bus bus = new Bus();
	private Card currentCard;
	private boolean transfer;
	private boolean onBoard;
	private long lastOffTime;
	
	private Bus() {
		transfer = false;
		onBoard = false;
		lastOffTime = System.currentTimeMillis();
	}
	public static Bus getBus() {
		return bus;
	}
	
	public Card getCurrentCard() {
		return currentCard;
	}
	private void setCurrentCard(Card card) {
		this.currentCard = card;
	}
	
	public boolean isTransfer() {
		return transfer;
	}
	private void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
	
	public boolean isOnBoard() {
		return onBoard; 
	}
	private void setOnBoard(boolean onBoard) {
		this.onBoard = onBoard;
	}
	
	public static void boardBus(Card card) {
		if(bus.isOnBoard()) {
			System.out.println("이미 탑승중입니다.");
			return;
		}
		
		if(System.currentTimeMillis() - bus.lastOffTime >= TRANSFER_TIME_LIMIT) {
			bus.setTransfer(false);
		}
		
		if(!bus.isTransfer() || !bus.checkCard(card)) {
			bus.setCurrentCard(card);
			card.useCard(BUS_FARE);
		} else {
			System.out.println("환승입니다.");
		}
		bus.setOnBoard(true);
	}
	
	public static void getOffBus(Card card) {
		 if(bus.checkCard(card) && bus.isOnBoard()) {
			 System.out.println("하차입니다.");
			 bus.setTransfer(true);
			 bus.setOnBoard(false);
			 bus.lastOffTime = System.currentTimeMillis();
		 } else {
			 System.out.println("잘못된 카드사용입니다.");
		 }
	}
	
	private boolean checkCard(Card card) {
		return bus.currentCard != null && bus.currentCard.getName().equals(card.getName());
	}
	
}

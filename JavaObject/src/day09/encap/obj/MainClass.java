package day09.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Chef chef = new Chef();
		Hotel hotel = new Hotel(chef);
		
		Hotel hotel2 = new Hotel(new Chef());
		
		// setter
		Chef chef2 = new Chef();
		hotel.setChef(chef2);
		
		// getter
		Chef c = hotel.getChef();
		
		c.cooking();		
	}
}

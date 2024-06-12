package quizObject06;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("그랜져", 50);
		Car c2 = new Car("소나타");
		
		c1.run();
		System.out.println("--------");
		c2.run();
		
		c1.info();
		c2.info();
	}
}

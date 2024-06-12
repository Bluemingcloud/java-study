package quizObject07;

public class MainClass {
	
	public static void main(String[] args) {
		
		SuperSonicAp sup = new SuperSonicAp("초음속비행기");
		System.out.println(sup.info());
		System.out.println("--------------------");
		
		sup.takeOff();
		System.out.println("--------------------");
		
		sup.fly();
		System.out.println("--------------------");
		
		sup.flyMode = 1;
		System.out.println(sup.info());
		sup.fly();
		System.out.println("--------------------");
		
		sup.flyMode = 0;
		sup.fly();
		System.out.println("--------------------");
		
		sup.land();
		
	}
}

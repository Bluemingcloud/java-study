package day07;

public class PenMain {
	
	public static void main(String[] args) {
		
		// 클래스명 변수명 = new 클래스명();
		Pen black = new Pen();
		
		black.ink = "black";
		black.price = 2000;
		black.company = "모나미";
		
		black.info();
		
		Pen red = new Pen();
		
		red = black;
		
		red.ink = "red";
		red.info();
		red.write();
		
		
		System.out.println("------------");
		Variable v = new Variable();
		v.printNum(10);
		
		System.out.println("------------");
		v.a = 20;
		v.printNum(5);
		
		
		
	}

}

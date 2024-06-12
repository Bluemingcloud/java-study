package day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * 인터페이스로 선언하고
		 * 구현체에 따라서 다른 클래스가 호출된다.
		 * 객체 교환성을 높인다.
		 */
		Printed lgPrint = new LG();
		
		lgPrint.print("Hello world");
		lgPrint.colorPrint("LG 프린터기", "red");
		lgPrint.copy(5);
		
		System.out.println();
		
		Printed samPrint = new Samsung();
		
		samPrint.print("Hello world");
		samPrint.colorPrint("Samsung 프린터기", "blue");
		samPrint.copy(5);
		
	}

}

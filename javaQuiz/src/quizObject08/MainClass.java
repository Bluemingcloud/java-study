package quizObject08;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(2025);
		me.setYear(2024);
		
		int year = me.getYear();
		System.out.println("년도 : " + year);
		
		me.setMonth(15);
		me.setMonth(12);
		
		me.setDay(32);
		me.setDay(31);
		
		me.setSsn("testssgn-dfvwd12312");
		me.setSsn("241231-3012345");
		
		me.info();		
	}
}

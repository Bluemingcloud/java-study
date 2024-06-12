package day07;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone red = new Phone();	// new 생성자();
		
		red.info();		
		
		Phone blue = new Phone("파랑");
		
		blue.info();
		
		Phone white = new Phone("흰색", 1000000);
		
		white.info();
		
		Phone black = new Phone(1000000, "검정");
		
		black.info();
		
		Phone custom = new Phone("아이보리", 1200000, "갤럭시S24");
		
		custom.info();
		
	}
}

package quizObject11;

public class MainClass {
	
	public static void main(String[] args) {
		// MyCart 객체 생성
		MyCart mycart = new MyCart(5000);
		
		// Radio, Computer, Tv 객체를 Product 로 생성
		Product radio = new Radio();
		Product com = new Computer();
		Product tv = new Tv();
		
		// buy() 메서드 실행
		mycart.buy(radio);
		mycart.buy(tv);
		mycart.buy(com);
		
		// info() 메서드로 결과 출력
		mycart.info();	
		
		System.out.println("--------------------");
		
		// 잔액부족 확인
		MyCart mycart2 = new MyCart(100);
		
		mycart2.buy(tv);
		System.out.println("--------------------");
		
		// 메서드 매개변수로 바로 객체 사용가능
		MyCart mycart3 = new MyCart(10000);
		mycart3.buy(new Computer());
		mycart3.buy(new Computer());
		mycart3.buy(new Radio());
		mycart3.buy(new Tv());
		mycart3.buy(new Tv());
		mycart3.buy(new Tv());
		
		mycart3.info();
	}
}

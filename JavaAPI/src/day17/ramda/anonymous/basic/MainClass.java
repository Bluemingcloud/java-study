package day17.ramda.anonymous.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car car = new Tico();
		car.run();
		
		// 매번 Car 인터페이스를 구현한 클래스가 달라져야한다면?
		// 익명객체 문법으로 사용
		
		Car car2 = new Car() {
			@Override
			public void run() {
				System.out.println("마이 뉴 카~");
			}
		};
		
		car2.run();
		
		Car car3 = new Car() {
			@Override
			public void run() {
				System.out.println("유어 뉴 카~");				
			}
		};
		
		car3.run();
		
		System.out.println("----------------------------------");
		
		// Tv에 있는 리모컨 사용하기
		Tv tv = new Tv();
		
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
	}
}

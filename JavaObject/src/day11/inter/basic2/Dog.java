package day11.inter.basic2;

public class Dog extends Animal implements IPet {
	//			 상속받을 클래스 다음 구현할 인터페이스 
	@Override
	public void eating() {
		System.out.println("멍멍이 밥 묵자");
	}	
	@Override
	public void playing() {
		System.out.println("멍멍이는 밖에서 놀아요");
	}
}

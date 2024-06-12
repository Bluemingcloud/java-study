package day11.abstract_.good;

public class MainClass {
	
	public static void main(String[] args) {
		// 추상 클래스는 객체생성이 안된다.
//		Store s = new Store();
		
		// 객체 추상화 
	    // 추상 클래스를 사용하려면 자식으로 생성해서, 부모 타입에 저장
//		SeoulStore s = new SeoulStore();
		Store s1 = new SeoulStore();	// 다형성 - 객체 추상화
		
		// Overriding 된 메서드 실행.
		s1.apple();
		s1.melon();
		s1.orange();
		
		// 상속 받은 일반 메서드 실행.
		s1.mango();
		System.out.println(s1.getName());
		
		System.out.println("----------------------------");
		
		Store s2 = new BusanStore();
		s2.apple();
		s2.melon();
		s2.orange();		
		
	}

}

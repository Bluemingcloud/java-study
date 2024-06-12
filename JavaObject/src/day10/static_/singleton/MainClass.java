package day10.static_.singleton;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Singleton s = new Singleton(); // 외부에서 객체 생성 불가
		
		// 3번의 getInstance() 로 객체를 끄집어 낸다.
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s2);		// true
		
		System.out.println(s.getName());
		System.out.println(s2.getName());
		
	}

}

package day17.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		// 익명객체 사용
		Person p = new Person();
		// 매개변수가 없는 Say01 의 메서드
		p.greeting(new Say01() {
			@Override
			public void talking() {
				System.out.println("Hi!");
			}
		});
		// 매개변수가 있는 Say02 의 메서드
		p.greeting(new Say02() {
			@Override
			public String talking(String word) {
				return word + ": Hello?";
			}
		});
		
		// 람다식
		Person pp = new Person();
		// 매개변수가 없는 Say01 의 메서드
		pp.greeting(() -> {
			System.out.println("안녕하세요!");
		});
		// 매개변수가 있는 Say02 의 메서드
		// String word 는 Person 의 "그의 인사법"
		pp.greeting((String word) -> {
			return word + ": 반갑습니다";
		});
		
		// 특징
		Person ppp = new Person();
		// 매개변수의 타입은 생략 가능
//		ppp.greeting((word) -> {
//			return word + ": ppp의 인사법 입니다.";
//		});
		
		// 매개변수가 한개라면 소괄호() 생략가능
//		ppp.greeting(word -> {
//			return word + ": 매개변수가 하나라 소괄호 생략";
//		});
		
		// 실행구문이 하나라면 중괄호{} 생략 가능
//		ppp.greeting(word -> return word + ": 한줄 중괄호 생략");
		
		// 한줄 구문으로 적었을 때 return 생략가능
		ppp.greeting(word -> word + ": 한줄 구문 return생략");
		
		Person p1 = new Person();
		
		// 람다식으로 calculating() 호출
		// 기능 - int의 개수만큼 word 문자열 합을 반환
		p1.calculating((i, word) -> {
			String result = "";
			while(i-- > 0) result += word;
			return result;
		});		
	}
}

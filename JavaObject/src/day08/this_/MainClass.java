package day08.this_;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();					// 나의 이름은? : day08.this_.Person@7c30a502
		System.out.println("나의 이름은? : " + p);	// 나의 이름은? : day08.this_.Person@7c30a502
		// this 는 나 의 주소값
		System.out.println(p.info());				// 이름 : 이름없음, 나이 : 1
		
		Person p1 = new Person();
		// 기본 생성자 호출
		Person p2 = new Person("홍길동");
		// name 만 매개변수로 받는 생성자를 호출
		Person p3 = new Person(20);
		// age 만 매개변수로 받는 생성자를 호출
		Person p4 = new Person(20,"홍길동");
		// age, name 순서로 매개변수를 받는 생성자가 호출됨.

		
		// name 과 age 를 매개변수로 받는 생성자가 호출됨.
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		System.out.println(p4.info());

	}

}

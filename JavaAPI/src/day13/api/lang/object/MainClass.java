package day13.api.lang.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object 클래스의 메서드들
		 * 1. equals() : 동일객체인지 확인. boolean 타입 반환
		 * 2. toString() : 객체주소를 문자열로 반환 - 오버라이딩해서 많이 사용함.
		 * 			자주 사용되는 메서드
		 * 3. hashCode() : 객체의 (거의)고유한 숫자값 반환
		 * 4. clone() : 객체를 복사 protected -> 반드시 오버라이딩 하여 사용하도록 protected로 만듬
		 * 5. finallize() : 객체가 소멸되기 전에 실행되는 메서드 중 하나. - deprecated 됨(버전이 업그레이드 되어 사용할 필요 없음을 나타낸다.)
		 */
		
		Person a = new Person("홍길동");
		Person b = new Person("홍길동");

		// Person 에 equals() 란 메서드가 없지만 사용이 가능하다
		// Person 이 자동적으로 Object 클래스를 상속받기 때문
		// equals() 는 Object 클래스의 메서드
		boolean result = a.equals(b);
		System.out.println("같은객체:" + result);
		
		result = a.equals(a);
		System.out.println("같은객체:" + result);
		// equals() 를 오버라이딩 시켜보기
		
		System.out.println(a.toString());
		
		// hashCode()
		System.out.println("중복이 없는 고유한 숫자값:" + a.hashCode());
		System.out.println("중복이 없는 고유한 숫자값:" + b.hashCode());
		

		// clone()
		// 그냥 사용시 CloneNotSupportedException 에러 발생
		// Cloneable 인터페이스 implements 해야한다.
		// Cloneable 인터페이스 : 내용이 없는 인터페이스 -> 클론생성 가능하다는 명시를 하기 위함
		try {
			Object clone = a.clone();
			System.out.println("복제된객체:" + clone.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// finallize()
		// Garbage Collector 가 순서를 보장하지 않기 때문에 권장하지 않음
		// (언제 사용될지 모른다.)
		a = null;
		b = null;
		System.gc();	// Garbage Collector 호출
		
	}
}

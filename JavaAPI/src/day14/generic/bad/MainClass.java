package day14.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object형은 무엇이든 저장할 수 있으나,
		 * 값을 사용할 때 올바른 타입으로 형변환을 진행해야 한다.
		 */
		
		// 저장을 문자열
		ABC abc = new ABC();
		abc.setObj("홍길동");
		
//		String str = (Integer)abc.getObj();
		String str = (String)abc.getObj();
		
		// 저장을 Person
		abc.setObj(new Person());
		Person p = (Person)abc.getObj();
	}

}

package day14.generic.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 무엇이든 저장가능한 상자
//		ABC abc = new ABC(); 
		
		// 문자열을 저장하는 상자
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동");
		String name = abc.getT();
		
		// Person을 저장하는 상자
		ABC<Person> abc2 = new ABC<>();	// 뒤 <> 타입생략가능
		
		abc2.setT(new Person());
		Person p = abc2.getT();		
		
		// <>는 객체타입만 사용가능
//		ABC<int> abc3 = new ABC<>();
		ABC<Integer> abc3 = new ABC<>();
		abc3.setT(5);
		int a = abc3.getT();
		
		// 멀티제네릭 객체 생성
		DEF<Integer, String> def = new DEF<>();
		
		def.put(1, "홍길동");
		System.out.println(def.get(1));
		
	}
}

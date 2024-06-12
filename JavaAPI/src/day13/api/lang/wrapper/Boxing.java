package day13.api.lang.wrapper;

public class Boxing {
	public static void main(String[] args) {
		
		// wrapper 란? 
		// 기본 타입의 객체 타입을 wrapper 클래스 라고 한다.
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		// Boxing 
		// 기본타입을 객체타입으로 변환
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		
		System.out.println(val1);
		
		// wrapper 는 Object의 자식 클래스
		// 부모 클래스에 저장 가능
		Object[] arr = {val1, val2, val3, val4};
		
		// Umboxing
		// 객체타입을 기본타입으로 변환
		a = val1.intValue();
		b = val2.doubleValue();
		c = val3.charValue();
		d = val4.booleanValue();
		
		System.out.println("----------------------------");
		
		// Auto Boxing - 자동 형변환
		// int 타입을 wrapper 인 Integer 타입에 저장
		Integer x = 100;
		// double 타입을 wrapper 인 Double 타입에 저장
		Double y = 3.14;
		
		// wrapper 인 Integer 타입을 기본 타입 int 타입에 저장
		int v1 = x;
		
		// wrapper 인 Double 타입을 기본 타입 double 타입에 저장
		double v2 = y;
		
		System.out.println("----------------------------");
		
		// 가장 많이 쓰이는 기능
		// wrapper.parse기본타입
		// 문자열을 원하는 기본타입으로 변환

		int aa = Integer.parseInt("100");
		// 문자열에 기본타입과 다른 값이 있으면 NumberFormatException 에러
//		int bb = Integer.parseInt("백");
//		int cc = Integer.parseInt("3백");
		
		double dd = Double.parseDouble("3.14");
		long ll = Long.parseLong("102030");
		
		System.out.println(aa + dd + ll);
		
		
		
		
		
	}
}

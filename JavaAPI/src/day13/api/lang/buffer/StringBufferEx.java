package day13.api.lang.buffer;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		// 빠른 문자열
		// StringBuffer, StringBuilder
		
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		
		System.out.println(str);
		System.out.println(sb);
		
		// 차이점
		// 문자열을 더할 때
		str = str + "자바";	// "Java 자바" 라는 새로운 문자열 객체 생성 후 대입
		
		// 마지막에 추가
		sb.append("자바"); 
		
		System.out.println(str);
		System.out.println(sb);
		
		// 중간에 추가
		sb.insert(5, "Hello ");
		System.out.println(sb);
		
		// 문자열 변경
		sb.replace(5, 10, "안녕");
		System.out.println(sb);
		
		// 문자열 삭제
		sb.delete(0, 5);
		System.out.println(sb);
		
		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		
		// 빠른문자열을 문자열로 형변환		
		System.out.println(sb.equals("안녕 자바"));
		System.out.println(sb.toString().equals("안녕 자바"));
		

	}

}

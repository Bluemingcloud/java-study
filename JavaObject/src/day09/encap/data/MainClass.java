package day09.encap.data;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		// Member 객체를 2개 만듬
		Member m = new Member("홍길동", 20, "naver", "서울시", "010");
		
		Member m2 = new Member();
		
		m2.setName("이순신");
		m2.setAge(20);
		m2.setEmail("google");
		m2.setAddr("경기도");
		m2.setPhone("010");
		
		// 객체 배열
		// Member 객체의 배열 생성
		Member[] arr = new Member[2];
		arr[0] = m;
		arr[1] = m2;
		
		System.out.println(Arrays.toString(arr));
		// [day09.encap.data.Member@7c30a502, day09.encap.data.Member@49e4cb85]
		// [주소값1, 주소값2]
		
		// 객체배열을 순회
		for(int i = 0; i < arr.length; i++) {
			Member member = arr[i];
			System.out.println(member.getName());
			System.out.println(member.getAge());
		}
	}
}

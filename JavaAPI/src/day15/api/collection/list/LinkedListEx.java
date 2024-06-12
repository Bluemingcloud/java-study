package day15.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		// ArrayList 와 사용방법이 동일함.
		
		// 값의 추가
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");	
		
		System.out.println(list.toString());
		
		// 값 얻기
		System.out.println("get()");
		String n = list.get(1);
		System.out.println("1번째 요소 값 : " + n);
		
		System.out.println();
		// 값 수정
		System.out.println("set()");
		System.out.println("before : " + list.toString());
		list.set(1, "수정할래!");
		System.out.println("after : " + list.toString());
		
		System.out.println();
		// 값 삭제
		System.out.println("remove");
		System.out.println(list.toString());
		list.remove("홍길동");
		System.out.println(list.toString());
	}

}

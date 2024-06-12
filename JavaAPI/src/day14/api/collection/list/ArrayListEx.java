package day14.api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<>();
		
		// 보통 List 인터페이스 타입에 담아 사용
		List<String> list = new ArrayList<>();
		
		// add()
		// List 에 값 추가
		list.add("java");
		list.add("jsp");
		list.add("git");
		list.add("database");
		list.add("java");	// 동일한 값도 중복 저장 가능
		list.add("python");
		
		// size()
		// List 의 크기
		System.out.println("size()");
		System.out.println("크기 : " + list.size());
		
		System.out.println();		
		// toString()
		// List 를 문자열로
		System.out.println("toString()");
		System.out.println(list.toString());
		
		System.out.println();
		// add(index, 데이터)
		// List 중간에 값 추가
		System.out.println("add(index, 데이터)");
		list.add(2, "홍길동");
		System.out.println(list.toString());
		
		System.out.println();
		// set()
		// List 값 수정
		System.out.println("set()");
		list.set(2, "수정됨!");
		System.out.println(list.toString());
		
		System.out.println();
		// get()
		// List 값을 얻기
		// 값이 삭제 되는건 아니다
		System.out.println("get()");
		String s = list.get(0);
		System.out.println("List 0번째 값 : " + s);
		
		System.out.println();
		// remove()
		// List 값 삭제
		System.out.println("remove()");
		String s2 = list.remove(2);
		System.out.println(s2 + " 값을 지웠습니다. : " + list.toString());
		
		// 반환 값을 저장하지 않아도 된다.
		list.remove("java");
		System.out.println("java 를 지웠습니다. : " + list.toString());
		
		System.out.println("--------------------------------");
		
		// Arrays.asList()
		// 배열로 리스트 빨리 만들기
//		List<String> newList = Arrays.asList({"a", "b", "c", "d", "e"});
		System.out.println("Arrays.asList()");
		
		String[] arr = {"a", "b", "c", "d", "e"};
		List<String> newList = Arrays.asList(arr);
		
		System.out.println(newList.toString());
		
		System.out.println();
		// addAll()
		// List 병합
		// Collection 인터페이스 타입 객체를 매개변수로 받는다
		System.out.println("addAll()");
		list.addAll(newList);
		System.out.println(list.toString());
		
		System.out.println();
		// contains()
		// List 에 값의 포함여부 확인
		System.out.println("contains()");
		if(list.contains("c")) {
			System.out.println("c 는 리스트에 포함되어 있습니다.");
		}
		
		System.out.println();
				
	}
}

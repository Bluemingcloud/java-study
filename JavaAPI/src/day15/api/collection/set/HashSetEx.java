package day15.api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		// Set 생성
//		HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		// 값의 추가
		// add()
		set.add("java");
		set.add("spring");
		set.add("java");
		set.add("python");
		set.add("oracle");
		set.add("jsp");
		
		// Set 의 크기
		// size()
		System.out.println("size()");
		System.out.println("크기 : " + set.size());
		
		System.out.println();
		
		// Set 을 문자열로
		// toString()
		// 추가한 순서와 상관없이 저장된다.
		System.out.println("toString()");
		System.out.println(set.toString());
		
		System.out.println();
		
		// Set 의 값 확인
		// 순서가 없는 바구니 형태이기 때문에 get() 메서드가 없다.
//		set.get();
		
		// iterator()
		// Set 에 들어있는 값 전부 확인
		// iterator : 반복자
		// StringTokenizer 의 nextToken 과 유사(순서는 저장 순이 아님)
		System.out.println("iterator()");
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		
		// 혹은 향상된 for문
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// 값의 삭제
		// remove()
		// index로 삭제할 수 없다. 값을 입력해 일치하는 값의 데이터를 삭제한다.
		System.out.println("remove()");
		set.remove("java");
		System.out.println(set.toString());
		
		System.out.println();
		
		// 값의 포함여부
		// contains()
		// 일치하는 값이 있으면 true, 없으면 false 반환
		System.out.println("contains()");
		if(set.contains("java")) {
			System.out.println("java 가 포함되어 있다.");
		} else {
			System.out.println("java 가 포함되어있지 않다.");
		}
		
		System.out.println();
		
		// Set이 비어있는지 확인
		// isEmpty()
		System.out.println("isEmpty()");
		System.out.println(set.isEmpty());
		
	}

}

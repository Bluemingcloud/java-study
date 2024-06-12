package day15.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// HashMap 객체 생성
//		HashMap<K, V> map = new HashMap<K, V>();
		Map<Integer, String> map = new HashMap<>();
		
		// 값을 추가
		// put()
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길동");	// value 는 중복 가능
		map.put(4, "홍길자");
		map.put(5, "신사임당");
		
		// Map 의 크기
		// size()
		System.out.println("size()");
		System.out.println("Map 의 크기 : " + map.size());
		
		System.out.println();
		
		// Map 을 문자열로
		// toString()
		System.out.println("toString()");
		System.out.println(map.toString());
		
		System.out.println();
		
		// Map 에 같은 key 를 넣으면?
		// key 는 고유하다
		// 중복되는 key 를 새로 추가하는 것이 아닌
		// key 에 해당하는 값(value)을 수정한다.
		map.put(5, "강감찬");
		System.out.println(map.toString());
		
		System.out.println();
		
		// Map 의 값 얻기
		// get()
		// 반복문을 사용하여 key 와 일치하는 값 비교가 아닌
		// key 에 해당하는 value 를 바로 끄집어낸다.
		System.out.println("get()");
		String value = map.get(3);
		System.out.println("3번 key 에 해당하는 값 : " + value);
		
		System.out.println();
		
		// Map 의 포함 여부
		// key 포함 여부
		// containsKey()
		System.out.println("containsKey()");
		if(map.containsKey(3)) {
			System.out.println("3번 키는 존재합니다.");
		}
		
		System.out.println();
		
		// value 포함여부
		// containsValue()
		System.out.println("containsValue()");
		if(map.containsValue("이순신")) {
			System.out.println("이순신 값이 존재합니다.");
		}
		
		System.out.println();
		
		// Map 의 반복
		// Map 은 순서가 없다.
		// 순차적으로 돌리고 싶다면 
		// entrySet 을 이용해서 Set 으로 변경한 다음 사용한다.
		// entrySet()
		System.out.println("entrySet()");
		Set<Entry<Integer, String>> set = map.entrySet();
		
		for(Entry<Integer, String> entry : set) {
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
		
		System.out.println();
		// keySet()
		System.out.println("keySet()");
		Set<Integer> set2 = map.keySet();
		for(int key : set2) {
			System.out.println("키 : " + key + ", 값 : " + map.get(key));
		}		
		
	}

}

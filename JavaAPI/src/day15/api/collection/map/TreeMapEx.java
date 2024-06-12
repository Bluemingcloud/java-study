package day15.api.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		// TreeMap
		// 키의 정렬
//		TreeMap<Integer, String> map = new TreeMap<>();
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(10, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(5, "신사임당");
		
		System.out.println(map.toString());
		
		// 값 얻기
		System.out.println("3번 키에 해당하는 값 : " + map.get(3));
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// Map 은 Python 에서는 딕셔너리, JS 에서는 객체 라고 부른다.
		
	}

}

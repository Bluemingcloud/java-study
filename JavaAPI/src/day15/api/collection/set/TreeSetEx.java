package day15.api.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		// Set 특징 + 정렬
		// 사용방법은 HashSet 과 동일하다.
		
		Set<String> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		// 문자열은 사전 순
		// 숫자는 오름차순
		set.add("망아지");
		set.add("강아지");
		set.add("송아지");
		set.add("강아지");
		set.add("하마");
		
		set2.add(5);
		set2.add(3);
		set2.add(10);
		set2.add(7);
		set2.add(1);
		
		// 입력 순서와 상관없이 정렬되어있다.
		System.out.println(set.toString());
		System.out.println(set2.toString());
		
		System.out.println();
		
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println();
		
		for(int i : set2) {
			System.out.println(i);
		}
	}

}

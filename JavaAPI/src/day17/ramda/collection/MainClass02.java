package day17.ramda.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		// 리스트에 랜덤한 값을 저장
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		
		System.out.println("원본 : "  + list.toString());
		
		System.out.println("-------------------------------------------------");
		
		// 람다스트림 사용
		// 중간처리 메서드 -> 반환이 다시 Stream
		// distinct()
		// 중복 제거
		System.out.println("discinct()");
		list.stream().distinct().forEach(a -> System.out.print(a + " "));
		System.out.println();
		System.out.println();
		
		// collect() 
		// 다시 컬렉션으로 반환
		// Collectors.toList() : 요소들을 리스트 타입으로 반환
		System.out.println("collect()");
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.toString());
		System.out.println();
		
		// filter()
		// 원하는 값만 걸러내기
		System.out.println("filter()");
		System.out.println(list.stream()
				.distinct()
				.filter(t -> t % 2 == 0)
				.collect(Collectors.toList())
				.toString());
		System.out.println();
		
		// sorted()
		// 요소들을 정렬
		System.out.println("sorted()");
		System.out.println(list.stream()
				.distinct()
				.filter(t -> t % 2 == 0)
				.sorted()
				.collect(Collectors.toList())
				.toString());
		System.out.println();
		
		// map()
		// 리턴에 담긴 값으로 새로운 stream 생성
		System.out.println("map()");
		List<String> list2 = list.stream().map(a -> a % 2 == 0 ? "짝" : "홀").collect(Collectors.toList());
		System.out.println(list2.toString());
		
		System.out.println("------------------------------------------------------");
		
		/*
		 * 원본 List 를 가지고
		 * 중복은 제거하고, 65보다는 큰 수들만 정렬해서
		 * 이 값들을 아스키코드 문자로 변환하여 리스트로 생성
		 */
		List<Character> list3 = list.stream()
				.distinct()
				.filter(a -> a >= 65)
				.sorted()
				.map(a -> (char)a.intValue())
				.collect(Collectors.toList());
		System.out.println(list3.toString());
	}

}

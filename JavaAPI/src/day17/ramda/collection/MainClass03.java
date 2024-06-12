package day17.ramda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {

	public static void main(String[] args) {
		
		/*
		 * 스트림 타입
		 * Stream - 오리지널 스트림
		 * IntStream - 정수 스트림
		 * DoubleStream - 실수 스트림
		 * LongStream - long타입 스트림
		 * 
		 * 스트림 타입의 변환
		 * mapToXXX()
		 */
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		
		// mapToInt()
		// 정수형 스트림으로 형변환
		// 정수에서 사용할 수 있는 메서드 추가
		System.out.println("mapToInt()");
		System.out.println(list.stream().mapToInt(i -> i).boxed().collect(Collectors.toList()).toString());
		System.out.println();
		
		// count()
		// 요소의 갯수
		System.out.println("count()");
		long r1 = list.stream().mapToInt(i -> i).count();
		System.out.println("총 카운트 : " + r1);
		System.out.println();
		
		// sum()
		// 총 합
		System.out.println("sum()");
		int r2 = list.stream().mapToInt(i -> i).sum();
		System.out.println("총 합 : " + r2);
		System.out.println();
		
		// average()
		// 총 평균
		// 옵셔널 더블 타입 반환 -> getAsDouble() 메서드로 실제 더블 타입 값 반환
		System.out.println("average()");
		double r3 = list.stream().mapToInt(i -> i).average().getAsDouble();
		System.out.println("평균 : " + r3);
		System.out.println();
		
		// max()
		// 최대값
		// 옵셔널 인트 타입 반환 -> getAsInt() 메서드로 실제 정수 값 반환
		System.out.println("max()");
		int r4 = list.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println("최대 값 : " + r4);
		System.out.println();
		
		// min()
		// 최소값
		System.out.println("min()");
		int r5 = list.stream().mapToInt(i -> i).min().getAsInt();
		System.out.println("최소 값 : " + r5);
		System.out.println();
		
		// 배열에서 사용
		// Arrays.stream() 사용
		System.out.println("Arrays.stream()");
		int[] arr = {1, 40, 50, 23, 43, 70, 99, 94};
		int r6 = Arrays.stream(arr).min().getAsInt();
		System.out.println("최소 값 : " + r6);
		System.out.println();
		
		// boxed()
		// 오리지널 스트림으로 형변환
		System.out.println("boxed()");
		System.out.println("range()");
		List<Integer> list2 = IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list2.toString());
		System.out.println();
		
		System.out.println("rangeClosed()");
		List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list3.toString());
		System.out.println();
		
		
		
	}
}

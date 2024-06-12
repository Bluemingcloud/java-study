package day03;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 배열의 선언
		// 타입[] 이름;
		int[] arr;
		
		// 배열의 생성 - 생성할 때 크기를 지정
		// 이름 = new 타입[크기];
		// 상자의 위치 (인덱스)는 0 부터 시작
		arr = new int[5];
		
		System.out.println(arr); // 상자가 만들어진 위치 (주소값)가 출력
		
		// 배열의 초기화 - 상자에 값을 대입
		// 배열이름[인덱스번호] = 값;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;	// 없는 상자에 접근하면 err
		
		// 배열의 사용
		System.out.println( "배열의 첫번째 상자값 : " + arr[0] );
		
		arr[0] = 100;	// 첫번째 상자를 100으로 변경		
		System.out.println( "배열의 첫번째 상자값 : " + arr[0] );
		
		// 배열의 값을 한눈에 문자열로 보고싶을때
		// Arrays 라이브러리 사용
		System.out.println( Arrays.toString(arr) );
		
		// 배열의 길이 확인
		System.out.println( "배열의 길이 : " + arr.length );
		// 마지막 인덱스 = 배열의 길이 - 1
		System.out.println( "배열의 마지막 상자값 : " + arr[arr.length - 1] );
		
		System.out.println("-----------------------------------------------");
		
		// 배열의 선언과 생성을 동시에 하는 방법
		// 타입[] 배열이름 = new 타입[크기];
		int[] arr2 = new int[7];
		
		// 배열의 선언 생성 초기화를 동시에 하는 방법
		// 타입[] 배열이름 = {값,값, ....};
		byte[] arr3 = {1,2,3,4,5,6};
//		byte[] arr3 = new byte[] {1,2,3,4,5,6};	// 위와 같은 내용 
		
		System.out.println( Arrays.toString(arr3) );
		
		// 배열은 값을 지정하지 않으면(초기화를 하지 않으면), 기본값으로 초기화 된다.
		// int -> 0 , double -> 0.0, boolean -> false, String -> null
		System.out.println( Arrays.toString(arr2) );	// {0,0,0,0,0,0,0}
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * 문자열을 저장하는 크기가 7 배열을 생성하고
		 * 
		 * 월~일 까지 값을 저장
		 */
		String[] dayArr = {"월","화","수","목","금","토","일"};
		System.out.println( Arrays.toString(dayArr) );
		
		String[] dayArr2 = new String[7];
		dayArr2[0] = "월";
		dayArr2[1] = "화";
		dayArr2[2] = "수";
		dayArr2[3] = "목";
		dayArr2[4] = "금";
		dayArr2[5] = "토";
		dayArr2[6] = "일";
		System.out.println( Arrays.toString(dayArr2) );
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * arr 배열안의 값의 합계와 평균을 출력
		 */
		
		int arrSum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4]; 
		System.out.println("arr의 합계 : " + arrSum );
		System.out.println("arr의 평균 : " + arrSum/arr.length );
		System.out.println("arr의 평균 : " + (double)arrSum/arr.length );	// 실수로 나타내고 싶을때 - 한쪽을 double 로 캐스팅	
//		int arrSum;
//		System.out.println(arr.length); // arr의 길이 = 5
//		arrSum = arr[0];
//		arrSum += arr[1];
//		arrSum += arr[2];
//		arrSum += arr[3];
//		arrSum += arr[4];
		
		// for 문 활용
		int arrSum2 = 0;
		for (int i = 0; i<arr.length; i++) {		
			arrSum2 += arr[i];		
		}
		System.out.println(arrSum2);
		System.out.println(arrSum2/arr.length);
		
		// 메소드 생성 (isAdd) 활용
		int arrSum3 = isAdd(arr);
		System.out.println(arrSum3);
		System.out.println(arrSum3/arr.length);
	}	
	public static int isAdd(int[] array) {
		int sum = 0;
		for (int i = 0; i<array.length; i++) {		
			sum += array[i];
		}
		return sum;
	}
}

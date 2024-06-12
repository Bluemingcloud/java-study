package myArraysQuiz;

public class MainClass {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,2};
		String[] arr2 = {"a","c","acb","da"};
		char[] arr3 = {'c', 'a', 'b'};

		// .toString()
		System.out.println(MyArrays.toString(arr));
		System.out.println(MyArrays.toString(arr2));
		System.out.println(MyArrays.toString(arr3));
		
		// .copyOf()
		int[] arrInt2 = MyArrays.copyOf(arr, 2);
		System.out.println(MyArrays.toString(arrInt2));
		char[] arrChar2 = MyArrays.copyOf(arr3, 5);
		System.out.println(MyArrays.toString(arrChar2));
		String[] arrStr2 = MyArrays.copyOf(arr2, 7);
		System.out.println(MyArrays.toString(arrStr2));
		
		// .sort()
		int[] arrIntSort = MyArrays.sort(arr);
		System.out.println("int 배열 " + MyArrays.toString(arr) + " 을 정렬 : " + MyArrays.toString(arrIntSort));
		char[] arrCharSort = MyArrays.sort(arr3);
		System.out.println("char 배열 " + MyArrays.toString(arr3) + " 을 정렬 : " + MyArrays.toString(arrCharSort));
		String[] arrStrSort = MyArrays.sort(arr2);
		System.out.println("String 배열 " + MyArrays.toString(arr2) + " 을 정렬 : " + MyArrays.toString(arrStrSort));
		
		// .binarySearch()
		System.out.println("int 3의 인덱스 : " + MyArrays.binarySearch(arrIntSort, 3));
		System.out.println("char a 의 인덱스 : " + MyArrays.binarySearch(arrCharSort, 'a'));
		System.out.println("String c 의 인덱스 : " + MyArrays.binarySearch(arrStrSort, "c"));
		System.out.println("배열에 존재하지 않는 값의 반환 : " + MyArrays.binarySearch(arrIntSort, 4));
	}
}

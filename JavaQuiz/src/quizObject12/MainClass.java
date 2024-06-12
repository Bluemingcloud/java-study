package quizObject12;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		String[] arr2 = {"a","b"};
		char[] arr3 = {'a', 'b', 'c'};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));	
		
		System.out.println("--------------------");
		
		System.out.println(MyArrays.toString(arr));
		System.out.println(MyArrays.toString(arr2));
		System.out.println(MyArrays.toString(arr3));
	}
}

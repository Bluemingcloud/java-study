package quizObject12;

public class MyArrays {

	private MyArrays() {
	}
	
	public static String toString(int[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length - 1; i++) {
			result += arr[i] + ", ";
		}
		result += arr[arr.length - 1] + "]";
		return result;		
	}
	
	public static String toString(String[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length - 1; i++) {
			result += arr[i] + ", ";
		}
		result += arr[arr.length - 1] + "]";
		return result;		
	}
	
	public static String toString(char[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length - 1; i++) {
			result += arr[i] + ", ";
		}
		result += arr[arr.length - 1] + "]";
		return result;		
	}
}
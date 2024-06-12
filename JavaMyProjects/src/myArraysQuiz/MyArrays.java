package myArraysQuiz;

public class MyArrays {
	
	private MyArrays() {		
	}
	
	// ****** 입력 받은 배열을 Object 타입의 배열로 바꾸기 ******
	// .toObjectArr - int[] arrInt -> Object[] arrObj
	private static Object[] toObjectArr(int[] arrInt) {
		Object[] arrObj = new Object[arrInt.length];
		for(int i = 0; i < arrObj.length; i++) {
			arrObj[i] = arrInt[i];
		}
		return arrObj;
	}
	// .toObjectArr - char[] arrChar -> Object[] arrObj
	private static Object[] toObjectArr(char[] arrChar) {
		Object[] arrObj = new Object[arrChar.length];
		for(int i = 0; i < arrObj.length; i++) {
			arrObj[i] = arrChar[i];
		}
		return arrObj;
	}
	// .toObjectArr() - String[] arrStr -> Object[] arrObj
	private static Object[] toObjectArr(String[] arrStr) {
		Object[] arrObj = new Object[arrStr.length];
		for(int i = 0; i < arrObj.length; i++) {
			arrObj[i] = arrStr[i];
		}
		return arrObj;
	}
	
	// ****** Object 타입의 배열을 반환할 타입의 배열로 바꾸기 ******
	// .toIntArr() - Object[] arrObj -> int[] arrInt
	private static int[] toIntArr(Object[] arrObj) {
		int[] arrInt = new int[arrObj.length];
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrObj[i] != null ? arrInt[i] = Integer.parseInt("" + arrObj[i]) : 0;  
		}
		return arrInt;
	}
	// .toCharArr() - Object[] arrObj -> char[] arrChar
	private static char[] toCharArr(Object[] arrObj) {
		char[] arrChar = new char[arrObj.length];
		for(int i = 0; i < arrChar.length; i++) {
			arrChar[i] = arrObj[i] != null ? arrChar[i] = (char)arrObj[i] : 0;
		}
		return arrChar;
	}
	// .toStringArr() - Object[] arrObj -> String[] arrStr
	private static String[] toStringArr(Object[] arrObj) {
		String[] arrStr = new String[arrObj.length];
		for(int i = 0; i < arrStr.length; i++) {
			arrStr[i] = "" + arrObj[i];
		}
		return arrStr;
	}
	
	// ****** .toString() ******
	// .ObjtoString() - Object[] arrObj -> String
	private static String ObjtoString(Object[] arrObj) {
		String str = "[";
		for(int i = 0; i < arrObj.length - 1; i++) {
			str += arrObj[i] + ", ";
		}
		str += arrObj[arrObj.length - 1] + "]";
		return str;
	}	
	// .toString() - int[] -> String
	public static String toString(int[] arrInt) {
		return ObjtoString(toObjectArr(arrInt));
	}
	// .toString() - char[] -> String
	public static String toString(char[] arrChar) {
		return ObjtoString(toObjectArr(arrChar));
	}
	// .toString() - String[] -> String
	public static String toString(String[] arrStr) {
		return ObjtoString(toObjectArr(arrStr));
	}
	
	
	// ****** copyOf() ******	
	// .copyOfObj(Object[] arrObj, int newLength)
	private static Object[] copyOfObj(Object[] arrObj, int newLength) {
		Object[] temp = new Object[newLength];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = i < arrObj.length ? arrObj[i] : null;
		}
		arrObj = temp;
		temp = null;
		return arrObj;
	}
	// .copyOf() - int[] -> int[newLength]
	public static int[] copyOf(int[] arrInt, int newLength) {
		Object[] arr = copyOfObj(toObjectArr(arrInt), newLength);
		return toIntArr(arr);
	}
	// .copyOf() - char[] -> char[newLength]
	public static char[] copyOf(char[] arrChar, int newLength) {
		Object[] arr = copyOfObj(toObjectArr(arrChar), newLength);
		return toCharArr(arr);
	}
	// .copyOf() - String[] -> String[newLength]
	public static String[] copyOf(String[] arrStr, int newLength) {
		Object[] arr = copyOfObj(toObjectArr(arrStr), newLength);
		return toStringArr(arr);
	}
	
	
	// ****** sort() ******
	// .sortObj() bubble sort
	private static Object[] sortObj(Object[] arrObj) {
		for(int i = 0; i < arrObj.length - 1; i++) {
			for(int j = i; j < arrObj.length - 1; j++) {
				if(("" + arrObj[j]).compareTo("" + arrObj[j + 1]) > 0) {
					Object temp = arrObj[j];
					arrObj[j] = arrObj[j + 1];
					arrObj[j + 1] = temp;
				}
			}
		}
		return arrObj;
	}
	// .sort() - int[]
	public static int[] sort(int[] arrInt) {
		Object[] arr = sortObj(toObjectArr(arrInt));
		return toIntArr(arr);
	}
	// .sort() - char[]
	public static char[] sort(char[] arrChar) {
		Object[] arr = sortObj(toObjectArr(arrChar));
		return toCharArr(arr);
	}
	// .sort() - String[]
	public static String[] sort(String[] arrStr) {
		Object[] arr = sortObj(toObjectArr(arrStr));
		return toStringArr(arr);
	}
	
	// ****** binarySearch() ******
	// .binSearchObj(Object[] arrObj, Object keyObj)
	private static int binSearchObj(Object[] arrObj, Object keyObj) {
		int start = 0;
		int end = arrObj.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(("" + arrObj[mid]).compareTo("" + keyObj) == 0) {
				return mid;
			} else {
				if(("" + arrObj[mid]).compareTo("" + keyObj) < 0) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
	// .binarySearch() - int[], int key -> int index
	public static int binarySearch(int[] arrInt, int key) {
		return binSearchObj(toObjectArr(arrInt), key);
	}
	// .binarySearch() - char[], char key -> int index
	public static int binarySearch(char[] arrChar, char key) {
		return binSearchObj(toObjectArr(arrChar), key);
	}
	// .binarySearch() - String[], String key -> int index
	public static int binarySearch(String[] arrStr, String key) {
		return binSearchObj(toObjectArr(arrStr), key);
	}		
	
}

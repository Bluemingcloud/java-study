package day02;

public class test {
	public static void main(String[] args) {
		int ranNumArray[] = new int[6];
		for(int i = 0; i <ranNumArray.length; i++) {
			int ranNum = (int)(Math.random() * 45) + 1;
			if ( !isDuplicate(ranNumArray, ranNum, i)) {
				ranNumArray[i] = ranNum;
			}
		}
		for (int i = 0; i < ranNumArray.length; i++) {
			System.out.println(ranNumArray[i]);
		}
	}
	
	
	public static boolean isDuplicate(int[] array, int number, int currentIndex) {
		for(int i = 0; i < currentIndex; i++) {
			if (array[i] == number) {
				return true;
			}						
		}
		return false;
	}
}


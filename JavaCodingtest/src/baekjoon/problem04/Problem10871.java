package baekjoon.problem04;

import java.util.Scanner;

public class Problem10871 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		scan.nextLine();
		
		int[] arr = new int[N];
		String result = "";
		// String result = new String(); 을 사용하였더니 result 에 띄어쓰기 값이 저장.
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = scan.nextInt();
			
			if (arr[i] < X) {
				if(result == "") {
					result = arr[i]+"";
					// int 값을 String 으로 바꿀때 : "" 와 연산하여 자동캐스팅 되게한다.
				} else {
					result = result + " " + arr[i]; 
				}
			}
			
		}
		
		System.out.println(result);
		
		scan.close();		
	}
}

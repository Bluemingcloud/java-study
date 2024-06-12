package quiz03;

import java.util.Scanner;

public class Quiz13_2 {
	public static void main(String[] args) {
//		어떤 수 x까지의 수 중에서 n의 배수를 찾아보려고 한다.
//
//		첫째 줄의 x와 n을 입력 받아 n의 배수를 가로로 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 1;
		int j = 0;
		int[] resultArr = new int[x / n];
		
		while(i<=x) {
			
			if(i%n ==0) {
				resultArr[j] = i;
				j++;
			}
			i++;
		}
		
		for(int k = 0; k<resultArr.length; k++) {
			System.out.print(resultArr[k]);
			if(k == resultArr.length -1) {
				break;
			}
			System.out.print(" ");
		}
		
		scan.close();
	}
}

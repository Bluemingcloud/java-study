package quiz03;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {

		//배수 출력하기
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 1;
		
		
		while((n * i) <= x) {
			System.out.print((n * i) + " ");
			i++;
		}
		
		scan.close();
	}
}
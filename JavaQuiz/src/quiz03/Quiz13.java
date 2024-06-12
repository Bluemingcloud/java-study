package quiz03;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		//개수세기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 1;
		int count = 0;
		
		while(i <= num) {
			if(i % 4 == 0 && i % 8 != 0) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);
		
		scan.close();
	}
}

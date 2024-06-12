package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem2292 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int cnt = 1;
		int room = 1;
		while(true) {
			if(n == 1) {
				System.out.println(1);
				break;
			}
			if(room < n && n <= room + cnt * 6) {
				System.out.println(cnt + 1);
				break;				
			}
			room += cnt * 6;
			cnt++;
		}		
	}
}


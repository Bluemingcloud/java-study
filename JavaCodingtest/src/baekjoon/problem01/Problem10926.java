package baekjoon.problem01;

import java.util.Scanner;

public class Problem10926 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		String idArray[] = new String[1];
		idArray[0] = id;
		
		if (idArray[0] == id) {
			System.out.println(id + "??!");
		}
		
		
		scan.close();

	}

}

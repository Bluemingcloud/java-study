package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class BtDice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		sequence = new int[n];	// 배열의 크기는 n
		
		backtracking(n, 0);
		
	}
	
	static boolean[] visited = new boolean[7];	// 1 부터 6 까지 
	static int[] sequence; 
	
	private static void backtracking(int n, int depth) {
		if(depth == n) {
			System.out.println(Arrays.toString(sequence));
			return;
		}
		
		for(int i = 1; i <= 6; i++) {
			if(!visited[i] && (depth == 0 || sequence[depth - 1] < i)) {
				sequence[depth] = i;
				visited[i] = true;
				backtracking(n, depth + 1);
				
				visited[i] = false;
			}
		}
		
		
	}

}

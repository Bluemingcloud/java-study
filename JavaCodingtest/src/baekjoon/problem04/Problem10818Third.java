package baekjoon.problem04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10818Third {
	public static void main(String[] args) throws IOException {
		// 예외처리 throws
		// throws는 예외를 처리하는 것이 아니라 예외를 전파한다는 것이다.
		// 따라서 메서드 내에서 예외가 발생할 수 있는 경우 이를 throws로 선언한다면, 
		// 해당 메서드를 호출하는 코드에서 이 예외를 처리하거나 다시 throws하여 전파해야한다.
		
		// IOException : 입출력에서의 예외 (Input, Output)
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			// st.nextToken 이 한번 반복마다 한번씩만 실행 되게 해야한다.
			// st.nextToke 이 실행 될 때마다 새로운 token 을 받는다.
			if(a >= max) {
				max = a;
			} 
			if(a <= min) {
				min = a;
			}	
		}				
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}

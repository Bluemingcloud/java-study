package baekjoon.problem03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10951_2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 
		 * 출력 : 
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		
		/*
		 * BufferedReader 사용해보기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer tk;
		String str;
		
		while((str = br.readLine()) != null) {
			tk = new StringTokenizer(str, " ");
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			sb.append(a+b).append("\n");
//			System.out.println(a+b);
		}			
		System.out.println(sb);		
	}
}

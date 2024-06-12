package baekjoon.problem07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2566Second {
	
	public static void main(String[] args) {
		/*
		<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
		
		이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

		예를 들어, 다음과 같이 81개의 수가 주어지면
		
		이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			
			int[][] arr = new int[9][9];
			int max = 0;
			int a = 1;
			int b = 1;
			
			for(int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(arr[i][j] > max) {
						max = arr[i][j];
						a = i + 1;
						b = j + 1;
					}					
				}
			}
			

			/*
			for(int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());		
				}
			}			
			
			int cntA = 1;			
			for(int[] ar : arr) {	
				int cntB = 1;
				for(int num : ar) {					
					if(num > max) {
						max = num;
						a = cntA;
						b = cntB;
					}
					cntB++;
				}
				cntA++;
			}
			*/
			bw.write(max + "");
			bw.newLine();
			bw.write(a + " " + b);
			bw.flush();
			bw.close();
			br.close();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

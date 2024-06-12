package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11650 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder sb = new StringBuilder();
	public static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.parseInt(br.readLine());
		Point[] arr = new Point[n];
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		br.close();
		Arrays.sort(arr);
		
		for(Point p : arr) {
			sb.append(p.x).append(" ").append(p.y).append("\n");
		}
		System.out.println(sb);		
	}	

}
class Point implements Comparable<Point> {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}	
}

package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Problem11651 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		List<Point> list = new ArrayList<Point>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Point(x, y));
		}
		br.close();
		
		list.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if(o1.y == o2.y) return o1.x - o2.x;
				return o1.y - o2.y;
			}			
		});
		
		StringBuilder sb = new StringBuilder();
		for(Point p : list) {
			sb.append(p.x).append(" ").append(p.y).append("\n");
		}
		
		System.out.println(sb);		
	}
	private static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}	
}

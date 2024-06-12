package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10814Second {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Person[] arr = new Person[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		Arrays.sort(arr);
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(Person p : arr) {
			sb.append(p.age).append(" ").append(p.name);
			sb.append("\n");
		}
		System.out.println(sb);	
	}
}
class Person implements Comparable<Person>{
	
	int age;
	String name;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;		
	}
	
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	
}

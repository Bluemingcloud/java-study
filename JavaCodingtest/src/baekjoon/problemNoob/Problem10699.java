package baekjoon.problemNoob;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Problem10699 {
	public static void main(String[] args) {
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(time);
	}
}

package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BfWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedWriter 클래스
		 * 문자열 2바이트 기반의 성능 향상 보조 스트림
		 * 빠른 출력에 사용
		 */
		
		
		// 출력을 빠르게
		// OutputStreamWriter : 1byte 기반의 데이터를 writer 타입으로 중간에서 바꿔주는 매개체
		
//		Writer ow = new OutputStreamWriter(System.out);
//		BufferedWriter bw = new BufferedWriter(ow);
//		bw.write("안녕하세요");
//		bw.flush();
		
		String path = "C:/Users/user/Desktop/course/java/upload/hello4.txt";
		
//		Writer w = new FileWriter(path);
//		BufferedWriter bw = new BufferedWriter(w);
		// 캐리지 리턴 \r 
		// 커서를 앞으로
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			bw.write("안녕하세요\n모두\n반가워요\n좋은하루");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

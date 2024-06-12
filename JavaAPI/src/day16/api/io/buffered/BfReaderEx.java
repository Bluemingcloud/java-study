package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class BfReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedReader 클래스
		 * 문자열 2바이트 기반의 성능 향상 보조 스트림
		 * 빠른 입력에 사용
		 */
		
		// 입력을 빠르게
		// InputStreamReader : 1byte 기반의 데이터를 Reader 타입으로 중간에서 바꿔주는 매개체
		// InputStream 타입을 매개변수로 받는다.
		
//		Reader r = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(r);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		System.out.println(str);

		String path = "C:/Users/user/Desktop/course/java/upload/hello4.txt";
		
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(path));
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

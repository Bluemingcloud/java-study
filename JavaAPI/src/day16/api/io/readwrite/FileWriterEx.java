package day16.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * FileWriter 클래스 : 문자를 써서 저장하는 클래스
		 * 
		 * 2바이트 단위로 처리하기 때문에, 한글 쓰기에 적합하다.
		 */
		
		Writer rw = null;
		String path = "C:/Users/user/Desktop/course/java/upload/hello2.txt";
		
		try {
			rw = new FileWriter(path);
			
			rw.write("안녕하세요?\n");
			rw.write("오늘은 6월 4일\n");
			rw.write("즐거운 화요일 입니다!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

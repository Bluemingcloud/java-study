package day16.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * FileReader 클래스 : 문자기반으로 읽어들이는 클래스
		 * 
		 * 2바이트 단위로 처리하기 때문에, 한글 읽기에 적합하다.
		 */
		
		Reader rd = null;
		String path = "C:/Users/user/Desktop/course/java/upload/hello2.txt";
		
		try {
			rd = new FileReader(path);
			
			// 한글자씩 읽기
//			while(true) {
//				int word = rd.read();
//				if(word == -1) break;
//				System.out.print((char)word);				
//			}
			char[] arr = new char[100];
			StringBuilder sb = new StringBuilder();
			int length;
			while((length = rd.read(arr)) != -1) {
				for(char c : arr) {
					sb.append(c);
				}
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

package day16.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BfOutputStreamEx {
	
	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 클래스는, 성능향상 클래스 입니다.
		 * Buffered + 스트림 클래스 명 으로 사용합니다.
		 * 
		 * BufferedOutputStream
		 * 1byte 기반으로 데이터를 씀
		 * 
		 * BufferedInputStream
		 * 1byte 기반으로 데이터를 읽음
		 */
		String path = "C:/Users/user/Desktop/course/java/upload/hello3.txt";
		
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {	
//			OutputStream os = new FileOutputStream(path);
//			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			bos = new BufferedOutputStream(new FileOutputStream(path));
			bis = new BufferedInputStream(new FileInputStream(path));
			
			String str = "hello!\nnice to meet you!";
			bos.write(str.getBytes(), 0, str.length());
			
			while(true) {
				int word = bis.read();
				if(word == -1) {
					break;
				}
				System.out.print((char)word);
			}
			
			// flush() 를 사용해서 버퍼를 비워야 글이 써져 내려간다.
			bos.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	
		
	}

}

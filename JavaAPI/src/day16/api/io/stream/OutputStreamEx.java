package day16.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Output이 붙어 있는 클래스는 1바이트 기반의 출력스트림 클래스
		 * 
		 * io 패키지의 모든 클래스는 throws 가 있어서, try ~ catch 블록과 함께 사용한다.
		 *  
		 * 1. FileOutputStream : 파일을 쓸 때 사용하는 클래스
		 */
		
		String path = "C:/Users/user/Desktop/course/java/upload/hello.txt";	// 파일명을 포함한 경로
		OutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
			
			String str = "hello?\nnice to meet you!";
			
			fos.write(str.getBytes());
			
			fos.close();
						
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}

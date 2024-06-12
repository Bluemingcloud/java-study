package day16.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Input, Output Stream 클래스는, 1바이트 기반으로 파일을 읽고 쓰는데 적합하다.
		 */
		
		InputStream ios = null;
		OutputStream fos = null;
		
		String inputPath = "C:/Users/user/Desktop/course/java/upload/img1.png";
		String outputPath = "C:/Users/user/Desktop/course/java/uploadcopy/img1_copy.png";
		
		try {
			
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000];
			
			// read(바이트)
			// 읽은 길이를 반환
			// 더이상 읽을 내용이 없으면 -1 반환
			int result;
			while((result = ios.read(arr)) != -1)	{
				
				// 파일 output
				fos.write(arr, 0, result);	// 배열의 0 ~ 데이터 길이 까지 쓰기
			}
			// 무슨 파일이든 복사 가능
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

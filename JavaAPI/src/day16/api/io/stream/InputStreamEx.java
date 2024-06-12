package day16.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * InputStream 이 붙어 있는 클래스는 1바이트 기반의 입력 스트림 클래스이다.
		 * 
		 * FileInputStream : 파일을 읽어들이는데 사용하는 클래스
		 */
		
		
		String path = "C:/Users/user/Desktop/course/java/upload/hello.txt";
		
		InputStream ios = null;
		
		try {
			ios = new FileInputStream(path);
			
			// 1바이트씩 읽기 (자음, 모음)
			// 문자는 2바이트 인데 InputStream 은 1바이트로 데이터를 읽어서
			// 1바이트 이내의 아스키코드로 표현가능한 영어는 그대로 출력이 되지만
			// 1바이트 이상의 값을 가지는 한글은 깨진채 출력 된다.
//			while(true) {
//				int data = ios.read();
//				if(data == -1) {
//					break;
//				}
//				System.out.println(data);
//			}
			
			// 바이트 배열로 한번에 읽기
			byte[] arr = new byte[100]; // 100글자
			
			int length = ios.read(arr);	// 읽은 내용을 arr에 저장
			
			System.out.println("데이터를 읽은 길이 : " + length);
			System.out.println(Arrays.toString(arr));
			
			for(int i = 0; i < length; i++) {
				System.out.print((char)arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

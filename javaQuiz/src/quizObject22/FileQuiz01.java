package quizObject22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자 포함해서 입력받습니다.
		 * 2. upload 폴더에 파일이 있다면, 이 파일을 uploadcopy 로 복사해주세요
		 * 		파일이 없으면 "파일명이 없습니다." 예외구문을 출력합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		InputStream ios = null;
		OutputStream fos = null;
		
		System.out.print("파일명>");
		String fileName = sc.nextLine();
		
		String inputPath = "C:/Users/user/Desktop/course/java/upload/" + fileName;
		String outputPath = "C:/Users/user/Desktop/course/java/uploadcopy/" + fileName;
		
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000];
			
			int result;
			while((result = ios.read(arr)) != -1) {
				fos.write(arr, 0, result);
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(fileName + " 이 없습니다.");
			
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

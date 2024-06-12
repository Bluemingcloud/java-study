package day16.api.io.directory;

import java.io.File;

public class CreateDirectory {
	
	public static void main(String[] args) {
		
		/*
		 * 자바에서는 외부 경로로 폴더를 생성할 때 File 클래스를 사용한다.
		 */
		
		String path = "C:/Users/user/Desktop/course/java/upload/newFolder";
		
		File file = null;
		try {
			file = new File(path);
			
			// 폴더의 생성
			// mkdir() 
			// 해당 경로에 폴더 생성
			// 실행될 때 마다 새로운 폴더가 만들어진다.
			// 폴더가 있는지 확인한 후 사용하는 것이 좋다.
			
			// exists() 
			// 폴더 존재하면 true, 아니면 false
//			if(!file.exists()) {
//				file.mkdir();				
//			} else {			
//				System.out.println("폴더가 존재합니다.");
//			}
			
			// mkdirs() 
			// 해당 경로와 상위 경로 폴더 전체 생성
			
			// delete()
			// 폴더의 삭제
			// 폴더 내부에 파일이 존재하면 삭제되지 않음
			// 내부에 파일이 존재해도 삭제 하는 메서드는 없음
			if(file.exists()) {
				file.delete();
				System.out.println("폴더 삭제 성공");
			} else {
				System.out.println("폴더가 존재하지 않습니다.");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package quizObject22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 빠른 입력을 통해서 사용자로부터 입력을 받습니다.
		 * 2. 사용자가 "그만" 을 적을때 까지 입력받아 주면 됩니다.
		 * 3. 입력받을 내용을, BufferedWriter 를 이용해서, 파일을 쓰세요. (파일명은 자유)
		 * 4. 단, 사용자가 엔터를 칠때마다 데이터는 써져야 합니다.
		 */
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\quiz02.txt";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter(path));
			StringBuilder sb;
			while(true) {
				System.out.println("저장할 내용을 입력하세요.");
				System.out.print(">");
				sb = new StringBuilder(br.readLine());
				if(("" + sb).equals("그만")) {
					break;
				}
				sb.append("\n");
				bw.write("" + sb);
				bw.flush();
			}
			// 마지막에 데이터가 써지려면
//			bw.write("" + sb);
//			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

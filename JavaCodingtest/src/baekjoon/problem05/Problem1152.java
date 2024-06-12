package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1152 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			
			// br.readLine().trim(); 을 통해 양쪽 끝 공백을 삭제 할 수 있다.
			// 공백만 입력시 발생할 수 있는 오류 또한 거를 수 있다.
			if(str.equals(" ")) {
				bw.write(0 + "");
			} else {
				String[] strArr = str.split(" ");			
				
				if(strArr[0].equals("")) {
					bw.write(strArr.length - 1 + "");
				} else {
					bw.write(strArr.length + "");
				}				
			}						
			// st.countTokens(); 을 통해 간단히 사용 가능하다.
			
			br.close();
			bw.flush();
			bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

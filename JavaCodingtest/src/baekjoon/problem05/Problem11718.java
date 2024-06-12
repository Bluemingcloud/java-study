package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11718 {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {		
			String str;
			
			while((str = br.readLine()) != null) {	// EOF 처리 라인
				
				bw.write(str);
				bw.newLine();				
			}
			
			// bw.flush(); 를 사용하지 않는 이유
			// bw.flush() 메서드는 버퍼에 남아 있는 데이터를 출력 스트림에 즉시 보내는 역할을 한다.
			// 이 코드의 동작은 BufferedWriter를 사용하여 출력하는 동안에는 데이터가 버퍼에 쌓인후  출력 스트림으로 전달하는 것.
			// 따라서 따로 flush 를 명시할 필요없이 close 호출로  자동 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
		}	
	}
}

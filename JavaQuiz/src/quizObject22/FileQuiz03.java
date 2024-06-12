package quizObject22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 상혁이가 입사한 회사에서, 매일 오전 아침 7시에 연계사(회사)에서
		 * 날짜유형의 csv파일을 매일 전송해줍니다.
		 * 
		 * ex) 2024_06_04_data.csv
		 * 
		 * 주의할 점은 내일이 되면 2024_06_05_data.csv 가 됩니다.
		 * 
		 * 그래서 상혁이는 아침마다, csv 파일을 읽어서 
		 * 우리의 데이터베이스에 저장하는 프로그램 코드를 생성해야 합니다.
		 * 
		 * 1. buffered 를 사용해서 오늘날짜패턴_data.csv 파일을 읽어서
		 * 한줄에 하나씩 출력을 하세요.
		 * 2. 읽은 데이터는 , 구분자로 만들어져 있는데
		 *  , 기준으로 데이터를 분리해서 getter setter 를 가지는 Data 클래스에 저장하고
		 *  이 객체를 리스트에 저장하면 됩니다.
		 *  
		 */
		
		// 오늘 날짜를 저장하는 객체 생성
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd");
		
		// 경로 생성
		StringBuilder path = new StringBuilder("C:\\Users\\user\\Desktop\\course\\java\\upload\\");
		path.append(dtf.format(date)).append("_data.csv");
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		StringTokenizer st;
		
		// Data 클래스 저장할 List 생성
		List<Data> list = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader("" + path));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				
				bw.write(str + "\n");
				bw.flush();
				// , 기준으로 데이터 분리
				st = new StringTokenizer(str, ",");
				
				// Data 는 name, age, eMail, direction 을 가지는 객체
				String name = st.nextToken();
				int age = Integer.parseInt(st.nextToken());
				String eMail = st.nextToken();
				String direction = st.nextToken();
				
				// List 에 저장
				list.add(new Data(name, age, eMail, direction));				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
			
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

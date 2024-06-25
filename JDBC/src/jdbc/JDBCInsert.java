package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
	
	public static void main(String[] args) {
		
		// INSERT
		// java11 이후 버전부터는 module-info.java 파일에 requires java.sql; 입력
		// 1. sql 접속 정보를 선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // 계정명
		String upw = "HR"; // 비밀번호
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디>");
		String id = scan.next();
		System.out.print("비밀번호>");
		String pw = scan.next();
		System.out.print("나이>");
		int age = scan.nextInt();
		System.out.print("이메일>");
		String email = scan.next();
		
		// 실행시킬 SQL 문
		// 들어갈 매개변수 마다 ? 를 적어준다
		String sql = "INSERT INTO MEMBER(ID, PW, AGE, EMAIL) VALUES(?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. JDBC 드라이버 호출
			// java.sql 패키지를 사용하는데, 내부 클래스들이 전부 throws 로 처리되어있어서, try ~ catch 문 안에서 작성합니다.
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 3. SQL 연결을 위한 Connection 객체 생성
			conn = DriverManager.getConnection(url, uid, upw); // 주소, 아이디, 비밀번호
			
			// 4. SQL 쿼리구문 실행을 위한 Statement 객체 생성
			// sql 의 ?는 1부터 순서대로 채워줍니다.
			// 문자 : setString(), 숫자 : setInt(), 날짜 : setDate(), 밀리세컨드 : setTimestemp()
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setInt(3, age);
			pstmt.setString(4, email);
			
			// 5. SQL 실행
			// INSERT, UPDATE, DELETE는 executeUpdate() 로 실행
			int result = pstmt.executeUpdate(); // 적용된 row 행의 개수를 반환
			
			if(result == 1) {
				System.out.println("인서트 성공");
			} else {
				System.out.println("인서트 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	
	}

}

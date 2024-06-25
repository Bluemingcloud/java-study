package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect {
	
	public static void main(String[] args) {
		
		// 나이가 10 초과 데이터 조회
		
		// 1. sql 접속
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 나이>");
		int age = scan.nextInt();
		
		String sql = "SELECT * FROM MEMBER WHERE AGE >= ?"; 
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // SELECT 는 결과를 조회해서 처리할 ResultSet 객체가 필요하다.
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, age);
			
			rs = pstmt.executeQuery(); // SELECT 는 executeQuery() 구문으로 실행한다. (ResultSet 타입으로 반환)
			
			// rs 에 저장된 데이터를 1행씩 처리하는 구문
			while(rs.next()) { // 다음 행이 있는지 확인해서, 다음이 있으면 전진 true 반환
				// 한 행에 대한 프로그램 처리
				// getString(), getInt(), getDate(), getTimestamp() 등을 이용해서 데이터를 읽어들인다.
				String resultId = rs.getString("ID"); // 컬럼 명
				String resultPw = rs.getString("PW");
				int resultAge = rs.getInt("AGE");
				String resultEmail = rs.getString("EMAIL");
				
				System.out.println(resultId);
				System.out.println(resultPw);
				System.out.println(resultAge);
				System.out.println(resultEmail);				
				System.out.println("==========================================");
				
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

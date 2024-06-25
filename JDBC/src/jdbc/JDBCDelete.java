package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDelete {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디>");
		String id = scan.next();
		System.out.print("비밀번호>");
		String pw = scan.next();
		
		String sql = "DELETE FROM MEMBER WHERE ID = ? AND PW = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("딜리트 성공");
			} else {
				System.out.println("딜리트 실패");
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

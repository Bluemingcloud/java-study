package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {
	
	public static void main(String[] args) {
		
		/*
		 * 직원 테이블과, 부서 테이블을 left 조인 하고
		 * 
		 * 직원 아이디, 직무 아이디, 부서명, 이름 만 출력합니다.
		 * 
		 * 조건
		 * 직원 아이디를 입력 받아서, 이 아이디에 해당하는 데이터만 출력
		 */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 직원ID>");
		int employee_id = scan.nextInt();
		
		String sql = "SELECT E.EMPLOYEE_ID, J.JOB_TITLE, D.DEPARTMENT_NAME, E.FIRST_NAME || ' ' || E.LAST_NAME AS NAME " // 맨 뒤에는 띄우거나 \n
				+ "FROM EMPLOYEES E "
				+ "LEFT JOIN DEPARTMENTS D "
				+ "ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
				+ "LEFT JOIN JOBS J "
				+ "ON E.JOB_ID = J.JOB_ID "
				+ "WHERE E.EMPLOYEE_ID = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, employee_id);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int resultEmpId = rs.getInt("EMPLOYEE_ID");
				String resultJobTitle = rs.getString("JOB_TITLE");
				String resultDptName = rs.getString("DEPARTMENT_NAME");
				String resultName = rs.getString("NAME");

				System.out.println("직원ID : " + resultEmpId);
				System.out.println("직원명 : " + resultName);
				System.out.println("업무명 : " + resultJobTitle);
				System.out.println("부서명 : " + resultDptName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

}

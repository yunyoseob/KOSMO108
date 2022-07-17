package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleTest_p5 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// oracle.jdbc.driver.OracleDriver Ŭ������ ã�´�.
			Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclYYS00","scott","tiger");
			
			// Statement stmt = conn.createStatement();
			// ResultSet rsRs = stmt.executeQuery("SELECT*FROM EMP ORDER BY 1 DESC");
			// �������� executeQuery �Լ� ���� �ִ�.
			
			PreparedStatement stmt=conn.prepareStatement("SELECT*FROM EMP ORDER BY 1 DESC");
			// �ݺ��� SQL query���� ��� PreparedStatement�� �������� ��� ������ ���� ������
			// ���� ������� �� ������������� ������� �ʴ´�. (QWERTY�� ����)
			// �������� prepareStatement �Լ� ���� �ִ�.
			// �� �� �� �� �����ϴ� �����������θ� �˸� �ȴ�.
			
			// API ����
			// PreparedStatement pstmt = con.prepareStatement("UPDATE EMPLOYEES
            // SET SALARY = ? WHERE ID = ?");
			
			// Connection Ŭ������ methods
			// PreparedStatement = prepareStatement(String sql)
			// Creates a PreparedStatement object for sending parameterized 
			// SQL statements to the database.
			
			ResultSet rsRs=stmt.executeQuery();
			while (rsRs.next()){
				System.out.print(rsRs.getString(1)+" : ");
				System.out.print(rsRs.getString(2)+" : ");
				System.out.print(rsRs.getString(3)+" : ");
				System.out.print(rsRs.getString(4)+" : ");
				System.out.print(rsRs.getString(5)+" : ");
				System.out.print(rsRs.getString(6)+" : ");
				System.out.print(rsRs.getString(7)+" : ");
				System.out.print(rsRs.getString(8));
				System.out.println();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			
		}
		

	} // main method

} // OracleTest_p5 class

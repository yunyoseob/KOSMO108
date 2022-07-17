package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import a.b.c.prac.oracleinfo.OracleInformation;

public class OracleTest_p6 {	
	public static String sqlQuery="SELECT EMPNO, ENAME, JOB, MGR FROM EMP WHERE EMPNO=?";
	// EMPNO=? ���� ?�� place holder��� �Ѵ�.
	// ? ù ��° �ڸ��� sc.next()�� ������ String empno ������
	// �����ؼ� ����.
	
	// ������
	public OracleTest_p6(){
		try{
			Class.forName(OracleInformation.JDBC_DRIVER);
		}catch(Exception e){
			System.out.println("Can't find JDBC Driver >>> : "+e.getMessage());
		}
	}
	

	
	public static void main(String[] args) {
		System.out.println("�˻��� ����� �Է��ϼ��� >>> : ");
		Scanner sc=new Scanner(System.in);
		try {
			String empno=sc.next();
			System.out.println("�˻��� ����� >>> : "+empno);
			// �˻��� ����� >>> : 7369
			
			Connection conn=DriverManager.getConnection(OracleInformation.JDBC_URL, OracleInformation.JDBC_USER, OracleInformation.JDBC_PASSWORD);
			PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
			pstmt.setString(1, empno);
			// 1��°�� �� ���� empno�� �Ѵ�.
			
			ResultSet rsRs=pstmt.executeQuery();
			
			if (rsRs!=null){
				while(rsRs.next()){
					System.out.print(rsRs.getString("EMPNO")+" : ");
					System.out.print(rsRs.getString("ENAME")+" : ");
					System.out.print(rsRs.getString("JOB")+" : ");
					System.out.println(rsRs.getNString("MGR"));
					// 7369 : SMITH : CLERK : 7902
				}
				sc.close();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			if(sc!=null){
				try{sc.close(); sc=null;}catch(Exception e){}
			}		
		}
	}
}

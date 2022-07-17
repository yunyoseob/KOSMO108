package a.b.c.prac2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import a.b.c.prac2.OracleConnProperty_p;

public class OracleTest_p13 {
	public int t4Update(String t1, String t2){
		System.out.println("<<< OracleTest_p13 ::t4Update(String t1, String t2) ���� >>>");
		Connection conn=null;
		PreparedStatement pstmt=null;
		int nCnt=0;
		
		try {
			conn = OracleConnProperty_p.getConnection();
			
			String sql="UPDATE TEST_T4 SET T2=?, T5=SYSDATE WHERE T4='Y' AND T1=?";
			// UPDATE�� ��, ���� UPDATE�ߴ���, SYSDATE �� ������Ʈ ���ֱ�
			// Y�� ȸ���� ��츸 ������Ʈ �ؾ���.
			// PK�� ��ȸ
			pstmt=conn.prepareStatement(sql);
			System.out.println("sql >>> \n"+sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, t2);
			pstmt.setString(2, t1);
			// t2�� �ٲ� �����̰�, t1�� pk�̴�. 
			// �� �� ���� �ϱ�
			
			System.out.println("Update �� nCnt >>> : "+nCnt);
			nCnt=pstmt.executeUpdate();
			System.out.println("Update �� nCnt >>> :"+nCnt);
		}catch(Exception e){
			System.out.println("������ >>> : "+e.getMessage());
		}
		return nCnt;
	}

	public static void main(String[] args) {
		String t1="7";
		String t2="YYS";
		String t3="";
		String t4="";
		String t5="";
		
		OracleTest_p13 ot13=new OracleTest_p13();
		int nCnt=ot13.t4Update(t1,t2);
		// t1�� pk ==7  t2�� ������Ʈ �� �� : 'YYS'
		
		System.out.println("OracleTest_p13 :: main(String[] args) :: nCnt >>> : "+nCnt);
		if (nCnt==1){
			System.out.println(nCnt+" �� ���� ����");
		}else{
			System.out.println("���� ����.");
		}
	} // main method
} // OracleTest_p13 class

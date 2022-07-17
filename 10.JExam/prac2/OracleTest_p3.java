package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.prac2.vo.EmpVO_p;

public class OracleTest_p3 {
	
	//  DataSource ����: �����ͺ��̽� ���� ����
	public static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_URL="jdbc:oracle:thin:@localhost:1521:orclYYS00";
	public static final String JDBC_USER="scott";
	public static final String JDBC_PASSWORD="tiger";

	// sql Query
	public static String sqlQuery="SELECT A.EMPNO AS EMPNO, A.ENAME AS ENAME, A.JOB AS JOB, A.MGR FROM SCOTT.EMP A ORDER BY 1 DESC";
	
	/*
	 * 8.  SELECT A.EMPNO AS EMPNO, A.ENAME AS ENAME, A.JOB AS JOB, A.MGR 
	 * 	   FROM SCOTT.EMP A ORDER BY 1 DESC";
	 * */
	
	
	// ������
	public OracleTest_p3(){
		try {
			Class.forName(JDBC_DRIVER);
		}catch(Exception e){
			System.out.println("Can't find JDBC Driver"+e.getMessage());	
		}
	}
	// 2. �����ڰ� �����Ǹ� oracle.jdbc.driver.OracleDriver Ŭ������
	// Class.forName���� ã�´�. ã�� ���� ���, Can't find JDBC Driver��  ��½�Ų��.
	
	public ArrayList<EmpVO_p> empSelect(){
		ArrayList<EmpVO_p> aList=null;
		// 4. ArrayList<EmpVO_p> aList �ʱ�ȭ
		try {
			Connection conn=DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			System.out.println("Connection conn >>> : "+conn);
			// Connection conn >>> : oracle.jdbc.driver.T4CConnection@5fa7e7ff
			
			/* 5. java.sql.Conncetion �������̽��� Oracle Vender���� jdbc ����̹��� ����� ������ ������
			 *    oracle.jdbc.driver.T4CConnection@5fa7e7ff Ŭ������ �츮�� ������  datasource ���������� ������
			 *    OracleTest_p3 Ŭ������ orclYYS00.scott ������ ������ �Ѵ�.
			 */
			
			Statement stmt=conn.createStatement();
			System.out.println("Statement stmt >>> : "+stmt);
			// Statement stmt >>> : oracle.jdbc.driver.OracleStatementWrapper@6adca536

			/* 6. java.sql.Statement�� ����� oracle.jdbc.driver.OracleStatementWrapper@6adca536
			* 	    ����Ŭ ���� ����ü Ŭ������ createStatement() �Լ��� ����� ������
			* 	    ���ڿ��� ������ ����Ŭ ������ ���̽��� 
			* 	  ("localhost:1521:orclYYS00", "scott","tiger")
			* 	    �����Ѵ�.
			*/
			
			ResultSet rsRs=stmt.executeQuery(sqlQuery);
			System.out.println("ResultSet rsRs >>> : "+rsRs);
			// ResultSet rsRs >>> : oracle.jdbc.driver.OracleResultSetImpl@d041cf 
			
			/*
			 * 7. ����Ŭ �����ͺ��̽��� ���޵� ������ => 8������ 
			 * 	   ����Ŭ Optimizer�� ������ �ؼ� ����� �߻��� �Ǹ�
			 *    oracle.jdbc.driver.OracleStatementWrapper@6adca536 ��ü �߻��� �����
			 *    java.sql.ResultSet �������̽��� ����� ����Ŭ ���� ����ü Ŭ���� 
			 * 	  oracle.jdbc.driver.OracleResultSetImpl@d041cf ����� �޴´�.
			 * 	   �� ����� ���������� �޸� ������ ������ �ִ�.
			 * */
			
			
			boolean bool=rsRs!=null;
			System.out.println("rsRs!=null >>> : "+bool);
			// rsRs!=null >>> : true
			// 9. if�� ���� ���� rsRs�� null�� �ƴ��� üũ�Ѵ�.
			if (rsRs!=null){
				aList=new ArrayList<EmpVO_p>();
				// 10. ArrayList<EmpVO_p> �⺻�����ڸ�
				// 	   aList ������ �Ҵ��Ѵ�.
				
				while(rsRs.next()){
					EmpVO_p evo=new EmpVO_p();
					// 11. EmpVO_p Ŭ������ �⺻�����ڸ� �����Ѵ�.
					
					evo.setEmpno(rsRs.getString("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setJob(rsRs.getString("JOB"));
					evo.setMgr(rsRs.getString("MGR"));
					
					aList.add(evo);
				}
				
			}
		}catch(Exception e){
			System.out.println("empSelect() �޼��� ���� �� ���� >>> : "+e);
			
		}
		
		System.out.println("aList >>> : "+aList);
		// aList >>> : [a.b.c.prac2.vo.EmpVO_p@2f7c7260, 
		// a.b.c.prac2.vo.EmpVO_p@2d209079, a.b.c.prac2.vo.EmpVO_p@6bdf28bb, 
		// a.b.c.prac2.vo.EmpVO_p@6b71769e, a.b.c.prac2.vo.EmpVO_p@2752f6e2, 
		// a.b.c.prac2.vo.EmpVO_p@e580929, a.b.c.prac2.vo.EmpVO_p@1cd072a9, 
		// a.b.c.prac2.vo.EmpVO_p@7c75222b, a.b.c.prac2.vo.EmpVO_p@4c203ea1, 
		// a.b.c.prac2.vo.EmpVO_p@27f674d, a.b.c.prac2.vo.EmpVO_p@1d251891, 
		// a.b.c.prac2.vo.EmpVO_p@48140564, a.b.c.prac2.vo.EmpVO_p@58ceff1, 
		// a.b.c.prac2.vo.EmpVO_p@7c30a502]
		System.out.println("aList.size() >>> : "+aList.size());
		// aList.size() >>> : 14
		
		// EMP ���̺�
		// SELECT COUNT(EMPNO) FROM EMP; => 14
		// SELECT COUNT(ENAME) FROM EMP; => 14
		// SELECT COUNT(JOB) FROM EMP; => 14
		// SELECT COUNT(MGR) FROM EMP; => 13
		// MGR ���� ��쿡�� null ���� �վ count�� ���� 13������, 
		// 7839 : KING : PRESIDENT : null �̷��� ������. primary key�� EMPNO�ε�,
		// EMPNO�� 14���̱� ���� (��Ģ : primary key��  null���� ������ ��  �ȴ�.)
		return aList;
	}
	
	public static void main(String[] args) {
		OracleTest_p3 ot3=new OracleTest_p3();
		// 1. OracleTest_p3 Ŭ������ �ν��Ͻ� �Ѵ�.
		ArrayList<EmpVO_p> aList=ot3.empSelect();
		// 3. �������� ot3�� �ڿ��� �Լ��� 
		// ArrayList<EmpVO_p> Ŭ������ aList��� ���������� �����Ѵ�.
		
		boolean bool=aList!=null;
		boolean bool2=aList.size() >0;
		
		System.out.println("main �Լ� ���� aList != null >>> : "+bool);
		// main �Լ� ���� aList != null >>> : true
		System.out.println("main �Լ� ���� aList.size() > 0 >>> : "+bool2);
		// main �Լ� ���� aList.size() > 0 >>> : true
		System.out.println("aList.size() >>> : "+aList.size());
		// aList.size() >>> : 14
		
		if (aList !=null && aList.size() > 0){
			for (int i=0; i<aList.size(); i++){
				EmpVO_p _evo=aList.get(i);
				System.out.print(_evo.getEmpno()+" : ");
				System.out.print(_evo.getEname()+" : ");
				System.out.print(_evo.getJob()+" : ");
				System.out.print(_evo.getMgr());
				System.out.println();
			}
			
		}

	}

}

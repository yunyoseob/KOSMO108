package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.prac2.vo.DeptVO_p;

/*
 * �䱸����
 * DEPT ���̺� ��ȸ�ϱ� JDBC �����ϱ�
 * DeptTest �ڹٿ��� deptSelect() �Լ��� ����ؼ�
 * Dept ���̺� �ִ� �÷� ��ü�� ��ȸ�ؼ�
 * main �Լ����� �ֿܼ� ����Ͻÿ�.
 * ��, DeptVO Ŭ������ ����ϱ�
 * (�����̱� ������ DeptVO_p Ŭ������ ����)
 * */


public class OracleTest_p4 {
	
	// DataSource ����: ������ ���̽� ���� ����
	public static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_URL="jdbc:oracle:thin:@localhost:1521:orclYYS00";
	public static final String JDBC_USER="scott";
	public static final String JDBC_PASSWORD="tiger";
	
	// sql Query
	public static String sqlQuery="SELECT B.DEPTNO AS DEPTNO, B.DNAME AS DNAME, B.LOC AS LOC FROM SCOTT.DEPT B";
	
	// ������
	public OracleTest_p4(){
		try {
			Class.forName(JDBC_DRIVER);
		}catch(Exception e){
			System.out.println("Can't find JDBC DRIVER >>> : "+e.getMessage());
		}
	}
	
	// �Լ� �����
	public ArrayList<DeptVO_p> deptSelect(){
		ArrayList<DeptVO_p> aList=null;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rsRs=null;
		// Connection => Statement => ResultSet
		// CSR 
		// Wrapper : public interface Wrapper
		// Connection, ResultSet, Statement�� ���� Interface
		
		// AutoCloseable : public interface AutoCloseable
		// Connection, ResultSet, Statement�� ���� Interface
		
		boolean bool=false;
		// ����� ������ �ʱ�ȭ ���� ���� 
		
		try{
			conn=DriverManager.getConnection(OracleTest_p4.JDBC_URL, OracleTest_p4.JDBC_USER, OracleTest_p4.JDBC_PASSWORD);
			// public interface Connection extends Wrapper, AutoCloseable
			// public class DriverManager extends Object
			
			// static Connection : getConnection(String url, String user, String password)
			// Attempts to establish a connection to the given database URL.
			
			System.out.println("Connection conn >>> : "+conn);
			// Connection conn >>> : oracle.jdbc.driver.T4CConnection@5fa7e7ff
			
			
			stmt=conn.createStatement();
			// public interface Statement extends Wrapper, AutoCloseable
			// public interface Connection extends Wrapper, AutoCloseable
			
			// Statement : createStatement()
			// Creates a Statement object for sending SQL statements to the database.
			
			System.out.println("Statement stmt >>> : "+stmt);
			// Statement stmt >>> : oracle.jdbc.driver.OracleStatementWrapper@6adca536

			rsRs=stmt.executeQuery(sqlQuery);
			// public interface ResultSet extends Wrapper, AutoCloseable
			// public interface Statement extends Wrapper, AutoCloseable
			
			// ResultSet : executeQuery(String sql)
			// Executes the given SQL statement, which returns a single ResultSet object.
			
			System.out.println("ResultSet rsRs >>> : "+rsRs);
			// ResultSet rsRs >>> : oracle.jdbc.driver.OracleResultSetImpl@d041cf
			
			bool=rsRs!=null;
			System.out.println("rsRs!=null >>> : "+bool);
			// rsRs!=null >>> : true
			
			if (rsRs!=null){
				aList=new ArrayList<DeptVO_p>();
				while (rsRs.next()){
					// ResultSet�� next �޼����
					// ��뷮 �����͸� �ٷ� ��, ���� ������ ���� ���� �ִ�.
					DeptVO_p dvo=new DeptVO_p();
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
					
					aList.add(dvo);
				}
			}
			
		}catch(Exception e){
			System.out.println("deptSelect() �޼��� ���� �� ���� >>> : "+e);
			
		}
		
		System.out.println("aList >>> : "+aList);
		// aList >>> : [a.b.c.prac2.vo.DeptVO_p@6bdf28bb, 
		// a.b.c.prac2.vo.DeptVO_p@6b71769e, a.b.c.prac2.vo.DeptVO_p@2752f6e2, 
		// a.b.c.prac2.vo.DeptVO_p@e580929]
		System.out.println("aList.size() >>> : "+aList.size());
		// aList.size() >>> : 4
		// Dept ���̺� ���� ������ 4�� (�⺻Ű ���� ���� : 4)
		return aList;
	}
	public static void main(String[] args) {
		OracleTest_p4 ot4=new OracleTest_p4();
		ArrayList<DeptVO_p> aList=ot4.deptSelect();
		
		boolean bool=aList!=null;
		boolean bool2=aList.size()>0;
		
		System.out.println("main �Լ� ���� aList != null >>> : "+bool);
		// main �Լ� ���� aList != null >>> : true
		System.out.println("main �Լ� ���� aList.size() >>> : "+bool2);
		// main �Լ� ���� aList.size() >>> : true
		
		if (aList!=null && aList.size() > 0){
			System.out.println("aList.size() >>> : "+aList.size());
			// aList.size() >>> : 4
			// aList.size()�� �ִ� ���� Ȯ�� �� ��츸, size�� ��½�Ų��.
			for (int i=0; i<aList.size(); i++){
				DeptVO_p _dvo=aList.get(i);
				System.out.print(_dvo.getDeptno()+" : ");
				System.out.print(_dvo.getDname()+" : ");
				System.out.print(_dvo.getLoc()+" : ");
				System.out.println();
			}
		}
	}
}

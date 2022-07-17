package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import a.b.c.prac2.vo.EmpVO_p;
import a.b.c.prac.oracleinfo.OracleInformation;


@SuppressWarnings("unused")
public class OracleTest_p11 {
	
	// Constructor
	public OracleTest_p11(){
		try {
			Class.forName(OracleInformation.JDBC_DRIVER);
		}catch(Exception e){
			System.out.println("Can't find JDBC DRIVER >>> : "+e.getMessage());
		}
	}
	
	// public static String getEmpSelectQuery()
	
	public static String getEmpSelectQuery(){
		StringBuffer sb=new StringBuffer();
		
		/*
		  SELECT
                A.EMPNO     AS EMPNO
                ,A.ENAME     AS ENAME
               , A.JOB               AS JOB
               , A.MGR               AS MGR
                ,TO_CHAR(A.HIREDATE, 'YYYY-MM-DD') AS HIREDATE
		  FROM  EMP A
		  WHERE 1=1
		  AND TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')>=TO_CHAR(TO_DATE('80/01/01'), 'YYYYMMDD')
		  AND TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')<=TO_CHAR(TO_DATE('81/01/01'), 'YYYYMMDD');
		*/
		
		sb.append("SELECT	\n");
		sb.append("		A.EMPNO		AS EMPNO	\n");
		sb.append("		,A.ENAME	AS ENAME	\n");
		sb.append("		,A.JOB		AS JOB		\n");
		sb.append("		,A.MGR		AS MGR		\n");
		sb.append("		,TO_CHAR(A.HIREDATE, 'YYYY-MM-DD') AS	HIREDATE 	\n");
		sb.append("FROM EMP A					\n");
		sb.append("WHERE 	1=1					\n");
		sb.append("AND		TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')>=TO_CHAR(TO_DATE(?), 'YYYYMMDD') \n");
		sb.append("AND		TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')<=TO_CHAR(TO_DATE(?), 'YYYYMMDD')");
		// 1 :: TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')>=TO_CHAR(TO_DATE(?), 'YYYYMMDD')
		// 2 :: TO_CHAR(TO_DATE(A.HIREDATE), 'YYYYMMDD')<=TO_CHAR(TO_DATE(?), 'YYYYMMDD'
		// FROM 1=> TO 2 �ε�, TO 2 <= FROM 1���ε� �ٲ㼭 �����غ���
		
		return sb.toString();
	}
	
	// public ArrayList<EmpVO_p> empSelect(EmpVO_p evo)
	
	public ArrayList<EmpVO_p> empSelect(EmpVO_p evo){
		ArrayList<EmpVO_p> aList =null;
		
		try{
			Connection conn=DriverManager.getConnection(OracleInformation.JDBC_URL, OracleInformation.JDBC_USER, OracleInformation.JDBC_PASSWORD);
			
			PreparedStatement pstmt=conn.prepareStatement(OracleTest_p11.getEmpSelectQuery());
			
			pstmt.setString(1, evo.getFromdate());
			pstmt.setString(2, evo.getTodate());
			String s=evo.getFromdate();
			String s1=evo.getTodate();
			System.out.println("from >>>>>>>>>>>> : "+s);
			System.out.println("to >>>>>>>>>>>> : "+s1);
			
			
			System.out.println("��¥ �˻� ���� >>> : \n"+OracleTest_p11.getEmpSelectQuery());
			
			ResultSet rsRs=pstmt.executeQuery();
			
			boolean bool= rsRs != null;
			System.out.println("empSelect ::: rsRs != null >>> "+bool);
			
			if(rsRs != null){
				aList=new ArrayList<EmpVO_p>();
				
				while (rsRs.next()){
					EmpVO_p _evo=new EmpVO_p();
					_evo.setEmpno(rsRs.getNString("EMPNO"));
					_evo.setEname(rsRs.getString("ENAME"));
					_evo.setJob(rsRs.getString("JOB"));
					_evo.setMgr(rsRs.getString("MGR"));
					_evo.setHiredate(rsRs.getString("HIREDATE"));
					
					aList.add(_evo);
				}
			}	
		}catch(Exception e){
			System.out.println(e);
		}
		
		return aList;
	}

	public static void main(String[] args) throws ParseException{
		OracleTest_p11 ot11=new OracleTest_p11();
		
		System.out.println("�˻��� ��¥�� �Է��Ͻÿ�. >>> : ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String fromdate=sc.next();
		System.out.println("�˻��� from ��¥ >>> : "+fromdate);
		String todate=sc.next();
		System.out.println("�˻��� to ��¥ >>> : "+todate);
		
		//==================================================
		SimpleDateFormat sDate=new SimpleDateFormat("yyyy/MM/dd");
		Date fromDate=sDate.parse(fromdate);
		Date toDate=sDate.parse(todate);
		long f=fromDate.getTime();
		long t=toDate.getTime();
		System.out.println("fromDate >>> : "+f);
		System.out.println("toDate >>> : "+t);
		
		
		//================================================
		// �Ʒ� ��ƾ �����ϱ�
		// from�� to ���� ũ�� ������ ������� �ʰ� �Ѵ�.
		boolean bool=f>t;
		// System.out.println("FROM ��¥�� TO ��¥���� ũ�� �� �˴ϴ�. >>> : "+bool);
		// System.out.println("���α׷��� �����մϴ�. �ٽ� �����ؼ� ����Ͻÿ�. >>> : ");
		if (bool) return;
		
		//==================================================
		
		EmpVO_p evo=null;
		evo=new EmpVO_p();
		evo.setFromdate(fromdate);
		evo.setTodate(todate);
		
		ArrayList<EmpVO_p> aList=ot11.empSelect(evo);
		
		if (aList != null && aList.size() > 0){
			for(int i=0; i<aList.size(); i++){
				EmpVO_p _evo=aList.get(i);
				System.out.print(_evo.getEmpno()+" : ");
				System.out.print(_evo.getEname()+" : ");
				System.out.print(_evo.getMgr()+" : ");
				System.out.println(_evo.getHiredate());
				System.out.println();
			}
		}
	}

}

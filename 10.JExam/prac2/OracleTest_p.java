package a.b.c.prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class OracleTest_p {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(""+Class.forName("oracle.jdbc.driver.OracleDriver"));
			// class oracle.jdbc.driver.OracleDriver
			// 1. ù ��° ���ο��� ojdbc6.jar ���� oracle.jdbc.driver.OracleDriver Ŭ������ ã�Ƽ�, �޸𸮿� �÷� ���´�.
			
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclYYS00","scott","tiger");
			System.out.println("conn >>> : "+conn);
			// 2. �� ��° ���ο��� java.sql.Connection �������̽���
			// 	    ����ؼ� Oracle Vender���� jdbc ����̹��� ����� ������ ������
			// 	  oracle.jdbc.driver.T4CConnection@5fa7e7ff Ŭ������
			//    �츮�� ������ datasource ���������� ������ OracleTest Ŭ������
			// 	  orclYYS00.scott ������ ������ �Ѵ�. (+��й�ȣ)
			// 	    ��  ��ü(�ڹ��̸��� �����ͺ��̽�)�� ������ �Ǹ� �ڵ�Ŀ��(auto commit)���� ������ ������ �ȴ�.

			// jdbc:oracle�� ������ ���� ���� ������
			// �ѱ������� jdbc:oracle:thin:@localhost: �� ����Ѵ�.
			
			// conn >>> : oracle.jdbc.driver.T4CConnection@5fa7e7ff
			
			
			Statement stmt=conn.createStatement();
			System.out.println("stmt >>> : "+stmt);
			// 3. �� ��° ���ο��� java.sql.Statement �� ����� 
			// 	  oracle.jdbc.driver.OracleStatementWrapper@6adca536
			// 	    ����Ŭ ���� ����ü Ŭ������ createStatement() �Լ��� ����� ������
			// 	    ���ڿ��� ������ ����Ŭ �����ͺ��̽��� (localhost:1521:orclYYS00","scott","tiger")�����Ѵ�.
			
			// stmt >>> : oracle.jdbc.driver.OracleStatementWrapper@6adca536
			
			// ���������� ���� ����Ʈ�� executQuery() �Լ��̴�.
			ResultSet rsRs=stmt.executeQuery("SELECT*FROM EMP ORDER BY 1 DESC");
			System.out.println("rsRs >>> : "+rsRs);
			// 4. �׹�° ���ο��� ����Ŭ �����ͺ��̽��� ���޵� �������� ����Ŭ Optimizer�� ������ �ؼ� ����� �߻��� �Ǹ�
			// 	  oracle.jdbc.driver.OracleStatementWrapper@6adca536 ��ü �߻��� �����
			// 	  java.sql.ResultSet �������̽��� ����� ����Ŭ ���� ����ü Ŭ����
			// 	  oracle.jdbc.driver.OracleResultSetImpl@1134affc ����� �޴´�.
			//	   �� ����� ���������� �޸� ������ ������ �ִ�.
			

			
			// rsRs >>> : oracle.jdbc.driver.OracleResultSetImpl@1134affc
			
			while(rsRs.next()){
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
			System.out.println("error >>> : "+e);
		}
	}
}

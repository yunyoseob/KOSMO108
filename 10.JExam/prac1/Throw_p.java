package a.b.c.prac1;

public class Throw_p {

	public static void main(String[] args) {
		try {
			throw new Exception("\n 1. throw new Exception���� ���� �޽���");
			/*
			 * Exception e = new Exception("throw new Exception���� ���� �޽���");
			 * throw e;
			 * 
			 * �� ���� �ǹ���.
			 * */
		}catch(Exception er){
			// 1st ���
			System.out.println("\n 2. er >>> : "+er);
			// er >>> : java.lang.Exception: throw new Exception���� ���� �޽���
			// 1. throw new Exception���� ���� �޽���
			
			// 2nd ���
			System.out.println("\n 3. er.getMessage() >>> : "+er.getMessage());
			//  3. er.getMessage() >>> : 
			//  1. throw new Exception���� ���� �޽���
			
			// 3rd ���
			// log ���� Ȯ���ϴ� ����ε�, ���� �������� ����
			// �ʹ� ���� ������ ��µǹǷ�, ����� �����Ѵ�.
			// er.printStackTrace();	
			/*
			 * java.lang.Exception: 
 			 *	1. throw new Exception���� ���� �޽���
			 *	at a.b.c.prac1.Throw_p.main(Throw_p.java:7)
			 * 
			 * */
		}
		System.out.println("\n 4. try-catch �� ��!");
	}

}

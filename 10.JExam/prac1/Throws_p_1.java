package a.b.c.prac1;

public class Throws_p_1 {
	int aM() throws Exception{
		// throws Exception ��������
		int z = bM();
		return z;
	}
	int bM() throws Exception{
		int z=0;
		z=1/0;
		return z;
	}

	public static void main(String[] args) {
		Throws_p_1 tp=new Throws_p_1();
		
		try {
			 int z = tp.aM();
		/*
		 * try~catch���� �������� �ʰ� throws Exception
		 * �� ����� ��� ������ ���� ������ ��Ÿ����.
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 *	Unhandled exception type Exception
		 *
		 *	at a.b.c.prac1.Throws_p_1.main(Throws_p_1.java:16)
		 * */
			 System.out.println("z >>> : "+z);
		}catch(Exception e){
			// () �Ұ�ȣ �ȿ� Exception e �� ������
			/*
			 * Syntax error on token "(", 
			 * FormalParameter expected after this token
			 * e cannot be resolved to a variable
			 * */
			System.out.println("������ e >>> : "+e);
			// ������ e >>> : java.lang.ArithmeticException: / by zero
		}
		System.out.println("\n try~catch�� ��");
	} // main method
} // Throws_p_1 class

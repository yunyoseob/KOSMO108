package a.b.c.prac1;

public class Exception_p3 {

	public static void main(String[] args) {
		/*
		 * Exception Ŭ������ ��� Except Ŭ������ 
		 * �ֻ��� Ŭ�����̴�.
		 * 
		 * ���� � ������ ������ Ȯ���غ����� ����.
		 * 
		 * ���� ���̽� 1 : {args0 : 2}, {args1 : 1}
		 * x/y = 2�� ���� ���
		 * 
		 * ���� ���̽� 2 : {args0 : 1}, {args1 : 2}
		 * x/y = 0 ���� ���
		 * 
		 * ���� ���̽� 3 : {args0 : 2.5}, {args1: 1.5}
		 * Exception :: ���� �α� ��� >>> : java.lang.NumberFormatException: For input string: "2.5"
		 * 2.5�� parseInt �Ұ� >>>  NumberFormatException�� ��� �ȴ�.
		 * 
		 * ���� ���̽� 4 : {args0 : 2}, {args1 : zero}
		 * ����������, zero�� parseInt �Ұ�  >>> java.lang.NumberFormatException: For input string: "zero"
		 *  
		 * ���� ���̽� 5 : {args0 : 2}, {args1 : ��}
		 * ����������, ���� parseInt �Ұ� >>> java.lang.NumberFormatException: For input string: "��"
		 * 
		 * ���� ���̽� 6 : �ƹ����� ���� �ʱ�
		 * �ƹ� ���� ������ ���� >>> java.lang.ArrayIndexOutOfBoundsException: 0
		 * 
		 * ���� ���̽� 7 : {args0 : 2}, {args1 : 0}
		 * �и� 0�� ���� �� ���� >>> java.lang.ArithmeticException: / by zero
		 * runtime error
		 * 
		 * ���� ���̽� 8 : {args0 : 0}, {args1 : 2}
		 * x/y=0 ���������� �� ��� ��.
		 * 
		 * ���� ���̽� 9 : {args0 : -5}, {args1: -7}
		 * x/y=0 ���� ��µ�.
		 * 
		 * ���� ���̽� 10 : {args0 : -10}, {args1 : 5}
		 * x/y=-2���� �� ��µ�.
		 * 
		 * 10���� ���� ���̽� ����
		 * finally finish�� try~catch~finally finish�� �� ��� �Ǵ� ���� Ȯ�� �� �� �ִ�.
		 */
		try {
			String args0=args[0];
			String args1=args[1];
			
			int x=Integer.parseInt(args0);
			int y=Integer.parseInt(args1);
			
			int z = x/y;
			System.out.println("x/y = "+z);
		}catch(Exception e){
			// Exception�� Except�� �־ �ֻ��� Ŭ����
			// Throwable�� Error�� Exception Ŭ������ �θ�
			System.out.println("\n Exception :: ���� �α� ��� >>> : "+e);
		}finally{
			System.out.println("\n finally finish");
		}
		System.out.println("\n try~catch~finally finish");
	}

}

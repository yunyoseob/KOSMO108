package a.b.c.ch1;

public class Exam_Limit {

	public static void main(String args[]) {

		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;

		/*
			System : java.lang.System Ŭ������ ����
					 System Ŭ���� �ڹٿ��� �ý��ۿ� ���õ� ����� ��Ƶ� Ŭ���� 
					 System Ŭ������ �׳� ����� �� �ִ� ������ 
					 Ŭ������ final Ŭ���� �̱� �����̴�. 
			. : ��ũ ������ : System Ŭ������  out �ʵ带 �����ϴ� �������̴�. 
			out : System Ŭ������ �ִ� ������ ��Ʈ��(�ƿ� ��)�� ����ϴ� ��� ��Ȱ�� �ϴ� ���� 
			. : out �ʵ�� println() �Լ��� �����ϴ� ��ũ ������ 
			println() : �ֿܼ� ����� �ϴ� �Լ� �̴�.
						print :  ����Ͻÿ�
						ln : ������ �ϳ� ��켼�� 		
		*/
		// println() �Լ��� �ƱԸ�Ʈ�� �ִ� �����͸� �ֿܼ� ��� �Ͻÿ� 
		System.out.println("intMax >>> : " + intMax);
		System.out.println("longMax >>> : " + longMax);

		/*
		int num1 = 9223372036854775807;
		System.out.println("int num1 >>> : " + num1);		

		long num2 = 9223372036854775807;		
		System.out.println("long num2 >>> : " + num2);
		*/
		/*
		C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_Limit.java
		Exam_Limit.java:14: error: integer number too large: 9223372036854775807
						int num1 = 9223372036854775807;
								   ^
		Exam_Limit.java:17: error: integer number too large: 9223372036854775807
						long num2 = 9223372036854775807;
									^
		2 errors
		*/
		
		long num3 = 9223372036854775807L;		
		System.out.println("long num3 >>> : " + num3);

		long num4 = 9223372036854775807l;		
		System.out.println("long num4 >>> : " + num4);
	}
}
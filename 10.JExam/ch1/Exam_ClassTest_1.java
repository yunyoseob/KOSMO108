package a.b.c.ch1;


public class Exam_ClassTest_1 {

	// ��� ���� 
	byte bVal;
	char cVal;
	short sVal;
	int iVal;
	long lVal;
	float fVal;
	double dVal;
	boolean boolVal;
	String strVal;

	public static void main(String args[]) {
		/*
		1.	Exam_ClassTest_1 Ŭ������ ����Ϸ��� �� ���� Exam_ClassTest_1 �� �ν��Ͻ� instance �ؾ� �Ѵ�. 
		2.	instanc �ν��Ͻ� : Ŭ������ �޸𸮿� �ø��� ���� : ���� ��ǥ���� ������ new Ű���� ������ 
		3.	new Ű���� (������)�� �ν��Ͻ� �ϴ� ���(�޸𸮿� �ø��� ���)
			3.1		����Ϸ����ϴ� Ŭ����(��Ʈ�� Ŭ����rt.jar�� �ִ� Ŭ����, ��������� Ŭ����)�� Ŭ���� �̸����� �����Ѵ�.
			3.2		�������� reference variable �� �����Ѵ�.
					�� �������� �޸𸮿� �ö� Ŭ������ �����ؼ� 
					Ŭ���� ���� ������ ����, �Լ��� ��������.(��Ʈ������) �� �̿��ؼ� ����� �� �ִ�. 
			3.3		= ���� ������ ����
			3.4		Ŭ���� �̸� �� () �Ұ�ȣ�� �ٿ��� �����ڸ� �����.
					===================================================
					�����ڰ� �޸𸮿� �ö󰡸�(�ν��Ͻ� �Ǹ�) 
					�ش� Ŭ������ �ִ� ��������� ����Ʈ ������ �ʱ�ȭ �Ѵ�. 
					===================================================
			Ŭ�����̸� �������� = new Ŭ�����̸�(); 
			Ŭ�����̸�() <--- �� ���� �����ڶ�� �Ѵ�. 
							�� �����ڰ� �ش� Ŭ���� ���ο� ������ ��������� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		*/

		Exam_ClassTest_1 ec = new Exam_ClassTest_1();
		System.out.println("ec �������� �ּҰ� >>> : " + ec);
		System.out.println("ec.bVal >>> : " + ec.bVal);
		System.out.println("ec.cVal >>> : " + ec.cVal);
		System.out.println("ec.sVal >>> : " + ec.sVal);
		System.out.println("ec.iVal >>> : " + ec.iVal);
		System.out.println("ec.lVal >>> : " + ec.lVal);
		System.out.println("ec.fVal >>> : " + ec.fVal);
		System.out.println("ec.dVal >>> : " + ec.dVal);
		System.out.println("ec.boolVal >>> : " + ec.boolVal);
		System.out.println("ec.strVal >>> : " + ec.strVal);
	} // end of mai()
} // end of Exam_ClassTest 
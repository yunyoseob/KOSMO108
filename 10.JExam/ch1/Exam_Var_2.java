package a.b.c.ch1;

// �Լ� �ȿ��� ����ϴ� ������ ��ȿ ����
// �Լ����� �����ϴ� ������  
// {} �߰�ȣ ������ �����ϰ� {} �߰�ȣ ������ ����ؾ� �Ѵ�. 
public class Exam_Var_2 {

	// ���� �Լ� �ܼ� ���ø����̼��� �������̴�. 
	public static void main(String args[]) {
		System.out.println("Exam_Var_2.main() �Լ� ����");
		System.out.println("��������Ʈ ������� ���� �ȴ�. ");
		System.out.println("main() �Լ� �� ���� ���� ������ 80�÷� �������� ����ȴ�.");

		// ������ �����ϰ� �ʱ�ȭ �ߴ�.
		// ������ ������ i �� ��ȿ ������(����� �� �ִ� ����)
		// i ������ ���� ���κ��� main �Լ� ���� ���� ���α��� ��ȿ�ϴ�.
		// System.out.println(">>> : " + i);

		int i = 10;

		System.out.println(">>> : " + i);
		
		// �̸��� ����(�͸�) ���� ���� �ߴ�.
		{
			int ii = 1000;
			System.out.println(">>> : " + ii);
			System.out.println("{} �ȿ��� >>> : " + i);
			i = 101;
		}
		/*
		System.out.println(">>> : " + ii);
		C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_Var_2.java
		Exam_Var_2.java:23: error: cannot find symbol
						System.out.println(">>> : " + ii);
													  ^
		  symbol:   variable ii
		  location: class Exam_Var_2
		1 error
		*/
		System.out.println(">>> : " + i);
	} // end of main()
} // end of Exam_Var_2 class
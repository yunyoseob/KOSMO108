package a.b.c.ch1;


public class Exam_ClassTest {

	// ��� ���� 
	int iVal;

	// ����ƽ ����, Ŭ���� ���� 
	// static Ű���尡 ���� ������ 
	// ������ �� �ڹ� ��ö�ӽ�(JVM)�� �ش� ������ ���� �ʱ�ȭ ���ش�.
	static int iValStatic;

	// void : ���ϰ��� ���� : return Ű���带 ����� �� ����.
	public static void main(String args[]) {
		System.out.println("main() �Լ��� �ܼ־��ø����̼� �������̴�.");
		System.out.println("�Լ� ���ȿ����� ��������Ʈ ������� ����ȴ�.");

		// �Լ� �� ���ο��� ������ ���� �����̴�.
		// ���� ������ ����ϱ� ���� ������ �ʱ�ȭ�� �Ǿ� �־�� �Ѵ�. 
		int i = 10;
		System.out.println("i >>> : " + i);

		// static ���� ȣ���ϱ� 
		System.out.println("iValStatic >>> : " + iValStatic);
		
		// System.out.println("iVal >>> : " + iVal);
		/*
		C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_ClassTest.java
		Exam_ClassTest.java:17: error: non-static variable iVal cannot be referenced from a static context
                System.out.println("iVal >>> : " + iVal);
                                                   ^
		1 error
		*/

		// static Ű���尡 ���� ���� iVal ��� ���� ����
		// iVal ��������� �޸𸮿� �÷��� �Ѵ�. 
		Exam_ClassTest ec = new Exam_ClassTest();
		System.out.println("Exam_ClassTest ��������� Ŭ������ ����(��������) ec >>> : \n" + ec);
		System.out.println("ec.iVal >>> : " + ec.iVal);

		Exam_ClassTest ec_1 = new Exam_ClassTest();
		System.out.println("Exam_ClassTest ��������� Ŭ������ ����(��������) ec_1 >>> : \n" + ec_1);
		System.out.println("ec_1.iVal >>> : " + ec_1.iVal);

		System.out.println(  "����ƽ������ ���������� �����ؼ� ����ϸ� �ʵȴ�. \n"
						   + "ec_1.iValStatic >>> : " + ec_1.iValStatic);
	} // end of mai()
} // end of Exam_ClassTest 
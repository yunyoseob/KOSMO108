package a.b.c.ch1;

public class Exam_ClassTest_2 {

	// ��� ����
	// ���
	public static final int ID_NUM = 1;
	// ����ƽ ����, Ŭ���� ����
	static int id_val = 11;
	// ���� ����
	public int iVal_G;
	// ��� ����
	int iVal;

	// �������� ���� �Լ�, static ���� �Լ�
	public void aMethod(){
		System.out.println("aMethod()");
	}

	// �������� ���� �Լ�, static �ִ� �Լ�
	public static void aaMethod(){
		System.out.println("aaMethod()");
	}

	// ������ int, static ���� �Լ� 
	public int bMethod(){
		System.out.println("bMethod()");
		return 1 + 1;
	}

	// ������ int, static �ִ� �Լ� 
	public static int bbMethod(){
		System.out.println("bbMethod()");
		return 10 + 10;
	}

	
	public static void main(String args[]) {
		
		// static �ִ� �ڿ�(����, �Լ�) ȣ���ϴ� ���
		// ��Ű����.Ŭ�����̸�.�ڿ��̸� 
		System.out.println("Exam_ClassTest_2.ID_NUM >>> : " + Exam_ClassTest_2.ID_NUM + "\n");
		System.out.println("Exam_ClassTest_2.id_val >>> : " + Exam_ClassTest_2.id_val + "\n");
		
		// println() �Լ��� void ������ �Լ�(���ϰ��� ���� �Լ�)�� ����� �� ����. 
		// System.out.println("Exam_ClassTest_2.aaMethod() >>> : " + Exam_ClassTest_2.aaMethod());
		// Exam_ClassTest_2.java:44: error: 'void' type not allowed here
        //        System.out.println("Exam_ClassTest_2.aaMethod() >>> : " + Exam_ClassTest_2.aaMethod());
        //                           ^
		// 1 error
		
		//void ������ �Լ�(���ϰ��� ���� �Լ�)�� �ϱ�� ���� �Լ��� ȣ���ؼ� ����Ѵ�.
		Exam_ClassTest_2.aaMethod();
		
		// �������� �ִ� �Լ��� println() �Լ� ���� ����� �����Ѵ�. 
		System.out.println("\n Exam_ClassTest_2.bbMethod() >>> : " + Exam_ClassTest_2.bbMethod() + "\n");
		
		// �������� �ִ� �Լ��� ���� ���� �޾Ƽ� ����ص� �ȴ�.
		int iBB = Exam_ClassTest_2.bbMethod();
		System.out.println("\n iBB >>> : " + iBB + "\n");

		Exam_ClassTest_2 ec2 = new Exam_ClassTest_2();
		System.out.println("ec2 �������� �ּҰ� >>> : " + ec2 + "\n");
		System.out.println("ec2.iVal_G >>> : " + ec2.iVal_G + "\n");
		System.out.println("ec2.iVal >>> : " + ec2.iVal + "\n");	
		
		ec2.aMethod();
		
		// �������� �ִ� �Լ��� println() �Լ� ���� ����� �����Ѵ�. 
		System.out.println("\n ec2.bMethod() >>> : " + ec2.bMethod());
		
		// �������� �ִ� �Լ��� ���� ���� �޾Ƽ� ����ص� �ȴ�.
		int iB = ec2.bMethod();
		System.out.println("\n iB >>> : " + iB + "\n");

	} // end of mai()
} // end of Exam_ClassTest 
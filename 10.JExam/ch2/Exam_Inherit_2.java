package a.b.c.ch2;

class Class_�θ� extends java.lang.Object{

	Class_�θ�() {
		System.out.println("Class_�θ�() ������ >>> : ");
	}

	void �θ�_1(){
		System.out.println("Class_�θ�().�θ�_1() �Լ� >>> : ");
	}
} 

class Class_�ڽ� extends Class_�θ�{

	Class_�ڽ�() {
		System.out.println("Class_�ڽ�() ������ >>> : ");
	}

	void �ڽ�_1(){
		System.out.println("Class_�ڽ�().�ڽ�_1() �Լ� >>> : ");
	}

}

public class Exam_Inherit_2 {

	void examIn() {
		System.out.println("Exam_Inherit_2.examIn() �Լ� >>> : ");
	}
	public static void main(String args[]) {
		
		Exam_Inherit_2 ei2 = new Exam_Inherit_2();
		// System.out.println("ei2 �������� >>> : " + ei2);
		// ei2.examIn();

		/*
			Ŭ����(�ڿ�)�� ����Ϸ��� ��Ӱ��迡 �ִ� Ŭ������ �ν��Ͻ� �ߴ�.
			��ü���� ���α׷������� 2�� ����ؾ� �Ѵ�.
			1. �ڽ�Ŭ���� �������� = new �ڽ�Ŭ����();
			2. �θ�Ŭ���� �������� = new �ڽ�Ŭ����();

			3, 4���� ������� �ʴ���.
			3. �θ�Ŭ���� �������� = new �θ�Ŭ����();
			4. �ڽ�Ŭ���� �������� = new �θ�Ŭ����();
		*/

		// �ڽ�Ŭ���� �ڽ�Ŭ����_�������� = new �ڽ�Ŭ����();
		// �ڽ�Ŭ����_���������� �ڽ�Ŭ������ �ִ� �ڿ� �� �θ� Ŭ������ �ִ� �ڿ��� ����� �� �ִ�.
		Class_�ڽ� �ڽ�_1 = new Class_�ڽ�();
		System.out.println("�ڽ�_1 �������� �ּҰ� >>> : " + �ڽ�_1);
		�ڽ�_1.�ڽ�_1();
		�ڽ�_1.�θ�_1();
		System.out.println("=======================\n");


		// �θ�Ŭ���� �θ�Ŭ����_�������� = new �ڽ�Ŭ����();
		// �θ�Ŭ����_���������δ� �ڱ��ڽ� Ŭ������ �ڿ��� ����� �����ϴ�. 
		Class_�θ� �θ�_1 = new Class_�ڽ�();
		System.out.println("�θ�_1 �������� �ּҰ� >>> : " + �θ�_1);
		�θ�_1.�θ�_1();
		�θ�_1.�ڽ�_1();
	}
}
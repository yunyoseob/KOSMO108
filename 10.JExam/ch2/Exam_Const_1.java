package a.b.c.ch2;

/*
this	�� Ű����	
		�ڱ� �ڽ� Ŭ������ ����Ų��.
		this.getClass().getName();
this()	�� �Լ�
		�ڱ� Ŭ�������� �����ε��� �����ڸ� ����ų �� (ȣ���� ��) ����Ѵ�.
*/
public class Exam_Const_1 {

	String s;
	int i;

	// ���α׷��Ӱ� �⺻ �����ڸ� �ҽ� �ڵ忡 �ۼ��ߴ�.
	public Exam_Const_1() {
		// this("�迵��", 22);
		System.out.println("Exam_Const_1() ������ >>> : ");
		System.out.println("Exam_Const_1() ������ >>> s ::: " + s);
		System.out.println("Exam_Const_1() ������ >>> i ::: " + i);
	}

	public Exam_Const_1(String s, int i) {
		/*
				this() :	�� �Լ��� ������ �� �ȿ��� �� ù ��° �������� ���� �Ǿ�� �Ѵ�.
			 				�� �Լ��� ������ �� �ȿ��� ����Ѵ�.
							Ŭ���� ���ο� �����ε�Ǿ� overload ����� �����ڸ� ȣ���Ѵ�.
				constructor overloading	:	�������� �ñ״�ó signature �� ���� �Ű������� �ٸ� �� 
				�Լ��� �ñ״�ó		: ���������� ������ ������ �Լ��̸� 
									[public | protected | default | private]
									[static | final]
									[void | �������ڷ���]
									�Լ��̸� 
									(�Ű�����)
				������ �����ε�		: 
				�Լ� �����ε�	: 
		*/
		// System.out.println("Exam_Const_1(String s, int i) ������ >>> : ");
		this();
		/*
		C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_Const_1.java
		Exam_Const_1.java:21: error: call to this must be first statement in constructor
						this();
							^
		1 error
		*/
		System.out.println("Exam_Const_1(String s, int i) ������ >>> : ");
		System.out.println("Exam_Const_1(String s, int i) ������ >>> s ::: " + s);
		System.out.println("Exam_Const_1(String s, int i) ������ >>> i ::: " + i);
		System.out.println("Exam_Const_1(String s, int i) ������ >>> this.s ::: " + this.s);
		System.out.println("Exam_Const_1(String s, int i) ������ >>> this.i ::: " + this.i);
		this.s = s;
		this.i = i;
		System.out.println("Exam_Const_1(String s, int i) ������ >>> this.s ::: " + this.s);
		System.out.println("Exam_Const_1(String s, int i) ������ >>> this.i ::: " + this.i);

	}

	// �Ű������� 2�� �ִ� ������
	public static void main(String args[]) {
	
		/*
			1. Exam_Const_1 : ��������� Ŭ���� Exam_Const_1 �� ����ϱ� ���ؼ� ���� �ߴ�.
			2. ec	: ������ Exam_Const_1 Ŭ������ ����ϱ� ���ؼ� �������� ec �� ���� �ߴ�.
			3. =	: ���� ������
			4. new	: �� Ű����, �� �ν��Ͻ�������, �� ������ 
					: new Ű���� �ڿ����� ������ = Ŭ�����̸� + () �޸𸮿� �÷��ּ��� 
					: �޸𸮿� �ø��� ���� �ڹ� ��ö�ӽ��̴�.
			5. Exam_Const_1()	:	������ �̴�. 
								:	�ν��Ͻ��ϴ� Ŭ������ ��������� �ʱ�ȭ �Ѵ�.
								:	default value �Ǵ� �������� �μ��� �ִ� ���� ������ �ʱ�ȭ �Ѵ�.
			6. Exam_Const_1() �����ڴ� Exam_Const_1 �ҽ� �ڵ忡�� �ۼ���
				public Exam_Const_1() {} �⺻ �����ڸ� ȣ���Ѵ�.
				��� �ʵ忡 ����� String s, int i �� default value �� �ʱ�ȭ �Ѵ�.
		*/
		Exam_Const_1 ec = new Exam_Const_1();

		// �ҽ� �ڵ�󿡼� �Ű������� 2�� �ִ� �����ڸ� ȣ���Ѵ�. 
		// public Exam_Const_1(String s, int i) {} �����ڸ� ȣ���Ѵ�.
		Exam_Const_1 ec_1 = new Exam_Const_1("������", 26);

	}
}

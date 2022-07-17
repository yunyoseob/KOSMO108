package a.b.c.ch2;

/*
������ : Constructor
�������� ���

Ŭ�����̸�(){

}

�����ڴ� Ŭ������ �޸𸮿� �ø��� �ڹ� ��ö�ӽ��� ����ϴ� �Լ���
�ڹ� �ҽ��� ������ �ڵ� ���� ������ �� �����ڸ� ����ϰ�
�ڹ� �ҽ��� �������� �ڵ� ���� ������ jvm �����ڰ� ���� ����Ѵ�.
*/

// .java ���� �ҽ��� Ŭ������ �� �� �̻��� ����
// main �Լ��� �ִ� Ŭ������ Ŭ���� Ű���� �տ� public Ű���带 ���̰�
// �����̸��� main �Լ��� �ִ� Ŭ���� �̸����� �����Ѵ�.

class Const_p{
	String s;
	int i;
}

public class Object_p_2{	
	// ����1 : �����ڰ� ���� ���

	/* ����2 : �Ű������� ���� �⺻ ������ �����
	Object_p_2() {
		System.out.println("�Ű������� ���� �⺻ ������");
	}
	*/

	/* ����3 : �Ű������� �ִ� �⺻ ������ �����
	Object_p_2(String s) {
		System.out.println("�Ű������� �ִ� �⺻ ������ \n");
		System.out.println("Object_p_2(String s)�� s >>> : "+s);
	}
	*/



	public static void main(String args[]){

		// ����1 : �����ڰ� ���� ���
		// System.out.println("Hello Java");

		/*
		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		public a.b.c.ch2.Object_p_2();
		public static void main(java.lang.String[]);
		}
		javap ���������� �غ��� �⺻�����ڸ� JVM�� �����Ͽ���.
		jvm�� �⺻�����ڸ� ���� ����ʵ带 �ʱ�ȭ �Ѵ�.
		*/

		// Object_p_2 rv = new Object_p_2();
		// System.out.println("�������� �ּҰ� >>> : "+rv);
		// �����ڰ� ������ �Ǹ鼭 "�Ű������� ���� �⺻ ������"�� ��µȴ�.
		// �������� �ּҰ��� ��µ�.

		/*
		public class a.b.c.ch2.Object_p_2 {
			java.lang.String s;
			int i;
			a.b.c.ch2.Object_p_2();
			public static void main(java.lang.String[]);
			}
		 javap ���������� �غ��� ���������� �⺻�����ڰ� ���� ���� Ȯ�� �� �� �ִ�.
		*/

		// Object_p_2 rv = new Object_p_2("����3�� �Ű����� �Է�");
		// System.out.println(" ����3�� �������� >>> : "+rv);
		/*
		�Ű������� �ִ� �⺻ ������

		Object_p_2(String s)�� s >>> : ����3�� �Ű����� �Է�
		����3�� �������� >>> : a.b.c.ch2.Object_p_2@15db9742
		*/

		/*
		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		java.lang.String s;
		int i;
		a.b.c.ch2.Object_p_2(java.lang.String);
		public static void main(java.lang.String[]);
		}
		�⺻ �����ڰ� �ƴ� ���ο� ������ �ϳ��� ����.
		*/

		Const_p rv = new Const_p();
		System.out.println("rv �������� �ּҰ� >>> : "+rv);
		System.out.println("rv.s >>> : "+rv.s);
		System.out.println("rv.i >>> : "+rv.i);
		/*
		rv �������� �ּҰ� >>> : a.b.c.ch2.Const_p@15db9742
		rv.s >>> : null
		rv.i >>> : 0

		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		public a.b.c.ch2.Object_p_2();
		public static void main(java.lang.String[]);
		}
		*/

	} // main method
} // Object_p_2 class
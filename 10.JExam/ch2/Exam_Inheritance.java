package a.b.c.ch2;

class A_4 extends java.lang.Object{

	// ������
	A_4(){
		System.out.println("A_4() ������ >>> : ");
	}

	void a_4(){
		System.out.println("A_4().a_4() �Լ� >>> : ");
	}
}

class A_3 extends A_4 {

	// ������
	A_3(){
		System.out.println("A_3() ������ >>> : ");
	}

	void a_3(){
		System.out.println("A_3().a_3() �Լ� >>> : ");
	}
}

class A_2 extends A_3 {

	// ������
	A_2(){
		System.out.println("A_2() ������ >>> : ");
	}

	void a_2(){
		System.out.println("A_2().a_2() �Լ� >>> : ");
	}
}

// A_2 �θ� Ŭ���� , A_1 �ڽ� Ŭ���� 
class A_1 extends A_2 {

	// ������
	A_1(){
		System.out.println("A_1() ������ >>> : ");
	}

	void a_1(){
		System.out.println("A_1().a_1() �Լ� >>> : ");
	}

}

public class Exam_Inheritance {

	public static void main(String args[]) {
	
		Exam_Inheritance ei = new Exam_Inheritance();
		System.out.println("ei �������� �ּҰ� >>> : " + ei);
		//ei.a_1();
		/*
		C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_Inheritance.java
		Exam_Inheritance.java:35: error: cannot find symbol
						ei.a_1();
						  ^
		  symbol:   method a_1()
		  location: variable ei of type
		*/

		/*
		1.	A_1 Ŭ������ ����Ϸ��� Ŭ������ �����Ѵ�.
		2.	�������� a1 �� �����Ѵ�.
		3.	= ���� ������
		4.	new �����ڸ� ���� jvm ������ A_1()�� ã�Ƽ� 
			�ش� ��ü�� �޸� �ø��� A_1() �����ڴ� ��������� �ʱ�ȭ �Ѵ�. 
		5.	A_1() ��ü�� ã�Ƽ� �޸𸮿� �ø������ϴµ� A_2 Ŭ������ ����ϰ� �ִ�.
			class A_1 extends A_2
		6. jvm �� A_1() Ŭ���� �׳� �ΰ� A_2() Ŭ������ �޸𸮿� �ø����� �ϴµ�
			A_3 Ŭ������ ����ϰ� �ִ�.
			class A_2 extends A_3 
		7. jvm �� A_2() Ŭ���� �׳� �ΰ� A_3() Ŭ������ �޸𸮿� �ø����� �ϴµ�
			A_4 Ŭ������ ����ϰ� �ִ�.
			class A_3 extends A_4
		8.	jvam �� A_4 Ŭ������ ã�Ƽ� Default �� ����ϰ� �ִ� java.lang.Object Ŭ������ 
			�޸𸮿� �ø��� �� 
		9. A_4 Ŭ������ ã�Ƽ� �޸𸮿� �ø��� ���������� ��� ���� Ŭ������ �޸𸮿� �ø���.			
		*/
		A_1 a1 = new A_1();
		System.out.println("a1 �������� �ּҰ� >>> : " + a1);
		a1.a_1();
		a1.a_2();
		a1.a_3();
		a1.a_4();
	}
}
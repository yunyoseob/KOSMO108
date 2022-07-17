package a.b.c.ch2;

import a.b.c.ch2.aa.Class_A;

/*
super		���� Ű���� :	��� ���迡 �ִ� �θ� Ŭ������ �ڿ��� ����Ų��.
super()		���� �Լ� :	��� ���迡 �ִ� �θ� Ŭ������ �����ε��� �����ڸ� ����Ų��.
						������ �� ù ��° ���ο����� ����ؾ� �Ѵ�. 

*/
public class Exam_Inherit_1 extends Class_A{


	public Exam_Inherit_1(){
		super();
		System.out.println("Exam_Inherit_1() ������ >>> : " + super.class_a_2());
		// System.out.println("Exam_Inherit_1() ������ >>> : " + super);	
		/*
		C:\00.KOSMO108\10.JExam\ch2>javac -d . E*1.java Class_A.java
		Exam_Inherit_1.java:11: error: '.' expected
                System.out.println("Exam_Inherit_1() ������ >>> : " + super);
		*/
	}

	public Exam_Inherit_1(String s){
		super(s);
		System.out.println("Exam_Inherit_1(String s) ������ >>> : " + s);
	}

	/*
	public String toString(){
		return "Class_A().toString() �Լ� >>> : ";
	}
	*/
	
	@Override
	public String toString(){
		return "Exam_Inherit_1().toString() �Լ� >>> : ";
	}
	
	// ������̼� Annotation
	@Override
	public void class_a_1(){
		// System.out.println("Class_A().class_a_1() �Լ� >>> : ");
		System.out.println("Exam_Inherit_1().class_a_1() �Լ� >>> : ");
	}

	public static void main(String args[]) {

		Exam_Inherit_1 ei1 = new Exam_Inherit_1();
		System.out.println("ei1 �������� �ּҰ� >>> : " + ei1);
		System.out.println("ei1.toString() >>> : " + ei1.toString());
		System.out.println("ei1.getClass().getName() >>> : " + ei1.getClass().getName());		
		ei1.class_a_1();

		Exam_Inherit_1 ei2 = new Exam_Inherit_1("���Ŭ���� >>> : ");
		System.out.println("ei2 �������� �ּҰ� >>> : " + ei2);
	}
}
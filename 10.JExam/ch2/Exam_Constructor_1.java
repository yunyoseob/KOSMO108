package a.b.c.ch2;


public class Exam_Constructor_1 {

	String s;
	int i;

	// �Ű������� ���� �⺻ ������
	Exam_Constructor_1() {
		System.out.println("�� �Ű����� ���� �������̴�.");
	}

	// �Ű������� �ִ� ������
	Exam_Constructor_1(String s) {
		System.out.println("�� �Ű����� �ִ� �������̴�.");
		System.out.println("Exam_Constructor_1(String s) >>> : " + s);
	}

	public static void main(String args[]) {
		
		System.out.println("Hello Java!!");
		Exam_Constructor_1 ec1 = new Exam_Constructor_1();

		Exam_Constructor_1 ec2 = new Exam_Constructor_1("�� ���ڿ��̴�.");
	}
}
/*
C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_Constructor_1
Compiled from "Exam_Constructor_1.java"
public class a.b.c.ch2.Exam_Constructor_1 {
  java.lang.String s;
  int i;
======================================================== 
  a.b.c.ch2.Exam_Constructor_1();

  �ҽ� �ڵ忡 �ִ� �Ű����� ���� �����ڸ� ȣ�� �� ���̴�.
  // �Ű������� ���� �⺻ ������
	Exam_Constructor_1() {
	
	}

======================================================== 
  public static void main(java.lang.String[]);
}

*/
/*
C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_Constructor_1
Compiled from "Exam_Constructor_1.java"
public class a.b.c.ch2.Exam_Constructor_1 {
  java.lang.String s;
  int i;
  a.b.c.ch2.Exam_Constructor_1();
  a.b.c.ch2.Exam_Constructor_1(java.lang.String);
  public static void main(java.lang.String[]);
}

*/